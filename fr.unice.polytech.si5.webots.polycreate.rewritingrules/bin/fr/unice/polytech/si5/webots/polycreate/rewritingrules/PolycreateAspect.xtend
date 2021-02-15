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

@Aspect(className=Action)
abstract class ActionAspect {
	protected Timer timer;
	
	@Step
	def void execute(PolyCreateControler controler) {}
}

@Aspect(className=MoveAction)
class MoveActionAspect extends ActionAspect {
	
	@Step
	@OverrideAspectMethod
	def void execute(PolyCreateControler controler) {
		if (_self.direction == DIRECTION.BACKWARD) {
			controler.goBackward();
		}
		if (_self.direction == DIRECTION.FORWARD) {
			controler.goForward();
		}
		
		controler.passiveWait(_self.duration);
	}
}

@Aspect(className=TurnAction)
class TurnActionAspect extends ActionAspect {
	
	@Step
	@OverrideAspectMethod
	def void execute(PolyCreateControler controler) {
		controler.turn(Math.PI * (_self.angle / 180));
		controler.passiveWait(_self.duration);
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
			
			System.out.println("latitude " + backObjPos.get(0) + " longitude " + backObjPos.get(1));
			
			/*var dLat = backObjPos.get(0) * (Math.PI/180);
			var dLong = backObjPos.get(1) * (Math.PI/180);
			
			var angle = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(0) * Math.cos(dLat) * Math.sin(dLong/2) *
			Math.sin(dLong/2); 
			
			System.out.println("angle " + angle); */
			
			var rad = Math.atan2(backObjPos.get(0), backObjPos.get(1));
			var angle = rad * (180 / Math.PI);
			System.out.println("angle "+ angle);
			
			var distance = 2 * Math.atan2(Math.sqrt(rad), Math.sqrt(1 - rad));
			System.out.println("distance  "+ distance);
			System.out.println("gripper " + controler.objectDistanceToGripper);
			
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
			var obj = backObjs.get(0);
			var backObjPos = obj.getPosition();
			System.out.println("latitude " + backObjPos.get(0) + " longitude " + backObjPos.get(1));
			
			var dLat = backObjPos.get(0) * (Math.PI/180);
			var dLong = backObjPos.get(1) * (Math.PI/180);
			
			var angle = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(0) * Math.cos(dLat) * Math.sin(dLong/2) *
			Math.sin(dLong/2);
			
			System.out.println("angle " + angle);
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
		for (Action c : _self.actions) {
			c.execute(controler);
			controler.passiveWait(0.5);
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
		_self.controler.openGripper();
		_self.initialState.doActions(_self.controler, _self.globalTransitions);
	}
}