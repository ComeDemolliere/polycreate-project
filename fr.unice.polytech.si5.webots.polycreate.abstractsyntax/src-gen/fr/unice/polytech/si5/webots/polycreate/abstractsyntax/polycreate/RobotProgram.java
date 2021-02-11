/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getGlobalTransitions <em>Global Transitions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getRobotProgram()
 * @model
 * @generated
 */
public interface RobotProgram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Global Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Transitions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getRobotProgram_GlobalTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getGlobalTransitions();

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getRobotProgram_OwnedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(State)
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getRobotProgram_InitialState()
	 * @model containment="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

} // RobotProgram
