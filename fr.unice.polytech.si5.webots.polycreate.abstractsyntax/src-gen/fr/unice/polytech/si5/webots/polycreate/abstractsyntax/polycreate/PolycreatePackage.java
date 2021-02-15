/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreateFactory
 * @model kind="package"
 * @generated
 */
public interface PolycreatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polycreate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.polytech.unice/polycreate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractsyntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreatePackage eINSTANCE = fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.NamedElementImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl <em>Robot Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getRobotProgram()
	 * @generated
	 */
	int ROBOT_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Global Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__GLOBAL_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__OWNED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Robot Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM___START = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Next State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.StateImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ActionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.MoveActionImpl <em>Move Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.MoveActionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getMoveAction()
	 * @generated
	 */
	int MOVE_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__DURATION = ACTION__DURATION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__DIRECTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TurnActionImpl <em>Turn Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TurnActionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTurnAction()
	 * @generated
	 */
	int TURN_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION__DURATION = ACTION__DURATION;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION__ANGLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ConditionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.SimpleConditionImpl <em>Simple Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.SimpleConditionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getSimpleCondition()
	 * @generated
	 */
	int SIMPLE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Detection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION__DETECTION_TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ObjectConditionImpl <em>Object Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ObjectConditionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getObjectCondition()
	 * @generated
	 */
	int OBJECT_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Camera Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONDITION__CAMERA_TYPE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.DistanceConditionImpl <em>Distance Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.DistanceConditionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDistanceCondition()
	 * @generated
	 */
	int DISTANCE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Camera Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION__CAMERA_TYPE = OBJECT_CONDITION__CAMERA_TYPE;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION__DISTANCE = OBJECT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION_FEATURE_COUNT = OBJECT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION_OPERATION_COUNT = OBJECT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.AngleConditionImpl <em>Angle Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.AngleConditionImpl
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getAngleCondition()
	 * @generated
	 */
	int ANGLE_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Camera Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_CONDITION__CAMERA_TYPE = OBJECT_CONDITION__CAMERA_TYPE;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_CONDITION__ANGLE = OBJECT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angle Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_CONDITION_FEATURE_COUNT = OBJECT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angle Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_CONDITION_OPERATION_COUNT = OBJECT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION <em>DETECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDETECTION()
	 * @generated
	 */
	int DETECTION = 12;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION <em>DIRECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDIRECTION()
	 * @generated
	 */
	int DIRECTION = 13;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE <em>CAMERATYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCAMERATYPE()
	 * @generated
	 */
	int CAMERATYPE = 14;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram <em>Robot Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Program</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram
	 * @generated
	 */
	EClass getRobotProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getGlobalTransitions <em>Global Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Transitions</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getGlobalTransitions()
	 * @see #getRobotProgram()
	 * @generated
	 */
	EReference getRobotProgram_GlobalTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getOwnedStates()
	 * @see #getRobotProgram()
	 * @generated
	 */
	EReference getRobotProgram_OwnedStates();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial State</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getInitialState()
	 * @see #getRobotProgram()
	 * @generated
	 */
	EReference getRobotProgram_InitialState();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#start()
	 * @generated
	 */
	EOperation getRobotProgram__Start();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getNextState <em>Next State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next State</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getNextState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_NextState();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getConditions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Conditions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action#getDuration()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Duration();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Action</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction
	 * @generated
	 */
	EClass getMoveAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction#getDirection()
	 * @see #getMoveAction()
	 * @generated
	 */
	EAttribute getMoveAction_Direction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction <em>Turn Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Action</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction
	 * @generated
	 */
	EClass getTurnAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction#getAngle()
	 * @see #getTurnAction()
	 * @generated
	 */
	EAttribute getTurnAction_Angle();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition <em>Simple Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Condition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition
	 * @generated
	 */
	EClass getSimpleCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition#getDetectionType <em>Detection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection Type</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition#getDetectionType()
	 * @see #getSimpleCondition()
	 * @generated
	 */
	EAttribute getSimpleCondition_DetectionType();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition <em>Object Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Condition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition
	 * @generated
	 */
	EClass getObjectCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition#getCameraType <em>Camera Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Type</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition#getCameraType()
	 * @see #getObjectCondition()
	 * @generated
	 */
	EAttribute getObjectCondition_CameraType();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition <em>Distance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Condition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition
	 * @generated
	 */
	EClass getDistanceCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition#getDistance()
	 * @see #getDistanceCondition()
	 * @generated
	 */
	EAttribute getDistanceCondition_Distance();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition <em>Angle Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Condition</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition
	 * @generated
	 */
	EClass getAngleCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition#getAngle()
	 * @see #getAngleCondition()
	 * @generated
	 */
	EAttribute getAngleCondition_Angle();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION <em>DETECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DETECTION</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION
	 * @generated
	 */
	EEnum getDETECTION();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION <em>DIRECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DIRECTION</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
	 * @generated
	 */
	EEnum getDIRECTION();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE <em>CAMERATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CAMERATYPE</em>'.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
	 * @generated
	 */
	EEnum getCAMERATYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolycreateFactory getPolycreateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl <em>Robot Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getRobotProgram()
		 * @generated
		 */
		EClass ROBOT_PROGRAM = eINSTANCE.getRobotProgram();

		/**
		 * The meta object literal for the '<em><b>Global Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAM__GLOBAL_TRANSITIONS = eINSTANCE.getRobotProgram_GlobalTransitions();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAM__OWNED_STATES = eINSTANCE.getRobotProgram_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAM__INITIAL_STATE = eINSTANCE.getRobotProgram_InitialState();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT_PROGRAM___START = eINSTANCE.getRobotProgram__Start();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Next State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NEXT_STATE = eINSTANCE.getTransition_NextState();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITIONS = eINSTANCE.getTransition_Conditions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.StateImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ActionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DURATION = eINSTANCE.getAction_Duration();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.MoveActionImpl <em>Move Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.MoveActionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getMoveAction()
		 * @generated
		 */
		EClass MOVE_ACTION = eINSTANCE.getMoveAction();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ACTION__DIRECTION = eINSTANCE.getMoveAction_Direction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TurnActionImpl <em>Turn Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TurnActionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getTurnAction()
		 * @generated
		 */
		EClass TURN_ACTION = eINSTANCE.getTurnAction();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_ACTION__ANGLE = eINSTANCE.getTurnAction_Angle();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ConditionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.SimpleConditionImpl <em>Simple Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.SimpleConditionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getSimpleCondition()
		 * @generated
		 */
		EClass SIMPLE_CONDITION = eINSTANCE.getSimpleCondition();

		/**
		 * The meta object literal for the '<em><b>Detection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONDITION__DETECTION_TYPE = eINSTANCE.getSimpleCondition_DetectionType();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.NamedElementImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ObjectConditionImpl <em>Object Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.ObjectConditionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getObjectCondition()
		 * @generated
		 */
		EClass OBJECT_CONDITION = eINSTANCE.getObjectCondition();

		/**
		 * The meta object literal for the '<em><b>Camera Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_CONDITION__CAMERA_TYPE = eINSTANCE.getObjectCondition_CameraType();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.DistanceConditionImpl <em>Distance Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.DistanceConditionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDistanceCondition()
		 * @generated
		 */
		EClass DISTANCE_CONDITION = eINSTANCE.getDistanceCondition();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_CONDITION__DISTANCE = eINSTANCE.getDistanceCondition_Distance();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.AngleConditionImpl <em>Angle Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.AngleConditionImpl
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getAngleCondition()
		 * @generated
		 */
		EClass ANGLE_CONDITION = eINSTANCE.getAngleCondition();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_CONDITION__ANGLE = eINSTANCE.getAngleCondition_Angle();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION <em>DETECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDETECTION()
		 * @generated
		 */
		EEnum DETECTION = eINSTANCE.getDETECTION();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION <em>DIRECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getDIRECTION()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDIRECTION();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE <em>CAMERATYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
		 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreatePackageImpl#getCAMERATYPE()
		 * @generated
		 */
		EEnum CAMERATYPE = eINSTANCE.getCAMERATYPE();

	}

} //PolycreatePackage
