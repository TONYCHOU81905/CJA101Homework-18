package hw5;

public class HW5_6 {
	
	public static void main(String[] args) {
		Pen p1 = new Pencil("SKB", 100);
		Pen p2 = new InkBrush("", 100);	
		
		double pp = p1.getPrice(0.8);
		double ip = p2.getPrice(0.9);
		System.out.println(pp);
		System.out.println(ip);
		p1.write();
		p2.write();
	}

}
