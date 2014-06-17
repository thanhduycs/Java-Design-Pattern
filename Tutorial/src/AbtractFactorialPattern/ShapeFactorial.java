package AbtractFactorialPattern;

public class ShapeFactorial extends AbstractFactorial {
	public final static String SHAPE_CIRLCE = "CIRCLE";
	public final static String SHAPE_SQUARE = "SHAPE_SQUARE";
	public final static String SHAPE_RECTANGLE = "SHAPE_RECTANGLE";

	public Shape createShape(String shapeType) throws Exception {
		if (shapeType.equalsIgnoreCase(SHAPE_CIRLCE)) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(SHAPE_RECTANGLE)) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase(SHAPE_SQUARE)) {
			return new Square();
		}
		throw new Exception("Unknown Shape: " + shapeType);
	}

	public Color createCorlor(String shapeType, String colorObjectName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
