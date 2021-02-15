package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = MoveAction.class)
@SuppressWarnings("all")
public class MoveActionAspect extends ActionAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final MoveAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspect._privk3_execute(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "MoveAction", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final MoveAction _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
     fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect._privk3_execute(_self_, _self,controler);
  }
  
  protected static void _privk3_execute(final MoveActionAspectMoveActionAspectProperties _self_, final MoveAction _self, final PolyCreateControler controler) {
    DIRECTION _direction = _self.getDirection();
    boolean _equals = Objects.equal(_direction, DIRECTION.BACKWARD);
    if (_equals) {
      controler.goBackward();
    }
    DIRECTION _direction_1 = _self.getDirection();
    boolean _equals_1 = Objects.equal(_direction_1, DIRECTION.FORWARD);
    if (_equals_1) {
      controler.goForward();
    }
    controler.passiveWait(_self.getDuration());
  }
}
