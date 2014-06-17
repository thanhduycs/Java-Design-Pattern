package AbtractFactorialPattern;

public class ColorFactorial extends AbstractFactorial {

	public final static String COLOR_RED = "RED";
	public final static String COLOR_GREEN = "GREEN";
	public final static String COLOR_BLUE = "bLUE";

	public Shape createShape(String shapeType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Color createCorlor(String colorType, String colorObjectName) throws Exception {
		if (colorType.equalsIgnoreCase(COLOR_RED)) {
			return new Red();
		} else if (colorType.equalsIgnoreCase(COLOR_GREEN)) {
			return new Green(colorObjectName);
		}
		else if (colorType.equalsIgnoreCase(COLOR_BLUE)) {
			return new Blue();
		}
		return null;
	}

}
