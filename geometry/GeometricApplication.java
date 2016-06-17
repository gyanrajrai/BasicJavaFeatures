package geometry;

public class GeometricApplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle circle1=new Circle("red",2.5f);
		Circle circle2=new Circle("Green",3.5f);	
		
		System.out.println(circle1.getColor()+":"+circle1.getRadius());
		System.out.println(circle2.getColor()+":"+circle1.getRadius());
		System.out.println("cilcle Area is "+circle1.getArea());
		
		//now overwrite circle color as yellow
		circle1.setColor("Yellow");
		System.out.println("circle color is"+circle1.getColor());
		
		Rectangle rect1=new Rectangle("red",3.4f,2.4f);
		Rectangle rect2=new Rectangle("Green",8.4f,9.4f);
		System.out.println("of Rectangle "+rect1.getColor()+","+rect1.getBreadth()+","+rect1.getLength());

		System.out.println("of Rectangle "+rect2.getColor()+","+rect2.getBreadth()+","+rect2.getLength());
		System.out.println(rect1.getArea() + "  area of Rectangle");
		Square sq=new Square("green",5.6f,54.f);
		Square sq2=new Square("green",5.6f,54.f);
		System.out.println("for Square"+sq.getColor()+","+sq.getLength());
		System.out.println(sq.getArea()+"  Area of Square");
	}

}
