package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectProperties;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspect;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import org.eclipse.emf.common.util.EList;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static void doActions(final State _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void doActions(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State){
    	fr.unice.polytech.si5.webots.polycreate.rewritingrules.StateAspect._privk3_doActions(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State)_self,controler);
    };
  }
  
  protected static void _privk3_doActions(final StateAspectStateAspectProperties _self_, final State _self, final PolyCreateControler controler) {
    EList<Action> _actions = _self.getActions();
    for (final Action c : _actions) {
      ActionAspect.execute(c, controler);
    }
    EList<Transition> _transitions = _self.getTransitions();
    for (final Transition t : _transitions) {
      boolean _canTransit = TransitionAspect.canTransit(t, controler);
      if (_canTransit) {
        StateAspect.doActions(t.getNextState(), controler);
        return;
      }
    }
    StateAspect.doActions(_self, controler);
  }
}
