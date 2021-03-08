package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import static extension fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect.*;
import static extension fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect.*;
import static extension fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspect.*;
import static extension fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspect.*;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList
import java.util.Date
import java.util.Timer
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition
import com.cyberbotics.webots.controller.Camera
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction

@Aspect(className=Action)
abstract class ActionAspect {
	protected boolean isStarted = false;
	protected int timeWasted = 0;
	
	@Step
	def boolean execute(PolyCreateControler controler) { return false;}
	
	@Step
	def void stop() { _self.isStarted = false;}
}

@Aspect(className=MoveAction)
class MoveActionAspect extends ActionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean execute(PolyCreateControler controler) {
		if (_self.isStarted) {
			System.out.println(_self.timeWasted);
			_self.timeWasted(_self.timeWasted + controler.timestep);
			if (_self.timeWasted > (_self.duration * 1000)) {
				_self.isStarted = false;
				System.out.println("end");
				return true;
			}
			controler.step(controler.timestep);
		} else {
			_self.timeWasted = 0;
			_self.isStarted = true;
			if (_self.direction == DIRECTION.BACKWARD) {
			controler.goBackward();
			}
			if (_self.direction == DIRECTION.FORWARD) {
				controler.goForward();
			}
			controler.step(controler.timestep);
		}
		return false;
	}
}

@Aspect(className=TurnAction)
class TurnActionAspect extends ActionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean execute(PolyCreateControler controler) {
		if (_self.isStarted) {
			_self.timeWasted(_self.timeWasted + controler.timestep);
			if (_self.timeWasted > (_self.duration * 1000)) {
				_self.isStarted = false;
				System.out.println("end");
				return true;
			}
		} else {
			_self.timeWasted = 0;
			_self.isStarted = true;
			controler.turn(Math.PI * (_self.angle / 180));
			controler.step(controler.timestep);
		}
		return false;
	}
}

@Aspect(className=GripAction)
class GripActionAspect extends ActionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean execute(PolyCreateControler controler) {
		switch(_self.state) {
			case OPEN:
				controler.openGripper()
			case CLOSED:
				controler.closeGripper()
		}
		return true;
	}
}

@Aspect(className=Condition)
abstract class ConditionAspect {	
	@Step
	def boolean checkCondition(PolyCreateControler controler) {
		return false;
	}
}

@Aspect(className=SimpleCondition)
class SimpleConditionAspect extends ConditionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean checkCondition(PolyCreateControler controler) {
		switch(_self.detectionType) {
			case CLIFF_FRONT:
				return controler.isThereCliffAtFront()
			
			case CLIFF_LEFT:
				return controler.isThereCliffAtLeft()
				
			case CLIFF_RIGHT:
				return controler.isThereCliffAtRight()
			
			case COLLISION_LEFT:
				return controler.isThereCollisionAtLeft()
			
			case COLLISION_RIGHT:
				return controler.isThereCollisionAtRight()
				
			case VIRTUAL_WALL:
				return controler.isThereVirtualwall()
		
			default: return true
		}
	}
}

@Aspect(className=ObjectCondition)
abstract class ObjectConditionAspect extends ConditionAspect {
	protected Camera camera;
	
	@Step
	@OverrideAspectMethod
	def boolean checkCondition(PolyCreateControler controler) {
		return false;
	}
}

@Aspect(className=AngleCondition)
class AngleConditionAspect extends ObjectConditionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean checkCondition(PolyCreateControler controler) {
		if (_self.cameraType == CAMERATYPE.FRONT) {
			_self.camera = controler.frontCamera;
		} else {
			_self.camera = controler.backCamera;
		}
		
		
		var backObjs = _self.camera.getCameraRecognitionObjects();
		if (backObjs.length > 0) {
			var obj = backObjs.get(0);
			var backObjPos = obj.getPosition();
	
			
			var rad = Math.atan2(backObjPos.get(0), backObjPos.get(1));
			var angle = rad * (180 / Math.PI);
			angle = angle + 180;	
			
			switch(_self.operator) {
				case INFERIOR:
					return angle < _self.angle
				case SUPERIOR:
					return angle > _self.angle
				default:
					return false
			}		
		}
		
		return false;
	}
}

@Aspect(className=DistanceCondition)
class DistanceConditionAspect extends ObjectConditionAspect {
	
	@Step
	@OverrideAspectMethod
	def boolean checkCondition(PolyCreateControler controler) {
		
		if (_self.cameraType == CAMERATYPE.FRONT) {
			_self.camera = controler.frontCamera;
		} else {
			_self.camera = controler.backCamera;
		}
		
		var backObjs = _self.camera.getCameraRecognitionObjects();
		if (backObjs.length > 0) {

			var distance = controler.getObjectDistanceToGripper(); 

			switch(_self.operator) {
				case INFERIOR:
					return distance < _self.distance
				case SUPERIOR:
					return distance > _self.distance
				default:
					return false
			}
		}
		
		return false;
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	def boolean canTransit(PolyCreateControler controler) {
		for (Condition c : _self.conditions) {
			if (!c.checkCondition(controler)) {
				return false;
			}
		}
		return true;
	}
}

@Aspect(className=State)
class StateAspect {	
	@Step
	def void doActions(PolyCreateControler controler, EList<Transition> globalTransitions) {
		(_self.eContainer() as RobotProgram).currentState = _self;
		
		var index = 0;
		System.out.println("name " +_self.name);
		
		while (index < _self.actions.size) {
			System.out.println("index " + index);
			
			if (_self.actions.get(index).execute(controler)) {
			index += 1;
			}
			
			for (Transition t : globalTransitions) {
				if (t.canTransit(controler)) {
					_self.actions.get(index).stop();
					System.out.println("can transit to " + t.toString());
					t.nextState.doActions(controler, globalTransitions);
					return;
				}
			}
		}
		
		for (Transition t : globalTransitions) {
			if (t.canTransit(controler)) {
				t.nextState.doActions(controler, globalTransitions);
				return;
			}
		}
		
		for (Transition t : _self.transitions) {
			if (t.canTransit(controler)) {
				t.nextState.doActions(controler, globalTransitions);
				return;
			}
		}	
		_self.doActions(controler, globalTransitions);
	}
}

@Aspect(className=RobotProgram)
class RobotProgramAspect {
	PolyCreateControler controler = new PolyCreateControler();
	
	@Step
	@Main
	def void start() {
		_self.currentState = _self.initialState;
		_self.controler.openGripper();
		_self.controler.passiveWait(1);
		_self.initialState.doActions(_self.controler, _self.globalTransitions);
	}
}