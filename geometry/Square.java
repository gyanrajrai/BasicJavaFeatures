package geometry;

public class Square extends Rectangle implements GeometricCal{
	double lenth=breadth;

	public double getLenth() {
		return lenth;
	}

	public void setLenth(double lenth) {
		this.lenth = lenth;
		
	}

	/*public Square(String color, float length, float breadth, double lenth) {
		super(color, length, breadth);
		this.lenth = lenth;
	}*/

	public Square(String color, float length, float breadth) {
		super(color, length, breadth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getBreadth() {
		// TODO Auto-generated method stub
		return super.getBreadth();
	}

	@Override
	public double getArea() {
		
		// TODO Auto-generated method stub
		return super.getArea();
	}
	
	

}
