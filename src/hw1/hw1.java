package hw1;

public class hw1 {
	
	public static void main(String[] args) {
		
		//Q1-請設計一隻Java程式,計算12,6這兩個數值的和與積
		int plus = 6+12;
		int multiply = 6*12;
		System.out.println("==============Q1答案==============");
		System.out.println("6+12等於"+plus);
		System.out.println("6*12等於"+multiply);
		
		//Q2-請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int dozenEggs = 200/12;
		int remaingsEggs = 200%12;
		System.out.println("==============Q2答案==============");
		System.out.println("200顆雞蛋等於"+dozenEggs+"打"+remaingsEggs+"顆雞蛋");
		
		//Q3-請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSeconds = 256559;
		int days = totalSeconds/(60*60*24);
		int remaingSeconds = totalSeconds%(60*60*24);
		int hours = remaingSeconds/(60*60);
		remaingSeconds = remaingSeconds%(60*60);
		int minutes = remaingSeconds/60;
		int seconds = remaingSeconds%60;
		System.out.println("==============Q3答案==============");
		System.out.println("256559秒 = "+days+"天"+hours+"小時"+minutes+"分"+seconds+"秒");
		
		//Q4-請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		double area = 5*5*pi;
		double surround = 5*2*pi;
		System.out.println("==============Q4答案==============");
		System.out.println("圓面積："+area);
		System.out.println("圓周長："+surround);
		
		//Q5-某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		//公式=> 最終金額(finalAssets) = 初始本金(beginAssets) x (1+年利率(ratio))總年數(years)的次方
		double beginAssets=1500000;
		double ratio = 0.02;
		int years = 10;
		double finalAssets = beginAssets*Math.pow((1+ratio),years);
		System.out.println("==============Q5答案==============");
		System.out.println("10年後本金加利息總金額："+finalAssets);
		
		//Q6-請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		
		System.out.println("==============Q6答案==============");
		//5+5=10是因為兩個為整數類型進行相加
		System.out.print(5+5);
		System.out.println(" => 是因為兩個為整數類型進行相加");
		
		//5+'5'=58是因為第一個5為整數，但第二個5為char，對照ASCii為53，因此兩者相加會變成5+53=58
		System.out.print(5+'5');
		System.out.println(" => 是因為第一個5為整數，但第二個5為char，對照ASCii為53，因此兩者相加會變成5+53=58");
		
		//5+"5"=55是因為第一個5為整數，但第二個5為String，因此兩個類型都會變成字串進行串接
		System.out.print(5+"5");
		System.out.println(" => 是因為第一個5為整數，但第二個5為String，因此兩個類型都會變成字串進行串接");
		
	}

}
