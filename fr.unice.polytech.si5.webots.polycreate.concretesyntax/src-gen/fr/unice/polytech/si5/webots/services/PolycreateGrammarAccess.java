/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PolycreateGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RobotProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.RobotProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRobotProgramAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRobotProgramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cInitialStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitialStateStateParserRuleCall_3_0 = (RuleCall)cInitialStateAssignment_3.eContents().get(0);
		private final Assignment cOwnedStatesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedStatesStateParserRuleCall_4_0 = (RuleCall)cOwnedStatesAssignment_4.eContents().get(0);
		private final Assignment cGlobalTransitionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGlobalTransitionsTransitionParserRuleCall_5_0 = (RuleCall)cGlobalTransitionsAssignment_5.eContents().get(0);
		
		//RobotProgram:
		//	{RobotProgram}
		//	'RobotProgram'
		//	name=EString
		//	initialState=State ownedStates+=State*
		//	globalTransitions+=Transition*;
		@Override public ParserRule getRule() { return rule; }
		
		//{RobotProgram} 'RobotProgram' name=EString initialState=State ownedStates+=State* globalTransitions+=Transition*
		public Group getGroup() { return cGroup; }
		
		//{RobotProgram}
		public Action getRobotProgramAction_0() { return cRobotProgramAction_0; }
		
		//'RobotProgram'
		public Keyword getRobotProgramKeyword_1() { return cRobotProgramKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//initialState=State
		public Assignment getInitialStateAssignment_3() { return cInitialStateAssignment_3; }
		
		//State
		public RuleCall getInitialStateStateParserRuleCall_3_0() { return cInitialStateStateParserRuleCall_3_0; }
		
		//ownedStates+=State*
		public Assignment getOwnedStatesAssignment_4() { return cOwnedStatesAssignment_4; }
		
		//State
		public RuleCall getOwnedStatesStateParserRuleCall_4_0() { return cOwnedStatesStateParserRuleCall_4_0; }
		
		//globalTransitions+=Transition*
		public Assignment getGlobalTransitionsAssignment_5() { return cGlobalTransitionsAssignment_5; }
		
		//Transition
		public RuleCall getGlobalTransitionsTransitionParserRuleCall_5_0() { return cGlobalTransitionsTransitionParserRuleCall_5_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.Condition");
		private final RuleCall cSimpleConditionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Condition:
		//	SimpleCondition;
		@Override public ParserRule getRule() { return rule; }
		
		//SimpleCondition
		public RuleCall getSimpleConditionParserRuleCall() { return cSimpleConditionParserRuleCall; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMoveActionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTurnActionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Action:
		//	MoveAction | TurnAction;
		@Override public ParserRule getRule() { return rule; }
		
		//MoveAction | TurnAction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MoveAction
		public RuleCall getMoveActionParserRuleCall_0() { return cMoveActionParserRuleCall_0; }
		
		//TurnAction
		public RuleCall getTurnActionParserRuleCall_1() { return cTurnActionParserRuleCall_1; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cConditionsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cConditionsAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cConditionsConditionParserRuleCall_2_2_0 = (RuleCall)cConditionsAssignment_2_2.eContents().get(0);
		private final Group cGroup_2_3 = (Group)cGroup_2.eContents().get(3);
		private final Keyword cCommaKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cConditionsAssignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final RuleCall cConditionsConditionParserRuleCall_2_3_1_0 = (RuleCall)cConditionsAssignment_2_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Keyword cNextStateKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNextStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cNextStateStateCrossReference_4_0 = (CrossReference)cNextStateAssignment_4.eContents().get(0);
		private final RuleCall cNextStateStateEStringParserRuleCall_4_0_1 = (RuleCall)cNextStateStateCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Transition:
		//	'Transition'
		//	'{' ('conditions' '{' conditions+=Condition ("," conditions+=Condition)* '}')?
		//	'nextState' nextState=[State|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Transition' '{' ('conditions' '{' conditions+=Condition ("," conditions+=Condition)* '}')? 'nextState'
		//nextState=[State|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'Transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('conditions' '{' conditions+=Condition ("," conditions+=Condition)* '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'conditions'
		public Keyword getConditionsKeyword_2_0() { return cConditionsKeyword_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1() { return cLeftCurlyBracketKeyword_2_1; }
		
		//conditions+=Condition
		public Assignment getConditionsAssignment_2_2() { return cConditionsAssignment_2_2; }
		
		//Condition
		public RuleCall getConditionsConditionParserRuleCall_2_2_0() { return cConditionsConditionParserRuleCall_2_2_0; }
		
		//("," conditions+=Condition)*
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//","
		public Keyword getCommaKeyword_2_3_0() { return cCommaKeyword_2_3_0; }
		
		//conditions+=Condition
		public Assignment getConditionsAssignment_2_3_1() { return cConditionsAssignment_2_3_1; }
		
		//Condition
		public RuleCall getConditionsConditionParserRuleCall_2_3_1_0() { return cConditionsConditionParserRuleCall_2_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_4() { return cRightCurlyBracketKeyword_2_4; }
		
		//'nextState'
		public Keyword getNextStateKeyword_3() { return cNextStateKeyword_3; }
		
		//nextState=[State|EString]
		public Assignment getNextStateAssignment_4() { return cNextStateAssignment_4; }
		
		//[State|EString]
		public CrossReference getNextStateStateCrossReference_4_0() { return cNextStateStateCrossReference_4_0; }
		
		//EString
		public RuleCall getNextStateStateEStringParserRuleCall_4_0_1() { return cNextStateStateEStringParserRuleCall_4_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cActionsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cActionsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_4_2_0 = (RuleCall)cActionsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cActionsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cActionsActionParserRuleCall_4_3_1_0 = (RuleCall)cActionsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTransitionsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cTransitionsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cTransitionsTransitionParserRuleCall_5_2_0 = (RuleCall)cTransitionsAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cTransitionsTransitionParserRuleCall_5_3_1_0 = (RuleCall)cTransitionsAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//State:
		//	{State}
		//	'State' name=EString
		//	'{' ('actions' '{' actions+=Action ("," actions+=Action)* '}')? ('transitions' '{' transitions+=Transition (","
		//	transitions+=Transition)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{State} 'State' name=EString '{' ('actions' '{' actions+=Action ("," actions+=Action)* '}')? ('transitions' '{'
		//transitions+=Transition ("," transitions+=Transition)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'State'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('actions' '{' actions+=Action ("," actions+=Action)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'actions'
		public Keyword getActionsKeyword_4_0() { return cActionsKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//actions+=Action
		public Assignment getActionsAssignment_4_2() { return cActionsAssignment_4_2; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_4_2_0() { return cActionsActionParserRuleCall_4_2_0; }
		
		//("," actions+=Action)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//actions+=Action
		public Assignment getActionsAssignment_4_3_1() { return cActionsAssignment_4_3_1; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_4_3_1_0() { return cActionsActionParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('transitions' '{' transitions+=Transition ("," transitions+=Transition)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'transitions'
		public Keyword getTransitionsKeyword_5_0() { return cTransitionsKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_5_2() { return cTransitionsAssignment_5_2; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_5_2_0() { return cTransitionsTransitionParserRuleCall_5_2_0; }
		
		//("," transitions+=Transition)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_5_3_1() { return cTransitionsAssignment_5_3_1; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_5_3_1_0() { return cTransitionsTransitionParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SimpleConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.SimpleCondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSimpleConditionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSimpleConditionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDetectionTypeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDetectionTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDetectionTypeDETECTIONEnumRuleCall_3_1_0 = (RuleCall)cDetectionTypeAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SimpleCondition:
		//	{SimpleCondition}
		//	'SimpleCondition'
		//	'{' ('detectionType' detectionType=DETECTION)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SimpleCondition} 'SimpleCondition' '{' ('detectionType' detectionType=DETECTION)? '}'
		public Group getGroup() { return cGroup; }
		
		//{SimpleCondition}
		public Action getSimpleConditionAction_0() { return cSimpleConditionAction_0; }
		
		//'SimpleCondition'
		public Keyword getSimpleConditionKeyword_1() { return cSimpleConditionKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('detectionType' detectionType=DETECTION)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'detectionType'
		public Keyword getDetectionTypeKeyword_3_0() { return cDetectionTypeKeyword_3_0; }
		
		//detectionType=DETECTION
		public Assignment getDetectionTypeAssignment_3_1() { return cDetectionTypeAssignment_3_1; }
		
		//DETECTION
		public RuleCall getDetectionTypeDETECTIONEnumRuleCall_3_1_0() { return cDetectionTypeDETECTIONEnumRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class MoveActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.MoveAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMoveActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMoveActionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDurationKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDurationAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDurationEDoubleParserRuleCall_3_1_0 = (RuleCall)cDurationAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDirectionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDirectionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDirectionDIRECTIONEnumRuleCall_4_1_0 = (RuleCall)cDirectionAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MoveAction:
		//	{MoveAction}
		//	'MoveAction'
		//	'{' ('duration' duration=EDouble)? ('direction' direction=DIRECTION)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{MoveAction} 'MoveAction' '{' ('duration' duration=EDouble)? ('direction' direction=DIRECTION)? '}'
		public Group getGroup() { return cGroup; }
		
		//{MoveAction}
		public Action getMoveActionAction_0() { return cMoveActionAction_0; }
		
		//'MoveAction'
		public Keyword getMoveActionKeyword_1() { return cMoveActionKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('duration' duration=EDouble)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'duration'
		public Keyword getDurationKeyword_3_0() { return cDurationKeyword_3_0; }
		
		//duration=EDouble
		public Assignment getDurationAssignment_3_1() { return cDurationAssignment_3_1; }
		
		//EDouble
		public RuleCall getDurationEDoubleParserRuleCall_3_1_0() { return cDurationEDoubleParserRuleCall_3_1_0; }
		
		//('direction' direction=DIRECTION)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'direction'
		public Keyword getDirectionKeyword_4_0() { return cDirectionKeyword_4_0; }
		
		//direction=DIRECTION
		public Assignment getDirectionAssignment_4_1() { return cDirectionAssignment_4_1; }
		
		//DIRECTION
		public RuleCall getDirectionDIRECTIONEnumRuleCall_4_1_0() { return cDirectionDIRECTIONEnumRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class TurnActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.TurnAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTurnActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTurnActionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDurationKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDurationAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDurationEDoubleParserRuleCall_3_1_0 = (RuleCall)cDurationAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAngleKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAngleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAngleEDoubleParserRuleCall_4_1_0 = (RuleCall)cAngleAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TurnAction:
		//	{TurnAction}
		//	'TurnAction'
		//	'{' ('duration' duration=EDouble)? ('angle' angle=EDouble)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{TurnAction} 'TurnAction' '{' ('duration' duration=EDouble)? ('angle' angle=EDouble)? '}'
		public Group getGroup() { return cGroup; }
		
		//{TurnAction}
		public Action getTurnActionAction_0() { return cTurnActionAction_0; }
		
		//'TurnAction'
		public Keyword getTurnActionKeyword_1() { return cTurnActionKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('duration' duration=EDouble)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'duration'
		public Keyword getDurationKeyword_3_0() { return cDurationKeyword_3_0; }
		
		//duration=EDouble
		public Assignment getDurationAssignment_3_1() { return cDurationAssignment_3_1; }
		
		//EDouble
		public RuleCall getDurationEDoubleParserRuleCall_3_1_0() { return cDurationEDoubleParserRuleCall_3_1_0; }
		
		//('angle' angle=EDouble)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'angle'
		public Keyword getAngleKeyword_4_0() { return cAngleKeyword_4_0; }
		
		//angle=EDouble
		public Assignment getAngleAssignment_4_1() { return cAngleAssignment_4_1; }
		
		//EDouble
		public RuleCall getAngleEDoubleParserRuleCall_4_1_0() { return cAngleEDoubleParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble ecore::EDouble:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	
	public class DETECTIONElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.DETECTION");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCOLLISION_LEFTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCOLLISION_LEFTCOLLISION_LEFTKeyword_0_0 = (Keyword)cCOLLISION_LEFTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCOLLISION_RIGHTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCOLLISION_RIGHTCOLLISION_RIGHTKeyword_1_0 = (Keyword)cCOLLISION_RIGHTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cVIRTUAL_WALLEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cVIRTUAL_WALLVIRTUAL_WALLKeyword_2_0 = (Keyword)cVIRTUAL_WALLEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCLIFF_LEFTEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCLIFF_LEFTCLIFF_LEFTKeyword_3_0 = (Keyword)cCLIFF_LEFTEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCLIFF_RIGHTEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCLIFF_RIGHTCLIFF_RIGHTKeyword_4_0 = (Keyword)cCLIFF_RIGHTEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cCLIFF_FRONTEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cCLIFF_FRONTCLIFF_FRONTKeyword_5_0 = (Keyword)cCLIFF_FRONTEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum DETECTION:
		//	COLLISION_LEFT | COLLISION_RIGHT | VIRTUAL_WALL | CLIFF_LEFT | CLIFF_RIGHT | CLIFF_FRONT;
		public EnumRule getRule() { return rule; }
		
		//COLLISION_LEFT | COLLISION_RIGHT | VIRTUAL_WALL | CLIFF_LEFT | CLIFF_RIGHT | CLIFF_FRONT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//COLLISION_LEFT
		public EnumLiteralDeclaration getCOLLISION_LEFTEnumLiteralDeclaration_0() { return cCOLLISION_LEFTEnumLiteralDeclaration_0; }
		
		//'COLLISION_LEFT'
		public Keyword getCOLLISION_LEFTCOLLISION_LEFTKeyword_0_0() { return cCOLLISION_LEFTCOLLISION_LEFTKeyword_0_0; }
		
		//COLLISION_RIGHT
		public EnumLiteralDeclaration getCOLLISION_RIGHTEnumLiteralDeclaration_1() { return cCOLLISION_RIGHTEnumLiteralDeclaration_1; }
		
		//'COLLISION_RIGHT'
		public Keyword getCOLLISION_RIGHTCOLLISION_RIGHTKeyword_1_0() { return cCOLLISION_RIGHTCOLLISION_RIGHTKeyword_1_0; }
		
		//VIRTUAL_WALL
		public EnumLiteralDeclaration getVIRTUAL_WALLEnumLiteralDeclaration_2() { return cVIRTUAL_WALLEnumLiteralDeclaration_2; }
		
		//'VIRTUAL_WALL'
		public Keyword getVIRTUAL_WALLVIRTUAL_WALLKeyword_2_0() { return cVIRTUAL_WALLVIRTUAL_WALLKeyword_2_0; }
		
		//CLIFF_LEFT
		public EnumLiteralDeclaration getCLIFF_LEFTEnumLiteralDeclaration_3() { return cCLIFF_LEFTEnumLiteralDeclaration_3; }
		
		//'CLIFF_LEFT'
		public Keyword getCLIFF_LEFTCLIFF_LEFTKeyword_3_0() { return cCLIFF_LEFTCLIFF_LEFTKeyword_3_0; }
		
		//CLIFF_RIGHT
		public EnumLiteralDeclaration getCLIFF_RIGHTEnumLiteralDeclaration_4() { return cCLIFF_RIGHTEnumLiteralDeclaration_4; }
		
		//'CLIFF_RIGHT'
		public Keyword getCLIFF_RIGHTCLIFF_RIGHTKeyword_4_0() { return cCLIFF_RIGHTCLIFF_RIGHTKeyword_4_0; }
		
		//CLIFF_FRONT
		public EnumLiteralDeclaration getCLIFF_FRONTEnumLiteralDeclaration_5() { return cCLIFF_FRONTEnumLiteralDeclaration_5; }
		
		//'CLIFF_FRONT'
		public Keyword getCLIFF_FRONTCLIFF_FRONTKeyword_5_0() { return cCLIFF_FRONTCLIFF_FRONTKeyword_5_0; }
	}
	public class DIRECTIONElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.webots.Polycreate.DIRECTION");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFORWARDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFORWARDFORWARDKeyword_0_0 = (Keyword)cFORWARDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBACKWARDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBACKWARDBACKWARDKeyword_1_0 = (Keyword)cBACKWARDEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DIRECTION:
		//	FORWARD | BACKWARD;
		public EnumRule getRule() { return rule; }
		
		//FORWARD | BACKWARD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FORWARD
		public EnumLiteralDeclaration getFORWARDEnumLiteralDeclaration_0() { return cFORWARDEnumLiteralDeclaration_0; }
		
		//'FORWARD'
		public Keyword getFORWARDFORWARDKeyword_0_0() { return cFORWARDFORWARDKeyword_0_0; }
		
		//BACKWARD
		public EnumLiteralDeclaration getBACKWARDEnumLiteralDeclaration_1() { return cBACKWARDEnumLiteralDeclaration_1; }
		
		//'BACKWARD'
		public Keyword getBACKWARDBACKWARDKeyword_1_0() { return cBACKWARDBACKWARDKeyword_1_0; }
	}
	
	private final RobotProgramElements pRobotProgram;
	private final EStringElements pEString;
	private final ConditionElements pCondition;
	private final ActionElements pAction;
	private final TransitionElements pTransition;
	private final StateElements pState;
	private final SimpleConditionElements pSimpleCondition;
	private final DETECTIONElements eDETECTION;
	private final MoveActionElements pMoveAction;
	private final TurnActionElements pTurnAction;
	private final DIRECTIONElements eDIRECTION;
	private final EDoubleElements pEDouble;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PolycreateGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRobotProgram = new RobotProgramElements();
		this.pEString = new EStringElements();
		this.pCondition = new ConditionElements();
		this.pAction = new ActionElements();
		this.pTransition = new TransitionElements();
		this.pState = new StateElements();
		this.pSimpleCondition = new SimpleConditionElements();
		this.eDETECTION = new DETECTIONElements();
		this.pMoveAction = new MoveActionElements();
		this.pTurnAction = new TurnActionElements();
		this.eDIRECTION = new DIRECTIONElements();
		this.pEDouble = new EDoubleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.si5.webots.Polycreate".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RobotProgram:
	//	{RobotProgram}
	//	'RobotProgram'
	//	name=EString
	//	initialState=State ownedStates+=State*
	//	globalTransitions+=Transition*;
	public RobotProgramElements getRobotProgramAccess() {
		return pRobotProgram;
	}
	
	public ParserRule getRobotProgramRule() {
		return getRobotProgramAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Condition:
	//	SimpleCondition;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//Action:
	//	MoveAction | TurnAction;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Transition:
	//	'Transition'
	//	'{' ('conditions' '{' conditions+=Condition ("," conditions+=Condition)* '}')?
	//	'nextState' nextState=[State|EString]
	//	'}';
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//State:
	//	{State}
	//	'State' name=EString
	//	'{' ('actions' '{' actions+=Action ("," actions+=Action)* '}')? ('transitions' '{' transitions+=Transition (","
	//	transitions+=Transition)* '}')?
	//	'}';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//SimpleCondition:
	//	{SimpleCondition}
	//	'SimpleCondition'
	//	'{' ('detectionType' detectionType=DETECTION)?
	//	'}';
	public SimpleConditionElements getSimpleConditionAccess() {
		return pSimpleCondition;
	}
	
	public ParserRule getSimpleConditionRule() {
		return getSimpleConditionAccess().getRule();
	}
	
	//enum DETECTION:
	//	COLLISION_LEFT | COLLISION_RIGHT | VIRTUAL_WALL | CLIFF_LEFT | CLIFF_RIGHT | CLIFF_FRONT;
	public DETECTIONElements getDETECTIONAccess() {
		return eDETECTION;
	}
	
	public EnumRule getDETECTIONRule() {
		return getDETECTIONAccess().getRule();
	}
	
	//MoveAction:
	//	{MoveAction}
	//	'MoveAction'
	//	'{' ('duration' duration=EDouble)? ('direction' direction=DIRECTION)?
	//	'}';
	public MoveActionElements getMoveActionAccess() {
		return pMoveAction;
	}
	
	public ParserRule getMoveActionRule() {
		return getMoveActionAccess().getRule();
	}
	
	//TurnAction:
	//	{TurnAction}
	//	'TurnAction'
	//	'{' ('duration' duration=EDouble)? ('angle' angle=EDouble)?
	//	'}';
	public TurnActionElements getTurnActionAccess() {
		return pTurnAction;
	}
	
	public ParserRule getTurnActionRule() {
		return getTurnActionAccess().getRule();
	}
	
	//enum DIRECTION:
	//	FORWARD | BACKWARD;
	public DIRECTIONElements getDIRECTIONAccess() {
		return eDIRECTION;
	}
	
	public EnumRule getDIRECTIONRule() {
		return getDIRECTIONAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
