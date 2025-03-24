package hw5;

public abstract class Pen {

	private String brand;
	private int price;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public double getPrice(double discount) {
		return price*discount;
	}

	public Pen() {

	}

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	public abstract void write();

}
