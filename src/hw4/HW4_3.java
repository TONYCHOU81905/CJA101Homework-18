package hw4;

public class HW4_3 {
//	有個字串陣列如下 (八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示：字元比對，String方法)

	public static void main(String[] args) {
		String x[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			String ball = x[i];
			// 找到每個行星名稱
			for (int j = 0; j < x[i].length(); j++) {
				// 顯示行星裡面個別單字
				Character wordChar = ball.charAt(j);
				if (wordChar.equals('a') || wordChar.equals('e') || wordChar.equals('i') || wordChar.equals('o')
						|| wordChar.equals('u')) {
					sum++;
				}
			}
		}
		System.out.println("八大行星中共有:" + sum+"個母音");
	}
}
