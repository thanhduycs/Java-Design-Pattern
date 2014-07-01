package ReflectionTest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import Singleton.SingleObject;

public class ReflectMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException {

		// try {
		// int n = 3 / 0;
		// } catch(ArithmeticException a) {
		// System.out.println("zero");
		// }
		//
		// int i = -1;
		// int[] a1 = {1};
		// try {
		// System.out.println(a1[i]);
		// } catch(ArrayIndexOutOfBoundsException e)
		// {
		//
		// }

		Class clzz = ReflClass.class;

		Field[] fields = clzz.getDeclaredFields();

		Object obj = clzz.newInstance();

		for (Field field : fields) {
			String s = field.getName()
					+ Modifier.toString(field.getModifiers());

			field.setAccessible(true);
			s = s + "   " + field.get(obj);
			System.out.println(s);
		}
		
		List<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		Method method =  clzz.getMethod("echo", null);
		try {
			method.setAccessible(true);
			method.invoke(obj, null);
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
