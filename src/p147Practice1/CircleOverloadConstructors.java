package p147Practice1;

public class CircleOverloadConstructors {
	public static void main(String args[]) {
		Circle c1 = new Circle(4);
		System.out.println("c1.x = " + c1.x);
		System.out.println("c1.y = " + c1.y);
		System.out.println("c1.radius = " + c1.radius);
		
		Circle c2 = new Circle(17.5, 18.4, 6);
		System.out.println("c2.x = " + c2.x);
		System.out.println("c2.y = " + c2.y);
		System.out.println("c2.radius = " + c2.radius);
		
	}

}
