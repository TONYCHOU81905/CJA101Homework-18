package hw5;

public class InkBrush extends Pen{

	public  InkBrush(String brand,int price) {
		super(brand,price);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
		System.out.println("削鉛筆再寫");
		
	}
}
