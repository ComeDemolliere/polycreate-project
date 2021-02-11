/**
 */
package fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DETECTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.PolycreatePackage#getDETECTION()
 * @model
 * @generated
 */
public enum DETECTION implements Enumerator {
	/**
	 * The '<em><b>COLLISION LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLISION_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLISION_LEFT(0, "COLLISION_LEFT", "COLLISION_LEFT"),

	/**
	 * The '<em><b>COLLISION RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLISION_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLISION_RIGHT(1, "COLLISION_RIGHT", "COLLISION_RIGHT"),

	/**
	 * The '<em><b>VIRTUAL WALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_WALL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_WALL(2, "VIRTUAL_WALL", "VIRTUAL_WALL"),

	/**
	 * The '<em><b>CLIFF LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIFF_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIFF_LEFT(3, "CLIFF_LEFT", "CLIFF_LEFT"),

	/**
	 * The '<em><b>CLIFF RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIFF_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIFF_RIGHT(4, "CLIFF_RIGHT", "CLIFF_RIGHT"),

	/**
	 * The '<em><b>CLIFF FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIFF_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIFF_FRONT(5, "CLIFF_FRONT", "CLIFF_FRONT");

	/**
	 * The '<em><b>COLLISION LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLISION LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLISION_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLISION_LEFT_VALUE = 0;

	/**
	 * The '<em><b>COLLISION RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLISION RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLISION_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLISION_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>VIRTUAL WALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL WALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_WALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_WALL_VALUE = 2;

	/**
	 * The '<em><b>CLIFF LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIFF LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIFF_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIFF_LEFT_VALUE = 3;

	/**
	 * The '<em><b>CLIFF RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIFF RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIFF_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIFF_RIGHT_VALUE = 4;

	/**
	 * The '<em><b>CLIFF FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIFF FRONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIFF_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIFF_FRONT_VALUE = 5;

	/**
	 * An array of all the '<em><b>DETECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DETECTION[] VALUES_ARRAY = new DETECTION[] { COLLISION_LEFT, COLLISION_RIGHT, VIRTUAL_WALL,
			CLIFF_LEFT, CLIFF_RIGHT, CLIFF_FRONT, };

	/**
	 * A public read-only list of all the '<em><b>DETECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DETECTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DETECTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DETECTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DETECTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DETECTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DETECTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DETECTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DETECTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DETECTION get(int value) {
		switch (value) {
		case COLLISION_LEFT_VALUE:
			return COLLISION_LEFT;
		case COLLISION_RIGHT_VALUE:
			return COLLISION_RIGHT;
		case VIRTUAL_WALL_VALUE:
			return VIRTUAL_WALL;
		case CLIFF_LEFT_VALUE:
			return CLIFF_LEFT;
		case CLIFF_RIGHT_VALUE:
			return CLIFF_RIGHT;
		case CLIFF_FRONT_VALUE:
			return CLIFF_FRONT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DETECTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DETECTION
