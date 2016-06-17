package geometry;

public class GeometricShape {

	public String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GeometricShape(String color) {
		//Parameterized constructor is used to provide different values to the distinct objects.

		super();
		this.color = color;
	}

	
}
