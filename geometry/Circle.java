package geometry;

public class Circle extends GeometricShape implements GeometricCal {
 
float radius;

public float getRadius() {
	return radius;
}

public void setRadius(float radius) {
	this.radius = radius;
}

public Circle(String color, float radius) {
	super(color);
	this.radius = radius;
}

@Override
public double getArea() {
	double math=radius*radius;
	// TODO Auto-generated method stub
	return math;
}

@Override
public double getPerimiter() {
	// TODO Auto-generated method stub
	return 0;
}
 
}
