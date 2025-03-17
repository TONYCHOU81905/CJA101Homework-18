package hw3;

import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()*10);
		System.out.println("請開始作答作業二第一小題👇");
		Scanner sc = new Scanner(System.in);
		while(sc.nextInt()!=randomNumber) {
			System.out.println("猜錯了!!再試一次");
		}
		
		System.out.println("你答對了，恭喜你進入第二關!!!!");

		int randomNumber1 = (int) (Math.random() * 100);
		System.out.println("請開始作答作業二第二小題👇" );
		int enterValue = sc.nextInt();
		
		while (enterValue != randomNumber1) {
			if(enterValue>randomNumber1) {
				System.out.println("猜錯了!!再小一點");
			}else {
				System.out.println("猜錯了!!再大一點");
			}
			enterValue = sc.nextInt();
		}

		System.out.println("你答對了，恭喜你完成作業二-2");
	}

}
