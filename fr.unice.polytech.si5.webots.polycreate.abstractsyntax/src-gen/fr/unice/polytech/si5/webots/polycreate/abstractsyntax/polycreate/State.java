/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getState_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // State
