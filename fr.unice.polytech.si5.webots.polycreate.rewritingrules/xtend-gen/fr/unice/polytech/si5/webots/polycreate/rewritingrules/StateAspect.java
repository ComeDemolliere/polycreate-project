package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void doActions(final State _self, final PolyCreateControler controler, final EList<Transition> globalTransitions) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void doActions(PolyCreateControler,EList<Transition>)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspect._privk3_doActions(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State)_self,controler,globalTransitions);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,globalTransitions}, command, "State", "doActions");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_doActions(final StateAspectStateAspectProperties _self_, final State _self, final PolyCreateControler controler, final EList<Transition> globalTransitions) {
    EObject _eContainer = _self.eContainer();
    ((RobotProgram) _eContainer).setCurrentState(_self);
    int index = 0;
    while ((index < _self.getActions().size())) {
      {
        boolean _execute = ActionAspect.execute(_self.getActions().get(index), controler);
        if (_execute) {
          int _index = index;
          index = (_index + 1);
        }
        for (final Transition t : globalTransitions) {
          boolean _canTransit = TransitionAspect.canTransit(t, controler);
          if (_canTransit) {
            ActionAspect.stop(_self.getActions().get(index));
            TransitionAspect.transitToNextState(t, controler, globalTransitions);
            return;
          }
        }
        EList<Transition> _transitions = _self.getTransitions();
        for (final Transition t_1 : _transitions) {
          int _size = t_1.getConditions().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            boolean _canTransit_1 = TransitionAspect.canTransit(t_1, controler);
            if (_canTransit_1) {
              ActionAspect.stop(_self.getActions().get(index));
              TransitionAspect.transitToNextState(t_1, controler, globalTransitions);
              return;
            }
          }
        }
      }
    }
    for (final Transition t : globalTransitions) {
      boolean _canTransit = TransitionAspect.canTransit(t, controler);
      if (_canTransit) {
        TransitionAspect.transitToNextState(t, controler, globalTransitions);
        return;
      }
    }
    EList<Transition> _transitions = _self.getTransitions();
    for (final Transition t_1 : _transitions) {
      boolean _canTransit_1 = TransitionAspect.canTransit(t_1, controler);
      if (_canTransit_1) {
        TransitionAspect.transitToNextState(t_1, controler, globalTransitions);
        return;
      }
    }
    StateAspect.doActions(_self, controler, globalTransitions);
  }
}
