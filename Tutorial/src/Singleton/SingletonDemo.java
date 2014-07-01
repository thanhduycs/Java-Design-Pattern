package Singleton;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SingletonDemo {

	public static void main(String[] args) {
		SingleObject singleObj = SingleObject.getInstance();
		singleObj.echo("what is your name ?");
		
		

	}

}
