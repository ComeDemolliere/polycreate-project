/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition#getDetectionType <em>Detection Type</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getSimpleCondition()
 * @model
 * @generated
 */
public interface SimpleCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Detection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection Type</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION
	 * @see #setDetectionType(DETECTION)
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getSimpleCondition_DetectionType()
	 * @model
	 * @generated
	 */
	DETECTION getDetectionType();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition#getDetectionType <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection Type</em>' attribute.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION
	 * @see #getDetectionType()
	 * @generated
	 */
	void setDetectionType(DETECTION value);

} // SimpleCondition
