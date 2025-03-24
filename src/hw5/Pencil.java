package hw5;

public class Pencil extends Pen {

	public Pencil(String brand, int price) {
		super(brand, price);
	}

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
		// TODO Auto-generated method stub

	}

}
