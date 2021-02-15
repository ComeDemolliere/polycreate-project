package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.CameraRecognitionObject;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
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
      CameraRecognitionObject obj = backObjs[0];
      double[] backObjPos = obj.getPosition();
      double _get = backObjPos[0];
      String _plus = ("latitude " + Double.valueOf(_get));
      String _plus_1 = (_plus + " longitude ");
      double _get_1 = backObjPos[1];
      String _plus_2 = (_plus_1 + Double.valueOf(_get_1));
      System.out.println(_plus_2);
      double _get_2 = backObjPos[0];
      double dLat = (_get_2 * (Math.PI / 180));
      double _get_3 = backObjPos[1];
      double dLong = (_get_3 * (Math.PI / 180));
      double _sin = Math.sin((dLat / 2));
      double _sin_1 = Math.sin((dLat / 2));
      double _multiply = (_sin * _sin_1);
      double _cos = Math.cos(0);
      double _cos_1 = Math.cos(dLat);
      double _multiply_1 = (_cos * _cos_1);
      double _sin_2 = Math.sin((dLong / 2));
      double _multiply_2 = (_multiply_1 * _sin_2);
      double _sin_3 = Math.sin((dLong / 2));
      double _multiply_3 = (_multiply_2 * _sin_3);
      double angle = (_multiply + _multiply_3);
      System.out.println(("angle " + Double.valueOf(angle)));
    }
    return false;
  }
}
