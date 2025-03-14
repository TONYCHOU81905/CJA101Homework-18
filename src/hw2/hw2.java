package hw2;

public class hw2 {

	public static void main(String[] args) {
//
////		Q1
		System.out.println("==============Q1答案==============");
		for (int firstInt = 1; firstInt < 10; firstInt++) {
			int backInt = 1;
			while (backInt < 10) {
				System.out.println(firstInt + "*" + backInt + "=" + (firstInt * backInt));
				backInt++;
			}
		}
//
////		Q2
		System.out.println("==============Q2答案==============");
		for (int firstInt = 1; firstInt < 10; firstInt++) {
			int backInt = 1;
			do {
				System.out.println(firstInt + "*" + backInt + "=" + (firstInt * backInt));
				backInt++;
			} while (backInt < 10);
		}
//
////		Q3
		System.out.println("==============Q3答案==============");
		int firstInt3 = 1;
		while (firstInt3 < 10) {
			int backInt = 1;
			do {
				System.out.println(firstInt3 + "*" + backInt + "=" + (firstInt3 * backInt));
				backInt++;
			} while (backInt < 10);
			firstInt3++;
		}

//		Q4 - 計算1～1000的偶數和 (2+4+6+8+…+1000)
		System.out.println("==============Q4答案==============");
		int sum = 0;
		for(int i = 1;i<=1000;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1～1000的偶數和："+sum);

//		Q5 - 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		System.out.println("==============Q5答案==============");
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result = result * i;
		}

		System.out.println("1 到 10 的連乘積為: " + result);

//		Q6 - 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		System.out.println("==============Q6答案==============");
		int result6 = 1;
		int i6  =1;
		while (i6 <= 10) {
			result6 = result6 * i6;
			i6++;
		}
		System.out.println("1 到 10 的連乘積為: " + result6);

//		Q7 - 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		System.out.println("==============Q7答案==============");
		for(int i7 = 1;i7<=10;i7++) {
			System.out.print(i7*i7+" ");
		}
		
//		Q8 - 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.println("==============Q8答案==============");
		System.out.print("阿文可以選擇的數字：");
		for (int i = 1; i < 50; i++) {
			if (!String.valueOf(i).contains("4")) {
				System.out.print(i + " ,");
			}
		}
		
//		Q9 
		System.out.println("==============Q9答案==============");
		for(int i=10;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//		Q10
		System.out.println("==============Q10答案==============");
		int initial = 65;
		
		for(int row = 1;row<7;row++) {
			for(int number =0; number <row;number++) {
				char intialChar = (char) initial;
				System.out.print(intialChar);
			}
			initial++;
			System.out.println();
		}
	}

}
