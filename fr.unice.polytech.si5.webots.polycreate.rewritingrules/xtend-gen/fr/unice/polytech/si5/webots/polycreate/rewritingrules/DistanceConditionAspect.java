package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.CameraRecognitionObject;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = DistanceCondition.class)
@SuppressWarnings("all")
public class DistanceConditionAspect extends ObjectConditionAspect {
  @Step
  @OverrideAspectMethod
  public static boolean checkCondition(final DistanceCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "DistanceCondition", "checkCondition");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  private static boolean super_checkCondition(final DistanceCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect._privk3_checkCondition(_self_, _self,controler);
  }
  
  protected static boolean _privk3_checkCondition(final DistanceConditionAspectDistanceConditionAspectProperties _self_, final DistanceCondition _self, final PolyCreateControler controler) {
    CAMERATYPE _cameraType = _self.getCameraType();
    boolean _equals = Objects.equal(_cameraType, CAMERATYPE.FRONT);
    if (_equals) {
      ObjectConditionAspect.camera(_self, controler.frontCamera);
    } else {
      ObjectConditionAspect.camera(_self, controler.backCamera);
    }
    CameraRecognitionObject[] backObjs = ObjectConditionAspect.camera(_self).getCameraRecognitionObjects();
    int _length = backObjs.length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      double distance = controler.getObjectDistanceToGripper();
      OPERATOR _operator = _self.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case INFERIOR:
            double _distance = _self.getDistance();
            return (distance < _distance);
          case SUPERIOR:
            double _distance_1 = _self.getDistance();
            return (distance > _distance_1);
          default:
            return false;
        }
      } else {
        return false;
      }
    }
    return false;
  }
}
