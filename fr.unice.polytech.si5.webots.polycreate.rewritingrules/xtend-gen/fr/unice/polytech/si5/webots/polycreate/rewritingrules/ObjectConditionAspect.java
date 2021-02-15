package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.Camera;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = ObjectCondition.class)
@SuppressWarnings("all")
public abstract class ObjectConditionAspect extends ConditionAspect {
  @Step
  @OverrideAspectMethod
  public static boolean checkCondition(final ObjectCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "ObjectCondition", "checkCondition");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static Camera camera(final ObjectCondition _self) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Camera camera()
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect._privk3_camera(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition)_self);
    };
    return (com.cyberbotics.webots.controller.Camera)result;
  }
  
  protected static void camera(final ObjectCondition _self, final Camera camera) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void camera(Camera)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect._privk3_camera(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition)_self,camera);
    };
  }
  
  private static boolean super_checkCondition(final ObjectCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect._privk3_checkCondition(_self_, _self,controler);
  }
  
  protected static boolean _privk3_checkCondition(final ObjectConditionAspectObjectConditionAspectProperties _self_, final ObjectCondition _self, final PolyCreateControler controler) {
    return false;
  }
  
  protected static Camera _privk3_camera(final ObjectConditionAspectObjectConditionAspectProperties _self_, final ObjectCondition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCamera") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (com.cyberbotics.webots.controller.Camera) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.camera;
  }
  
  protected static void _privk3_camera(final ObjectConditionAspectObjectConditionAspectProperties _self_, final ObjectCondition _self, final Camera camera) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCamera")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, camera);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.camera = camera;
    }
  }
}
