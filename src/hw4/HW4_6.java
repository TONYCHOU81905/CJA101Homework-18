package hw4;

import java.util.Arrays;

public class HW4_6 {

	public static void main(String[] args) {
		int scoresArray[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int hightestArray[] = new int[6];
		for (int i = 0; i < scoresArray.length; i++) {
			int highestStudent = 1;
			int highestScores = 0;
			for (int s = 0; s < scoresArray[i].length; s++) {
				int number = s + 1;
				int scores = scoresArray[i][s];
				if (s == 0) {
					// 建立初始值
					highestStudent = number;
					highestScores = scores;
				} else {
					// 開始比較
					if (scores > highestScores) {
						// 遇到比上次記錄的最高分還高的話，進行學號及分數的取代
						highestStudent = number;
						highestScores = scores;
					}
				}
			}
			// 紀錄本次最高分的學號及分數
			hightestArray[i] = highestStudent;
		}
		System.out.println("====================");
		HW4_6 hw = new HW4_6();
		for (int i = 1; i < 9; i++) {
			hw.count(hightestArray, i);
		}

	}

	public void count(int[] hightestArray, int studentNumber) {
		int total = 0;
		for (int i = 0; i < hightestArray.length; i++) {
			if (hightestArray[i] == studentNumber) {
				total++;
			}

		}
		System.out.println(studentNumber + "號同學共考過" + total + "次最高分");

	}

}
