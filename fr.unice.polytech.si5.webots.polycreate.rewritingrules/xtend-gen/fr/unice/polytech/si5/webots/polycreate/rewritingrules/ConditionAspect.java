package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  public static boolean checkCondition(final Condition _self, final PolyCreateControler controler) {
    final fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition){
    			result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect.checkCondition((fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition)_self,controler);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect#boolean checkCondition(PolyCreateControler) from fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspect
    // #DispatchPointCut_before# boolean checkCondition(PolyCreateControler)
    if (_self instanceof fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition){
    	result = fr.unice.polytech.si5.webots.polycreate.rewritingrules.ConditionAspect._privk3_checkCondition(_self_, (fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition)_self,controler);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_checkCondition(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final PolyCreateControler controler) {
    return false;
  }
}
