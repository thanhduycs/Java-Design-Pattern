package FactorialPattern;

public class ShapeDemo {

	public static void main(String[] args) throws Exception {
		Shape shape = null;
		ShapeFactorial shapeFac = new ShapeFactorial();
		
		shape = shapeFac.createShape(ShapeFactorial.SHAPE_CIRLCE);
		shape.draw();
		
		shape = shapeFac.createShape(ShapeFactorial.SHAPE_SQUARE);
		shape.draw();
		
		shape = shapeFac.createShape(ShapeFactorial.SHAPE_RECTANGLE);
		shape.draw();
		
		

	}

}
