package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static boolean canTransit(final Transition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean canTransit(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspect._privk3_canTransit(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition)_self,controler);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_canTransit(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final PolyCreateControler controler) {
    EList<Condition> _conditions = _self.getConditions();
    for (final Condition c : _conditions) {
      boolean _checkCondition = ConditionAspect.checkCondition(c, controler);
      boolean _not = (!_checkCondition);
      if (_not) {
        return false;
      }
    }
    return true;
  }
}
