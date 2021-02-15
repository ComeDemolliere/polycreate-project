/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.util;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolycreateSwitch<Adapter> modelSwitch = new PolycreateSwitch<Adapter>() {
		@Override
		public Adapter caseRobotProgram(RobotProgram object) {
			return createRobotProgramAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseMoveAction(MoveAction object) {
			return createMoveActionAdapter();
		}

		@Override
		public Adapter caseTurnAction(TurnAction object) {
			return createTurnActionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseSimpleCondition(SimpleCondition object) {
			return createSimpleConditionAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseObjectCondition(ObjectCondition object) {
			return createObjectConditionAdapter();
		}

		@Override
		public Adapter caseDistanceCondition(DistanceCondition object) {
			return createDistanceConditionAdapter();
		}

		@Override
		public Adapter caseAngleCondition(AngleCondition object) {
			return createAngleConditionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram <em>Robot Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram
	 * @generated
	 */
	public Adapter createRobotProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction
	 * @generated
	 */
	public Adapter createMoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction <em>Turn Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction
	 * @generated
	 */
	public Adapter createTurnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition <em>Simple Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition
	 * @generated
	 */
	public Adapter createSimpleConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition <em>Object Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition
	 * @generated
	 */
	public Adapter createObjectConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition <em>Distance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition
	 * @generated
	 */
	public Adapter createDistanceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition <em>Angle Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition
	 * @generated
	 */
	public Adapter createAngleConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolycreateAdapterFactory
