package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = TurnAction.class)
@SuppressWarnings("all")
public class TurnActionAspect extends ActionAspect {
  @Step
  @OverrideAspectMethod
  public static boolean execute(final TurnAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean execute(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect._privk3_execute(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "TurnAction", "execute");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  private static boolean super_execute(final TurnAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    return  fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_execute(_self_, _self,controler);
  }
  
  protected static boolean _privk3_execute(final TurnActionAspectTurnActionAspectProperties _self_, final TurnAction _self, final PolyCreateControler controler) {
    boolean _isStarted = ActionAspect.isStarted(_self);
    if (_isStarted) {
      int _timeWasted = ActionAspect.timeWasted(_self);
      int _plus = (_timeWasted + controler.timestep);
      ActionAspect.timeWasted(_self, _plus);
      int _timeWasted_1 = ActionAspect.timeWasted(_self);
      double _duration = _self.getDuration();
      double _multiply = (_duration * 1000);
      boolean _greaterThan = (_timeWasted_1 > _multiply);
      if (_greaterThan) {
        ActionAspect.isStarted(_self, false);
        System.out.println("end");
        return true;
      }
    } else {
      ActionAspect.timeWasted(_self, 0);
      ActionAspect.isStarted(_self, true);
      double _angle = _self.getAngle();
      double _divide = (_angle / 180);
      double _multiply_1 = (Math.PI * _divide);
      controler.turn(_multiply_1);
      controler.step(controler.timestep);
    }
    return false;
  }
}
