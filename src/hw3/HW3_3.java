package hw3;
 
 import java.security.PublicKey;
 import java.util.Arrays;
 import java.util.Scanner;
 
 public class HW3_3 {
 
 	public static void main(String[] args) {
 		HW3_3 a = new HW3_3();
 		Scanner sc = new Scanner(System.in);
 		int excludeArrays[];
 		int countIn = 0;
 		System.out.println("阿文！請輸入1-9之間的數字👇");
 		int hateValue = sc.nextInt();
 		while (hateValue < 1 || hateValue > 9) {
 			System.out.println("阿文...請輸入1-9之間的數字，再輸入一次👇");
 			sc.next();
 		}
 
 		if (hateValue > 4) {
 			excludeArrays = new int[44];
 		} else {
 			excludeArrays = new int[35];
 		}
 		System.out.println("阿文討厭數字" + hateValue);
 
 		for (int i = 1; i < 50; i++) {
 			//十位數字
 			int tenValue = (int) (i / 10);
 			if (i % 10 != hateValue && tenValue != hateValue) {
 				excludeArrays[countIn] = i;
 				countIn++;
 				System.out.print(i + " ,");
 			}
 		}
 		System.out.println();
 		System.out.println("阿文總計可以選擇" + (excludeArrays.length) + "數字");
 
 		// 數字為1-49，選擇永遠不會被選到的當作預設值，避免預設值0永遠都被當作重複值
 		int chooseValueArray[] = { 50, 50, 50, 50, 50, 50 };
 		int finalValueArray[] = new int[6];
 		int insertCount = 0;
 
 		while (insertCount < 6) {
 			int randomNumber = (int) (Math.random() * (excludeArrays.length));
 			boolean answer = a.isDuplicate(chooseValueArray, randomNumber);
 			if (!answer) {
 				chooseValueArray[insertCount] = randomNumber;
 				insertCount++;
 			}
 		}
 		Arrays.sort(chooseValueArray);
 		System.out.println("電腦選號結果如下👇");
 		// 轉化位置為數值
 		for (int i = 0; i < chooseValueArray.length; i++) {
 			finalValueArray[i] = excludeArrays[chooseValueArray[i]];
 			System.out.print(finalValueArray[i] + " ,");
 		}
 
 	}
 
 	//「排除討厭數字陣列」的順序位置，用isDuplicate將非重複位置用chooseValueArray記起來，最後再透過記下來的位置跟「排除討厭數字陣列」實際的數值進行轉換
 	public boolean isDuplicate(int[] chosenArray, int randomNumber) {
 		for (int i = 0; i < chosenArray.length; i++) {
 			if (chosenArray[i] == randomNumber) {
 				System.out.println(randomNumber + "重複");
 				return true;
 			}
 
 		}
 		return false;
 	}
 
 }