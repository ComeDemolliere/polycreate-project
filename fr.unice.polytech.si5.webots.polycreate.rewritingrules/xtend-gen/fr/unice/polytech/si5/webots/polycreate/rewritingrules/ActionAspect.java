package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import java.util.Timer;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Step
  public static void execute(final Action _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction){
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction){
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect
		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction){
			fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction)_self,controler);
		} else
		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#void execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect
// #DispatchPointCut_before# void execute(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_execute(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Action", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static Timer timer(final Action _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Timer timer()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_timer(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self);
    };
    return (java.util.Timer)result;
  }
  
  protected static void timer(final Action _self, final Timer timer) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void timer(Timer)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_timer(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self,timer);
    };
  }
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self, final PolyCreateControler controler) {
  }
  
  protected static Timer _privk3_timer(final ActionAspectActionAspectProperties _self_, final Action _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Timer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.timer;
  }
  
  protected static void _privk3_timer(final ActionAspectActionAspectProperties _self_, final Action _self, final Timer timer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTimer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, timer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.timer = timer;
    }
  }
}
