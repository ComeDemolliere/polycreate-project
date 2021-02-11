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
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self, final PolyCreateControler controler) {
  }
}
