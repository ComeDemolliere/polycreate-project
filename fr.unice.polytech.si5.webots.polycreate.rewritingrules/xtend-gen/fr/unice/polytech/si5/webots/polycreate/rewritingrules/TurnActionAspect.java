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
  public static void execute(final TurnAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspect._privk3_execute(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "TurnAction", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final TurnAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
     fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_execute(_self_, _self,controler);
  }
  
  protected static void _privk3_execute(final TurnActionAspectTurnActionAspectProperties _self_, final TurnAction _self, final PolyCreateControler controler) {
    double _angle = _self.getAngle();
    double _multiply = (Math.PI * _angle);
    controler.turn(_multiply);
  }
}
