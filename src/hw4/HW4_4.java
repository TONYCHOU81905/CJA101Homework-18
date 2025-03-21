package hw4;

import java.util.Scanner;

public class HW4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入要借多少錢： ");
		int loan = sc.nextInt();
		int hasMoneyNumber = 0;
		int[][] twoArray = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.print("有錢可借的員工編號為 ");
		for (int i = 0; i < twoArray[1].length; i++) {
			int money = twoArray[1][i];
			if (money >= loan) {
				System.out.print(twoArray[0][i] + " ");
				hasMoneyNumber++;
			}
		}

		System.out.print("共" + hasMoneyNumber + "人");

	}

}
