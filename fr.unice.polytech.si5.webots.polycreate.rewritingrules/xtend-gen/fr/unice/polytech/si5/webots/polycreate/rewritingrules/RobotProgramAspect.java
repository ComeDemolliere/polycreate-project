package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = RobotProgram.class)
@SuppressWarnings("all")
public class RobotProgramAspect {
  @Step
  @Main
  public static void start(final RobotProgram _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspect._privk3_start(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "RobotProgram", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static PolyCreateControler controler(final RobotProgram _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspect._privk3_controler(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final RobotProgram _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspect._privk3_controler(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram)_self,controler);
    };
  }
  
  protected static void _privk3_start(final RobotProgramAspectRobotProgramAspectProperties _self_, final RobotProgram _self) {
    _self.setCurrentState(_self.getInitialState());
    RobotProgramAspect.controler(_self).openGripper();
    RobotProgramAspect.controler(_self).passiveWait(1);
    StateAspect.doActions(_self.getInitialState(), RobotProgramAspect.controler(_self), _self.getGlobalTransitions());
  }
  
  protected static PolyCreateControler _privk3_controler(final RobotProgramAspectRobotProgramAspectProperties _self_, final RobotProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getControler") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.controler;
  }
  
  protected static void _privk3_controler(final RobotProgramAspectRobotProgramAspectProperties _self_, final RobotProgram _self, final PolyCreateControler controler) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setControler")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, controler);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.controler = controler;
    }
  }
}
