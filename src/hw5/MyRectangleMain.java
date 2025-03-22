package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle t1 = new MyRectangle();
		t1.setWidth(10);
		t1.setDepth(20);
		MyRectangle t2 = new MyRectangle(10, 20);
		System.out.println(t1.getArea());
		System.out.println(t2.getArea());
	}

}
