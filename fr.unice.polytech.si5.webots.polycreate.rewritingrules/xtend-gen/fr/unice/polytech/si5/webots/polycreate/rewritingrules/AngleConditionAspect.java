package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.CameraRecognitionObject;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = AngleCondition.class)
@SuppressWarnings("all")
public class AngleConditionAspect extends ObjectConditionAspect {
  @Step
  @OverrideAspectMethod
  public static boolean checkCondition(final AngleCondition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "AngleCondition", "checkCondition");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
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
      CameraRecognitionObject obj = backObjs[0];
      double[] backObjPos = obj.getPosition();
      double _get = backObjPos[0];
      String _plus = ("latitude " + Double.valueOf(_get));
      String _plus_1 = (_plus + " longitude ");
      double _get_1 = backObjPos[1];
      String _plus_2 = (_plus_1 + Double.valueOf(_get_1));
      System.out.println(_plus_2);
      double rad = Math.atan2(backObjPos[0], backObjPos[1]);
      double angle = (rad * (180 / Math.PI));
      System.out.println(("angle " + Double.valueOf(angle)));
      double _atan2 = Math.atan2(Math.sqrt(rad), Math.sqrt((1 - rad)));
      double distance = (2 * _atan2);
      System.out.println(("distance  " + Double.valueOf(distance)));
      double _objectDistanceToGripper = controler.getObjectDistanceToGripper();
      String _plus_3 = ("gripper " + Double.valueOf(_objectDistanceToGripper));
      System.out.println(_plus_3);
    }
    return false;
  }
}
