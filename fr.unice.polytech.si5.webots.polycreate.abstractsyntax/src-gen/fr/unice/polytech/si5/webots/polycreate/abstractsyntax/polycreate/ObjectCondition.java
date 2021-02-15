/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition#getCameraType <em>Camera Type</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getObjectCondition()
 * @model abstract="true"
 * @generated
 */
public interface ObjectCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Camera Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Type</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
	 * @see #setCameraType(CAMERATYPE)
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getObjectCondition_CameraType()
	 * @model
	 * @generated
	 */
	CAMERATYPE getCameraType();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition#getCameraType <em>Camera Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Type</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.CAMERATYPE
	 * @see #getCameraType()
	 * @generated
	 */
	void setCameraType(CAMERATYPE value);

} // ObjectCondition
