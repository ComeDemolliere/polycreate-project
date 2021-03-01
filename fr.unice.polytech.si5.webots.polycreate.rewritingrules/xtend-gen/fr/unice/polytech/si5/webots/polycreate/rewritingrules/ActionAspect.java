package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Step
  public static boolean execute(final Action _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect.execute((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect#boolean execute(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect
    // #DispatchPointCut_before# boolean execute(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_execute(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Action", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static void stop(final Action _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stop()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_stop(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Action", "stop");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static boolean isStarted(final Action _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isStarted()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_isStarted(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self);
    };
    return (boolean)result;
  }
  
  protected static void isStarted(final Action _self, final boolean isStarted) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStarted(boolean)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_isStarted(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self,isStarted);
    };
  }
  
  protected static int timeWasted(final Action _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int timeWasted()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_timeWasted(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self);
    };
    return (int)result;
  }
  
  protected static void timeWasted(final Action _self, final int timeWasted) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void timeWasted(int)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_timeWasted(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action)_self,timeWasted);
    };
  }
  
  protected static boolean _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self, final PolyCreateControler controler) {
    return false;
  }
  
  protected static void _privk3_stop(final ActionAspectActionAspectProperties _self_, final Action _self) {
    ActionAspect.isStarted(_self, false);
  }
  
  protected static boolean _privk3_isStarted(final ActionAspectActionAspectProperties _self_, final Action _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsStarted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isStarted;
  }
  
  protected static void _privk3_isStarted(final ActionAspectActionAspectProperties _self_, final Action _self, final boolean isStarted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsStarted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isStarted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isStarted = isStarted;
    }
  }
  
  protected static int _privk3_timeWasted(final ActionAspectActionAspectProperties _self_, final Action _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimeWasted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.timeWasted;
  }
  
  protected static void _privk3_timeWasted(final ActionAspectActionAspectProperties _self_, final Action _self, final int timeWasted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTimeWasted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, timeWasted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.timeWasted = timeWasted;
    }
  }
}
