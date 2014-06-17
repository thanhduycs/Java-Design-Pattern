package Singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		SingleObject singleObj = SingleObject.getInstance();
		singleObj.echo("what is your name ?");

	}

}
