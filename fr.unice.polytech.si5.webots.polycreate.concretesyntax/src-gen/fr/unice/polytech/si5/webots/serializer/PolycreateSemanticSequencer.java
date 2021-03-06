/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.serializer;

import com.google.inject.Inject;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PolycreateSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PolycreateGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PolycreatePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PolycreatePackage.ANGLE_CONDITION:
				sequence_AngleCondition(context, (AngleCondition) semanticObject); 
				return; 
			case PolycreatePackage.DISTANCE_CONDITION:
				sequence_DistanceCondition(context, (DistanceCondition) semanticObject); 
				return; 
			case PolycreatePackage.GRIP_ACTION:
				sequence_GripAction(context, (GripAction) semanticObject); 
				return; 
			case PolycreatePackage.MOVE_ACTION:
				sequence_MoveAction(context, (MoveAction) semanticObject); 
				return; 
			case PolycreatePackage.ROBOT_PROGRAM:
				sequence_RobotProgram(context, (RobotProgram) semanticObject); 
				return; 
			case PolycreatePackage.SIMPLE_CONDITION:
				sequence_SimpleCondition(context, (SimpleCondition) semanticObject); 
				return; 
			case PolycreatePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case PolycreatePackage.TRANSITION:
				if (rule == grammarAccess.getGlobalTransitionsRule()) {
					sequence_GlobalTransitions(context, (Transition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case PolycreatePackage.TURN_ACTION:
				sequence_TurnAction(context, (TurnAction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Condition returns AngleCondition
	 *     ObjectCondition returns AngleCondition
	 *     AngleCondition returns AngleCondition
	 *
	 * Constraint:
	 *     (cameraType=CAMERATYPE operator=OPERATOR angle=EDouble)
	 */
	protected void sequence_AngleCondition(ISerializationContext context, AngleCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.OBJECT_CONDITION__CAMERA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.OBJECT_CONDITION__CAMERA_TYPE));
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.ANGLE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.ANGLE_CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.ANGLE_CONDITION__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.ANGLE_CONDITION__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAngleConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0(), semanticObject.getCameraType());
		feeder.accept(grammarAccess.getAngleConditionAccess().getOperatorOPERATOREnumRuleCall_6_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getAngleConditionAccess().getAngleEDoubleParserRuleCall_7_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns DistanceCondition
	 *     ObjectCondition returns DistanceCondition
	 *     DistanceCondition returns DistanceCondition
	 *
	 * Constraint:
	 *     (cameraType=CAMERATYPE operator=OPERATOR distance=EDouble)
	 */
	protected void sequence_DistanceCondition(ISerializationContext context, DistanceCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.OBJECT_CONDITION__CAMERA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.OBJECT_CONDITION__CAMERA_TYPE));
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.DISTANCE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.DISTANCE_CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.DISTANCE_CONDITION__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.DISTANCE_CONDITION__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0(), semanticObject.getCameraType());
		feeder.accept(grammarAccess.getDistanceConditionAccess().getOperatorOPERATOREnumRuleCall_6_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getDistanceConditionAccess().getDistanceEDoubleParserRuleCall_7_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GlobalTransitions returns Transition
	 *
	 * Constraint:
	 *     (conditions+=Condition conditions+=Condition* nextState=[State|EString])
	 */
	protected void sequence_GlobalTransitions(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns GripAction
	 *     GripAction returns GripAction
	 *
	 * Constraint:
	 *     state=GRIPPER_STATE
	 */
	protected void sequence_GripAction(ISerializationContext context, GripAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.GRIP_ACTION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.GRIP_ACTION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGripActionAccess().getStateGRIPPER_STATEEnumRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns MoveAction
	 *     MoveAction returns MoveAction
	 *
	 * Constraint:
	 *     (direction=DIRECTION duration=EDouble)
	 */
	protected void sequence_MoveAction(ISerializationContext context, MoveAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.MOVE_ACTION__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.MOVE_ACTION__DIRECTION));
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.ACTION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.ACTION__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_2_0(), semanticObject.getDirection());
		feeder.accept(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_4_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RobotProgram returns RobotProgram
	 *
	 * Constraint:
	 *     (name=EString initialState=State ownedStates+=State* globalTransitions+=GlobalTransitions*)
	 */
	protected void sequence_RobotProgram(ISerializationContext context, RobotProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns SimpleCondition
	 *     SimpleCondition returns SimpleCondition
	 *
	 * Constraint:
	 *     detectionType=DETECTION
	 */
	protected void sequence_SimpleCondition(ISerializationContext context, SimpleCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolycreatePackage.Literals.SIMPLE_CONDITION__DETECTION_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolycreatePackage.Literals.SIMPLE_CONDITION__DETECTION_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_2_0(), semanticObject.getDetectionType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=EString (actions+=Action actions+=Action*)? (transitions+=Transition transitions+=Transition*)?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     ((conditions+=Condition conditions+=Condition*)? nextState=[State|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns TurnAction
	 *     TurnAction returns TurnAction
	 *
	 * Constraint:
	 *     (angle=EDouble duration=EDouble?)
	 */
	protected void sequence_TurnAction(ISerializationContext context, TurnAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
