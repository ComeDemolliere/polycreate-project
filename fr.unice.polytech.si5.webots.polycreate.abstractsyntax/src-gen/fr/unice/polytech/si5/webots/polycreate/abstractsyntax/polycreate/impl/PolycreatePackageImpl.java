/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreateFactory;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreatePackageImpl extends EPackageImpl implements PolycreatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gripActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameratypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum grippeR_STATEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolycreatePackageImpl() {
		super(eNS_URI, PolycreateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolycreatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolycreatePackage init() {
		if (isInited)
			return (PolycreatePackage) EPackage.Registry.INSTANCE.getEPackage(PolycreatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolycreatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolycreatePackageImpl thePolycreatePackage = registeredPolycreatePackage instanceof PolycreatePackageImpl
				? (PolycreatePackageImpl) registeredPolycreatePackage
				: new PolycreatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePolycreatePackage.createPackageContents();

		// Initialize created meta-data
		thePolycreatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolycreatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolycreatePackage.eNS_URI, thePolycreatePackage);
		return thePolycreatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotProgram() {
		return robotProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProgram_GlobalTransitions() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProgram_OwnedStates() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProgram_InitialState() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotProgram_CurrentState() {
		return (EReference) robotProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRobotProgram__Start() {
		return robotProgramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_NextState() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Conditions() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transitions() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Actions() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Duration() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveAction() {
		return moveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveAction_Direction() {
		return (EAttribute) moveActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnAction() {
		return turnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnAction_Angle() {
		return (EAttribute) turnActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleCondition() {
		return simpleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleCondition_DetectionType() {
		return (EAttribute) simpleConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectCondition() {
		return objectConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectCondition_CameraType() {
		return (EAttribute) objectConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceCondition() {
		return distanceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceCondition_Distance() {
		return (EAttribute) distanceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceCondition_Operator() {
		return (EAttribute) distanceConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleCondition() {
		return angleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleCondition_Angle() {
		return (EAttribute) angleConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleCondition_Operator() {
		return (EAttribute) angleConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGripAction() {
		return gripActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGripAction_State() {
		return (EAttribute) gripActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDETECTION() {
		return detectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDIRECTION() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCAMERATYPE() {
		return cameratypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPERATOR() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGRIPPER_STATE() {
		return grippeR_STATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactory getPolycreateFactory() {
		return (PolycreateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		robotProgramEClass = createEClass(ROBOT_PROGRAM);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__GLOBAL_TRANSITIONS);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__OWNED_STATES);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__INITIAL_STATE);
		createEReference(robotProgramEClass, ROBOT_PROGRAM__CURRENT_STATE);
		createEOperation(robotProgramEClass, ROBOT_PROGRAM___START);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__NEXT_STATE);
		createEReference(transitionEClass, TRANSITION__CONDITIONS);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__TRANSITIONS);
		createEReference(stateEClass, STATE__ACTIONS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__DURATION);

		moveActionEClass = createEClass(MOVE_ACTION);
		createEAttribute(moveActionEClass, MOVE_ACTION__DIRECTION);

		turnActionEClass = createEClass(TURN_ACTION);
		createEAttribute(turnActionEClass, TURN_ACTION__ANGLE);

		conditionEClass = createEClass(CONDITION);

		simpleConditionEClass = createEClass(SIMPLE_CONDITION);
		createEAttribute(simpleConditionEClass, SIMPLE_CONDITION__DETECTION_TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		objectConditionEClass = createEClass(OBJECT_CONDITION);
		createEAttribute(objectConditionEClass, OBJECT_CONDITION__CAMERA_TYPE);

		distanceConditionEClass = createEClass(DISTANCE_CONDITION);
		createEAttribute(distanceConditionEClass, DISTANCE_CONDITION__DISTANCE);
		createEAttribute(distanceConditionEClass, DISTANCE_CONDITION__OPERATOR);

		angleConditionEClass = createEClass(ANGLE_CONDITION);
		createEAttribute(angleConditionEClass, ANGLE_CONDITION__ANGLE);
		createEAttribute(angleConditionEClass, ANGLE_CONDITION__OPERATOR);

		gripActionEClass = createEClass(GRIP_ACTION);
		createEAttribute(gripActionEClass, GRIP_ACTION__STATE);

		// Create enums
		detectionEEnum = createEEnum(DETECTION);
		directionEEnum = createEEnum(DIRECTION);
		cameratypeEEnum = createEEnum(CAMERATYPE);
		operatorEEnum = createEEnum(OPERATOR);
		grippeR_STATEEEnum = createEEnum(GRIPPER_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		robotProgramEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getNamedElement());
		moveActionEClass.getESuperTypes().add(this.getAction());
		turnActionEClass.getESuperTypes().add(this.getAction());
		simpleConditionEClass.getESuperTypes().add(this.getCondition());
		objectConditionEClass.getESuperTypes().add(this.getCondition());
		distanceConditionEClass.getESuperTypes().add(this.getObjectCondition());
		angleConditionEClass.getESuperTypes().add(this.getObjectCondition());
		gripActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotProgramEClass, RobotProgram.class, "RobotProgram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotProgram_GlobalTransitions(), this.getTransition(), null, "globalTransitions", null, 0,
				-1, RobotProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProgram_OwnedStates(), this.getState(), null, "ownedStates", null, 0, -1,
				RobotProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProgram_InitialState(), this.getState(), null, "initialState", null, 0, 1,
				RobotProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotProgram_CurrentState(), this.getState(), null, "currentState", null, 0, 1,
				RobotProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRobotProgram__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_NextState(), this.getState(), null, "nextState", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Conditions(), this.getCondition(), null, "conditions", null, 0, -1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Actions(), this.getAction(), null, "actions", null, 0, -1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveActionEClass, MoveAction.class, "MoveAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveAction_Direction(), this.getDIRECTION(), "direction", null, 0, 1, MoveAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnActionEClass, TurnAction.class, "TurnAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnAction_Angle(), ecorePackage.getEDouble(), "angle", null, 0, 1, TurnAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConditionEClass, SimpleCondition.class, "SimpleCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleCondition_DetectionType(), this.getDETECTION(), "detectionType", null, 0, 1,
				SimpleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectConditionEClass, ObjectCondition.class, "ObjectCondition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectCondition_CameraType(), this.getCAMERATYPE(), "cameraType", null, 0, 1,
				ObjectCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(distanceConditionEClass, DistanceCondition.class, "DistanceCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceCondition_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1,
				DistanceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceCondition_Operator(), this.getOPERATOR(), "operator", null, 0, 1,
				DistanceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(angleConditionEClass, AngleCondition.class, "AngleCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngleCondition_Angle(), ecorePackage.getEDouble(), "angle", null, 0, 1, AngleCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngleCondition_Operator(), this.getOPERATOR(), "operator", null, 0, 1, AngleCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gripActionEClass, GripAction.class, "GripAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGripAction_State(), this.getGRIPPER_STATE(), "state", null, 0, 1, GripAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(detectionEEnum, fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.class,
				"DETECTION");
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.COLLISION_LEFT);
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.COLLISION_RIGHT);
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.VIRTUAL_WALL);
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.CLIFF_LEFT);
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.CLIFF_RIGHT);
		addEEnumLiteral(detectionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION.CLIFF_FRONT);

		initEEnum(directionEEnum, fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION.class,
				"DIRECTION");
		addEEnumLiteral(directionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION.FORWARD);
		addEEnumLiteral(directionEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION.BACKWARD);

		initEEnum(cameratypeEEnum, fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE.class,
				"CAMERATYPE");
		addEEnumLiteral(cameratypeEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE.FRONT);
		addEEnumLiteral(cameratypeEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE.BACK);

		initEEnum(operatorEEnum, fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR.class,
				"OPERATOR");
		addEEnumLiteral(operatorEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR.INFERIOR);
		addEEnumLiteral(operatorEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR.SUPERIOR);

		initEEnum(grippeR_STATEEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GRIPPER_STATE.class, "GRIPPER_STATE");
		addEEnumLiteral(grippeR_STATEEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GRIPPER_STATE.OPEN);
		addEEnumLiteral(grippeR_STATEEEnum,
				fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GRIPPER_STATE.CLOSED);

		// Create resource
		createResource(eNS_URI);
	}

} //PolycreatePackageImpl
