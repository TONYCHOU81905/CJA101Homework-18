package hw9;

public class HW9_1 implements Runnable {
	
	int count=10;
	String name;
	
	public  HW9_1(String name) {
	this.name = name;	
	}

	@Override
	public void run() {
		
		while(count>0) {
			int bowl = 11-count;
			count--;
			System.out.println(name+"吃第"+bowl+"碗飯");
			try {
				int ramdonNumber = (int) (Math.random() * 2501) + 500;
				Thread.sleep(ramdonNumber);
			}catch (Exception e) {
				System.out.println("HW9_1_err"+e);
				// TODO: handle exception
			}
		}
		System.out.println(name+"吃完了!");
		
	}
	
	public static void main(String[] args) {
		HW9_1 hwRunable1= new HW9_1("饅頭人");
		Thread t1 = new Thread(hwRunable1);
		HW9_1 hwRunable2= new HW9_1("詹姆士");
		Thread t2 = new Thread(hwRunable2);
		System.out.println("大胃王比賽開始");
		t1.start();
		t2.start();
		// wait for both threads to finish
		try {
			t1.join();
			t2.join();
			System.out.println("大胃王比賽結束");
		} catch (InterruptedException e) {
		}
	}
	


}


