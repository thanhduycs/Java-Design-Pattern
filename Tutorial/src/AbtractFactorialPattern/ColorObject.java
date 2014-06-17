package AbtractFactorialPattern;

public abstract class ColorObject {
	private String colorObjectName;
	
	public ColorObject (String colorObjectName) {
		this.setColorObjectName(colorObjectName);
	}

	public String getColorObjectName() {
		return colorObjectName;
	}

	public void setColorObjectName(String colorObjectName) {
		this.colorObjectName = colorObjectName;
	}
}
