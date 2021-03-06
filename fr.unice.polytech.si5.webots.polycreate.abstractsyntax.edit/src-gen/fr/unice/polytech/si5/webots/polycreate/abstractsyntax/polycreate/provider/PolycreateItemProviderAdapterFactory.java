/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.provider;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.util.PolycreateAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreateItemProviderAdapterFactory extends PolycreateAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotProgramItemProvider robotProgramItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotProgramAdapter() {
		if (robotProgramItemProvider == null) {
			robotProgramItemProvider = new RobotProgramItemProvider(this);
		}

		return robotProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveActionItemProvider moveActionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveActionAdapter() {
		if (moveActionItemProvider == null) {
			moveActionItemProvider = new MoveActionItemProvider(this);
		}

		return moveActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnActionItemProvider turnActionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurnActionAdapter() {
		if (turnActionItemProvider == null) {
			turnActionItemProvider = new TurnActionItemProvider(this);
		}

		return turnActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConditionItemProvider simpleConditionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleConditionAdapter() {
		if (simpleConditionItemProvider == null) {
			simpleConditionItemProvider = new SimpleConditionItemProvider(this);
		}

		return simpleConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceConditionItemProvider distanceConditionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistanceConditionAdapter() {
		if (distanceConditionItemProvider == null) {
			distanceConditionItemProvider = new DistanceConditionItemProvider(this);
		}

		return distanceConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleConditionItemProvider angleConditionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAngleConditionAdapter() {
		if (angleConditionItemProvider == null) {
			angleConditionItemProvider = new AngleConditionItemProvider(this);
		}

		return angleConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GripActionItemProvider gripActionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGripActionAdapter() {
		if (gripActionItemProvider == null) {
			gripActionItemProvider = new GripActionItemProvider(this);
		}

		return gripActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (robotProgramItemProvider != null)
			robotProgramItemProvider.dispose();
		if (transitionItemProvider != null)
			transitionItemProvider.dispose();
		if (stateItemProvider != null)
			stateItemProvider.dispose();
		if (moveActionItemProvider != null)
			moveActionItemProvider.dispose();
		if (turnActionItemProvider != null)
			turnActionItemProvider.dispose();
		if (simpleConditionItemProvider != null)
			simpleConditionItemProvider.dispose();
		if (distanceConditionItemProvider != null)
			distanceConditionItemProvider.dispose();
		if (angleConditionItemProvider != null)
			angleConditionItemProvider.dispose();
		if (gripActionItemProvider != null)
			gripActionItemProvider.dispose();
	}

}
