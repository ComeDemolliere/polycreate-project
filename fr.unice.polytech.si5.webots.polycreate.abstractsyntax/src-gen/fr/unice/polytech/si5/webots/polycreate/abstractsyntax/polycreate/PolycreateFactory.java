/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage
 * @generated
 */
public interface PolycreateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreateFactory eINSTANCE = fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.PolycreateFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Robot Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Program</em>'.
	 * @generated
	 */
	RobotProgram createRobotProgram();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Move Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Action</em>'.
	 * @generated
	 */
	MoveAction createMoveAction();

	/**
	 * Returns a new object of class '<em>Turn Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Action</em>'.
	 * @generated
	 */
	TurnAction createTurnAction();

	/**
	 * Returns a new object of class '<em>Simple Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Condition</em>'.
	 * @generated
	 */
	SimpleCondition createSimpleCondition();

	/**
	 * Returns a new object of class '<em>Distance Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Condition</em>'.
	 * @generated
	 */
	DistanceCondition createDistanceCondition();

	/**
	 * Returns a new object of class '<em>Angle Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Condition</em>'.
	 * @generated
	 */
	AngleCondition createAngleCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolycreatePackage getPolycreatePackage();

} //PolycreateFactory
