/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getNextState <em>Next State</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Next State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next State</em>' reference.
	 * @see #setNextState(State)
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getTransition_NextState()
	 * @model required="true"
	 * @generated
	 */
	State getNextState();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition#getNextState <em>Next State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next State</em>' reference.
	 * @see #getNextState()
	 * @generated
	 */
	void setNextState(State value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getTransition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // Transition
