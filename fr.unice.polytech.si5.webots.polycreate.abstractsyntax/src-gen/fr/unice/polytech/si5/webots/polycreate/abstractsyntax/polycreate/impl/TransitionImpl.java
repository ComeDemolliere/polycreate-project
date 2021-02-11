/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl#getNextState <em>Next State</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.TransitionImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getNextState() <em>Next State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextState()
	 * @generated
	 * @ordered
	 */
	protected State nextState;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getNextState() {
		if (nextState != null && nextState.eIsProxy()) {
			InternalEObject oldNextState = (InternalEObject) nextState;
			nextState = (State) eResolveProxy(oldNextState);
			if (nextState != oldNextState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PolycreatePackage.TRANSITION__NEXT_STATE,
							oldNextState, nextState));
			}
		}
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetNextState() {
		return nextState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextState(State newNextState) {
		State oldNextState = nextState;
		nextState = newNextState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.TRANSITION__NEXT_STATE,
					oldNextState, nextState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					PolycreatePackage.TRANSITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycreatePackage.TRANSITION__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.TRANSITION__NEXT_STATE:
			if (resolve)
				return getNextState();
			return basicGetNextState();
		case PolycreatePackage.TRANSITION__CONDITIONS:
			return getConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycreatePackage.TRANSITION__NEXT_STATE:
			setNextState((State) newValue);
			return;
		case PolycreatePackage.TRANSITION__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
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
		case PolycreatePackage.TRANSITION__NEXT_STATE:
			setNextState((State) null);
			return;
		case PolycreatePackage.TRANSITION__CONDITIONS:
			getConditions().clear();
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
		case PolycreatePackage.TRANSITION__NEXT_STATE:
			return nextState != null;
		case PolycreatePackage.TRANSITION__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
