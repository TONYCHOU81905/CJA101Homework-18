package hw5;

public class HW5_2 {

	public static void main(String[] args) {
		HW5_2 hw = new HW5_2();
		hw.ranAvg();

	}

	public void ranAvg() {
		int[] randomArrays = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.random() * 100);
			randomArrays[i] = randomNumber;
		}
		
		System.out.println("本次亂數結果:");
		System.out.println();
		for (int i = 0; i<randomArrays.length ; i++) {
			System.out.print(randomArrays[i]+" ");
			sum+=randomArrays[i];
		}
		System.out.println();
		System.out.println(sum/10);
		
	}

}
