package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.CameraRecognitionObject;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = AngleCondition.class)
@SuppressWarnings("all")
public class AngleConditionAspect extends ObjectConditionAspect {
  @OverrideAspectMethod
  public static boolean checkCondition(final AngleCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition)_self,controler);
    };
    return (boolean)result;
  }
  
  private static boolean super_checkCondition(final AngleCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect._privk3_checkCondition(_self_, _self,controler);
  }
  
  protected static boolean _privk3_checkCondition(final AngleConditionAspectAngleConditionAspectProperties _self_, final AngleCondition _self, final PolyCreateControler controler) {
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
      int _length_1 = backObjs.length;
      int _minus = (_length_1 - 1);
      CameraRecognitionObject obj = backObjs[_minus];
      double[] backObjPos = obj.getPosition();
      double rad = Math.atan2(backObjPos[0], backObjPos[1]);
      double angle = (rad * (180 / Math.PI));
      angle = (angle + 180);
      OPERATOR _operator = _self.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case INFERIOR:
            double _angle = _self.getAngle();
            return (angle < _angle);
          case SUPERIOR:
            double _angle_1 = _self.getAngle();
            return (angle > _angle_1);
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
