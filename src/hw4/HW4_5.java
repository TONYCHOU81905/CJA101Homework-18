package hw4;

import java.util.Scanner;

public class HW4_5 {

	public static void main(String[] args) {
		HW4_5 hw4_5 = new HW4_5();
		System.out.print("請輸入年份：");
		Scanner sc = new Scanner(System.in);
		int scYear = sc.nextInt();
		boolean response = hw4_5.checkYear(scYear);
		int totalDays = hw4_5.countDays(response);
		System.out.println("=====================");
		System.out.print("輸入的日期為該年第" + totalDays + "天");
	}

	public boolean checkYear(int year) {
		int multiple4 = year % 4;
		int multiple100 = year % 100;
		int multiple400 = year % 400;
		int multiple1000 = year % 1000;

		if (multiple4 == 0 && multiple100 != 0) {
			return true;
		} else if (multiple400 == 0) {
			return true;
		} else if (multiple1000 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int countDays(boolean isYear) {
		int totalDays = 0;
		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入月份：");
		int scMonth = sc.nextInt();
		while (scMonth < 1 || scMonth > 12) {
			System.out.print("請輸入正確月份：");
			scMonth = sc.nextInt();
		}
		int scDay = sc.nextInt();
		while (scDay < 1 || scDay > monthDays[(scMonth - 1)]) {
			System.out.print("請輸入正確日期：");
			scDay = sc.nextInt();
		}
		if (isYear) {
			monthDays[1] = 29;
		}
		for (int i = 0; i <= (scMonth - 2); i++) {
			// -2是因為(Array是從0開始計算，且當月的日期，不會被記滿，多出來的用「日」來補足)
			totalDays += monthDays[i];
		}
		totalDays += scDay;
		return totalDays;
	}

}
