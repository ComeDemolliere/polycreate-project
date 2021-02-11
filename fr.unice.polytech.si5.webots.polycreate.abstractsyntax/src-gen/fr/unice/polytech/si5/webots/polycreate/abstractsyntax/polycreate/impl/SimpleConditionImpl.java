/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DETECTION;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.SimpleConditionImpl#getDetectionType <em>Detection Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleConditionImpl extends ConditionImpl implements SimpleCondition {
	/**
	 * The default value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DETECTION DETECTION_TYPE_EDEFAULT = DETECTION.COLLISION_LEFT;

	/**
	 * The cached value of the '{@link #getDetectionType() <em>Detection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectionType()
	 * @generated
	 * @ordered
	 */
	protected DETECTION detectionType = DETECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.SIMPLE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DETECTION getDetectionType() {
		return detectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectionType(DETECTION newDetectionType) {
		DETECTION oldDetectionType = detectionType;
		detectionType = newDetectionType == null ? DETECTION_TYPE_EDEFAULT : newDetectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.SIMPLE_CONDITION__DETECTION_TYPE,
					oldDetectionType, detectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.SIMPLE_CONDITION__DETECTION_TYPE:
			return getDetectionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycreatePackage.SIMPLE_CONDITION__DETECTION_TYPE:
			setDetectionType((DETECTION) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PolycreatePackage.SIMPLE_CONDITION__DETECTION_TYPE:
			setDetectionType(DETECTION_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PolycreatePackage.SIMPLE_CONDITION__DETECTION_TYPE:
			return detectionType != DETECTION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (detectionType: ");
		result.append(detectionType);
		result.append(')');
		return result.toString();
	}

} //SimpleConditionImpl
