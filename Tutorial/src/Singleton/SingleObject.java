package Singleton;

public class SingleObject {
	private static SingleObject instance = null;
	
	public static SingleObject getInstance() {
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	
	
	public void show() {
		System.out.println("SingleObject::show");
	}
	
	public void echo(String msg){
		System.out.println("SingleObject::echo => " + msg);
	}
}
