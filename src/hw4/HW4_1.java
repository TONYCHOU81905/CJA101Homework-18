package hw4;

public class HW4_1 {
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {
		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		int average = sum / (x.length);
		System.out.println("所有元素的平均值:" + average);
		System.out.println();
		System.out.print("大於平均值的元素：");
		;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > average) {
				System.out.print(x[i] + " ,");
			}
		}
	}
}
