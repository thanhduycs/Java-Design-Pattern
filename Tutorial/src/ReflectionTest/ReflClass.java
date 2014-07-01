package ReflectionTest;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflClass extends RC3 {
	public String fieldString1;
	private String fieldString2;
	protected String fieldString3;
	public static String fieldString4;
	
	
	public ReflClass() {
		super();
		this.fieldString1 = "str one";
		this.fieldString2 = "str two";
		this.fieldString3 = "str three";
		fieldString4 = "str four";
	}
	public String getFieldString2() {
		return fieldString2;
	}
	public void setFieldString2(String fieldString2) {
		this.fieldString2 = fieldString2;
	}
//	@Override
//	public void echo() {
////		try {
////			Method method = RC1.class.getMethod("echo", null);
////			method.invoke(this, null);
////		} catch (NoSuchMethodException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (SecurityException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IllegalAccessException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (IllegalArgumentException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} catch (InvocationTargetException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
	
	public <T extends Comparable<T>> void genericMethod(T a ,T b)
	{
		if (a.compareTo(b) == 0) {
			
		}
		
		Arrays.<Double> asList(1.0,3.0,4.0);
		Arrays.<Integer> asList(1,3,4);
		
		List<?> ass  = new ArrayList<Integer>();
		//List<Object> vvv  = new ArrayList<Integer>();
	}
	
}
