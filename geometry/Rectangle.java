package geometry;

public class Rectangle extends GeometricShape implements GeometricCal {
	float length;
	float breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;

	}

	public Rectangle(String color, float length, float breadth) {
		/*Constructor in java is a special type of method that is used to initialize the object.

Java constructor is invoked at the time of object creation.
 It constructs the values i.e. provides data for the object that is why it is known as constructor.*/
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double MATH=(breadth*length);
		return MATH;
	}

	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
