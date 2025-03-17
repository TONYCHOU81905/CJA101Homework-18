package hw3;
 import java.util.Arrays;
 import java.util.Scanner;
 
 public class HW3_1 {
 
 	public static void main(String[] args) {
 		int triangleArray[] = new int[3];
 		Scanner sc = new Scanner(System.in);
 		for (int i = 0; i < triangleArray.length; i++) {
 			System.out.println("這是請輸入第"+(i+1)+"個數字");
 			triangleArray[i] = sc.nextInt();
 		}
 		Arrays.sort(triangleArray);
 		int data1 = triangleArray[0];
 		int data2 = triangleArray[1];
 		// MAx Value
 		int data3 = triangleArray[2];
 
 		if (data1 == 0 || data2 == 0 || data3 == 0) {
 			System.out.println("這不是三角形");
 		} else {
 			// 判斷何種三角形
 			HW3_1 hw = new HW3_1();
 			if (hw.isRightTriangle(data1, data2, data3)) {
 				System.out.println("這是直角三角形");
 			} else if (hw.isSameTriangle(data1, data2, data3)) {
 				System.out.println("這是等腰三角形");
 			} else {
 				System.out.println("這是這是其他三角形");
 			}
 		}
 	}
 
 	public boolean isRightTriangle(int data1, int data2, int data3) {
 		if ((data1 * data1 + data2 * data2) == data3 * data3) {
 			return true;
 		} else {
 			return false;
 		}
 
 	}
 
 	public boolean isSameTriangle(int data1, int data2, int data3) {
 
 		if (data1 == data2 || data2 == data3 || data1 == data3) {
 			return true;
 		} else {
 			return false;
 		}
 
 	}
 
 }