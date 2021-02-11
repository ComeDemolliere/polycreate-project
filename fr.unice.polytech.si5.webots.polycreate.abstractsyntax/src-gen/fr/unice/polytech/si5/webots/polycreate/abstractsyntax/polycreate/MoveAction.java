/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getMoveAction()
 * @model
 * @generated
 */
public interface MoveAction extends Action {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
	 * @see #setDirection(DIRECTION)
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getMoveAction_Direction()
	 * @model
	 * @generated
	 */
	DIRECTION getDirection();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DIRECTION
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DIRECTION value);

} // MoveAction
