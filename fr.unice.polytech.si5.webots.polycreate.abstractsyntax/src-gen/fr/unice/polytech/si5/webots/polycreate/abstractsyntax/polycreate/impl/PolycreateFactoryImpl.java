/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreateFactoryImpl extends EFactoryImpl implements PolycreateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolycreateFactory init() {
		try {
			PolycreateFactory thePolycreateFactory = (PolycreateFactory) EPackage.Registry.INSTANCE
					.getEFactory(PolycreatePackage.eNS_URI);
			if (thePolycreateFactory != null) {
				return thePolycreateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolycreateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PolycreatePackage.ROBOT_PROGRAM:
			return createRobotProgram();
		case PolycreatePackage.TRANSITION:
			return createTransition();
		case PolycreatePackage.STATE:
			return createState();
		case PolycreatePackage.MOVE_ACTION:
			return createMoveAction();
		case PolycreatePackage.TURN_ACTION:
			return createTurnAction();
		case PolycreatePackage.SIMPLE_CONDITION:
			return createSimpleCondition();
		case PolycreatePackage.DISTANCE_CONDITION:
			return createDistanceCondition();
		case PolycreatePackage.ANGLE_CONDITION:
			return createAngleCondition();
		case PolycreatePackage.GRIP_ACTION:
			return createGripAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PolycreatePackage.DETECTION:
			return createDETECTIONFromString(eDataType, initialValue);
		case PolycreatePackage.DIRECTION:
			return createDIRECTIONFromString(eDataType, initialValue);
		case PolycreatePackage.CAMERATYPE:
			return createCAMERATYPEFromString(eDataType, initialValue);
		case PolycreatePackage.OPERATOR:
			return createOPERATORFromString(eDataType, initialValue);
		case PolycreatePackage.GRIPPER_STATE:
			return createGRIPPER_STATEFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PolycreatePackage.DETECTION:
			return convertDETECTIONToString(eDataType, instanceValue);
		case PolycreatePackage.DIRECTION:
			return convertDIRECTIONToString(eDataType, instanceValue);
		case PolycreatePackage.CAMERATYPE:
			return convertCAMERATYPEToString(eDataType, instanceValue);
		case PolycreatePackage.OPERATOR:
			return convertOPERATORToString(eDataType, instanceValue);
		case PolycreatePackage.GRIPPER_STATE:
			return convertGRIPPER_STATEToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProgram createRobotProgram() {
		RobotProgramImpl robotProgram = new RobotProgramImpl();
		return robotProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAction createMoveAction() {
		MoveActionImpl moveAction = new MoveActionImpl();
		return moveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnAction createTurnAction() {
		TurnActionImpl turnAction = new TurnActionImpl();
		return turnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCondition createSimpleCondition() {
		SimpleConditionImpl simpleCondition = new SimpleConditionImpl();
		return simpleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceCondition createDistanceCondition() {
		DistanceConditionImpl distanceCondition = new DistanceConditionImpl();
		return distanceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleCondition createAngleCondition() {
		AngleConditionImpl angleCondition = new AngleConditionImpl();
		return angleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripAction createGripAction() {
		GripActionImpl gripAction = new GripActionImpl();
		return gripAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DETECTION createDETECTIONFromString(EDataType eDataType, String initialValue) {
		DETECTION result = DETECTION.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDETECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIRECTION createDIRECTIONFromString(EDataType eDataType, String initialValue) {
		DIRECTION result = DIRECTION.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAMERATYPE createCAMERATYPEFromString(EDataType eDataType, String initialValue) {
		CAMERATYPE result = CAMERATYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCAMERATYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPERATOR createOPERATORFromString(EDataType eDataType, String initialValue) {
		OPERATOR result = OPERATOR.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPERATORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRIPPER_STATE createGRIPPER_STATEFromString(EDataType eDataType, String initialValue) {
		GRIPPER_STATE result = GRIPPER_STATE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGRIPPER_STATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreatePackage getPolycreatePackage() {
		return (PolycreatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolycreatePackage getPackage() {
		return PolycreatePackage.eINSTANCE;
	}

} //PolycreateFactoryImpl
