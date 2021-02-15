package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = SimpleCondition.class)
@SuppressWarnings("all")
public class SimpleConditionAspect extends ConditionAspect {
  @Step
  @OverrideAspectMethod
  public static boolean checkCondition(final SimpleCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "SimpleCondition", "checkCondition");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  private static boolean super_checkCondition(final SimpleCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect._privk3_checkCondition(_self_, _self,controler);
  }
  
  protected static boolean _privk3_checkCondition(final SimpleConditionAspectSimpleConditionAspectProperties _self_, final SimpleCondition _self, final PolyCreateControler controler) {
    DETECTION _detectionType = _self.getDetectionType();
    if (_detectionType != null) {
      switch (_detectionType) {
        case CLIFF_FRONT:
          return controler.isThereCliffAtFront();
        case CLIFF_LEFT:
          return controler.isThereCliffAtLeft();
        case CLIFF_RIGHT:
          return controler.isThereCliffAtRight();
        case COLLISION_LEFT:
          return controler.isThereCollisionAtLeft();
        case COLLISION_RIGHT:
          return controler.isThereCollisionAtRight();
        case VIRTUAL_WALL:
          return controler.isThereVirtualwall();
        default:
          return true;
      }
    } else {
      return true;
    }
  }
}
