/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl#getGlobalTransitions <em>Global Transitions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.impl.RobotProgramImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotProgramImpl extends NamedElementImpl implements RobotProgram {
	/**
	 * The cached value of the '{@link #getGlobalTransitions() <em>Global Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> globalTransitions;

	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.ROBOT_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getGlobalTransitions() {
		if (globalTransitions == null) {
			globalTransitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS);
		}
		return globalTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentEList<State>(State.class, this,
					PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(State newInitialState, NotificationChain msgs) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE, oldInitialState, newInitialState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject) initialState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject) newInitialState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE,
					newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS:
			return ((InternalEList<?>) getGlobalTransitions()).basicRemove(otherEnd, msgs);
		case PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES:
			return ((InternalEList<?>) getOwnedStates()).basicRemove(otherEnd, msgs);
		case PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE:
			return basicSetInitialState(null, msgs);
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
		case PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS:
			return getGlobalTransitions();
		case PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES:
			return getOwnedStates();
		case PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE:
			return getInitialState();
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
		case PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS:
			getGlobalTransitions().clear();
			getGlobalTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES:
			getOwnedStates().clear();
			getOwnedStates().addAll((Collection<? extends State>) newValue);
			return;
		case PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE:
			setInitialState((State) newValue);
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
		case PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS:
			getGlobalTransitions().clear();
			return;
		case PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES:
			getOwnedStates().clear();
			return;
		case PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE:
			setInitialState((State) null);
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
		case PolycreatePackage.ROBOT_PROGRAM__GLOBAL_TRANSITIONS:
			return globalTransitions != null && !globalTransitions.isEmpty();
		case PolycreatePackage.ROBOT_PROGRAM__OWNED_STATES:
			return ownedStates != null && !ownedStates.isEmpty();
		case PolycreatePackage.ROBOT_PROGRAM__INITIAL_STATE:
			return initialState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PolycreatePackage.ROBOT_PROGRAM___START:
			start();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RobotProgramImpl
