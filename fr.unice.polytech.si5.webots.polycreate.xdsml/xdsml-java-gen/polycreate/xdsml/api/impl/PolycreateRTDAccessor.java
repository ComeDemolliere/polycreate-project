/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package polycreate.xdsml.api.impl;
import org.eclipse.emf.ecore.EObject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class PolycreateRTDAccessor {
	public static java.util.Timer getTimer(fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action eObject) {
		return (java.util.Timer)  getAspectProperty(eObject, "fr.unice.polytech.si5.webots.polycreate.Polycreate", "fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect", "timer");
	}
	public static boolean setTimer(fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Action eObject, java.util.Timer newValue) {
		return setAspectProperty(eObject, "fr.unice.polytech.si5.webots.polycreate.Polycreate", "fr.unice.polytech.si5.webots.polycreate.rewritingrules.ActionAspect", "timer", newValue);
	}
	public static fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler getControler(fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram eObject) {
		return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)  getAspectProperty(eObject, "fr.unice.polytech.si5.webots.polycreate.Polycreate", "fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspect", "controler");
	}
	public static boolean setControler(fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram eObject, fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler newValue) {
		return setAspectProperty(eObject, "fr.unice.polytech.si5.webots.polycreate.Polycreate", "fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspect", "controler", newValue);
	}

	public static Object getAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		if (aspect == null) {
			return null;
		}
		Object res = null;
		 try {
			res = aspect.getDeclaredMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()).invoke(eObject, eObject);
			if (res != null) {
				return res;
			}else {
				return null;
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public static boolean setAspectProperty(EObject eObject, String languageName, String aspectName, String propertyName, Object newValue) {
		List<Class<?>> aspects = K3DslHelper.getAspectsOn(languageName, eObject.getClass());
		Class<?> aspect = null;
		for (Class<?> a : aspects) {
			try {
				if (Class.forName(aspectName).isAssignableFrom(a)) {
					aspect = a;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			}
		}
		if (aspect == null) {
			return false;
		}
			 try {
				 aspect.getMethod(propertyName, ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className(), newValue.getClass()).invoke(eObject, eObject, newValue);
				return true;
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : ((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).getClass().getInterfaces()) {
						
						try {
							aspect.getMethod(propertyName, c, newValue.getClass()).invoke(eObject, eObject, newValue);
							return true;
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+((fr.inria.diverse.k3.al.annotationprocessor.Aspect)aspect.getAnnotations()[0]).className()+"::set"+propertyName);
						}
					}
				}
			return false;
	}
};