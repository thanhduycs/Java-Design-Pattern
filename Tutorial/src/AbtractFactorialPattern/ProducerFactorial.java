package AbtractFactorialPattern;

public class ProducerFactorial {
	public final static String FACTORIAL_SHAPE = "FACTORIAL_SHAPE";
	public final static String FACTORIAL_COLOR = "FACTORIAL_COLOR";
	
	public AbstractFactorial getFactorial(String factorialTypeName) {
		if (factorialTypeName.equalsIgnoreCase(FACTORIAL_SHAPE))
		{
			return new ShapeFactorial();
		} else if (factorialTypeName.equalsIgnoreCase(FACTORIAL_COLOR)) {
			return new ColorFactorial();
		}
		return null;
		
	}
}
