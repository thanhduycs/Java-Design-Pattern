package AbtractFactorialPattern;

public class AbstractFactorialDemo {
	
	public static void main(String[] args) throws Exception
	{
		ProducerFactorial producer  = null;
		AbstractFactorial absFactorial  = null;
		
		Shape shape = null;
		Color color = null;

		producer = new ProducerFactorial();
		absFactorial = producer.getFactorial(ProducerFactorial.FACTORIAL_SHAPE);
		shape = absFactorial.createShape(ShapeFactorial.SHAPE_CIRLCE);
		shape.draw();
		
		shape = absFactorial.createShape(ShapeFactorial.SHAPE_SQUARE);
		shape.draw();
		
		absFactorial = producer.getFactorial(ProducerFactorial.FACTORIAL_COLOR);
		color = absFactorial.createCorlor(ColorFactorial.COLOR_GREEN,"i have green");
		color.show();
		
		color = absFactorial.createCorlor(ColorFactorial.COLOR_RED,"i have green");
		color.show();
		
		
	}
}
