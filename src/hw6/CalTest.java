package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		Calculator calculator = new Calculator();
		boolean xResponse = false;
		boolean yResponse = false;

		try {
			while (!xResponse || !yResponse) {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入X值:");
				try {
					int xInt = sc.nextInt();
					xResponse = calculator.setX(xInt);
				} catch (Exception e) {
					System.out.println("輸入格式不正確");
					xResponse = false;
				}
				if (xResponse) {
					System.out.println("請輸入Y值:");
					int yInt = sc.nextInt();
					if (yInt < 0) {
						xResponse = false;
						System.out.println("次方為負數，結果回傳不為整數");
					} else {
						yResponse = calculator.setY(yInt);
						calculator.powerXY();

					}
				}
			}
		} catch (Exception e) {
			System.out.println("setX" + e.getMessage());
			// TODO: handle exception
		}
	}

}
