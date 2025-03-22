package hw5;

public class MyRectangle {
	private double width;
	private double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth;
	}

	//無建構子
	public MyRectangle() {

	}

	///有建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
