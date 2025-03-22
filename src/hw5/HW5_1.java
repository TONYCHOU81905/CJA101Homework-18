package hw5;

import java.util.Scanner;

public class HW5_1 {
	public static void main(String[] args) {
		HW5_1 hw5_1 = new HW5_1();
		System.out.println("請輸入寬與高");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		hw5_1.startSquare(rows, columns);

	}

	public void startSquare(int rows, int columns) {
		for (int c = 0; c < columns; c++) {
			for (int r = 0; r < rows; r++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
