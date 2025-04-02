package hw7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HW7_1 {
// 1426 bytes | 400多個字
	public static void main(String[] args) {
		File inputFile = new File("Sample.txt");
		try {
			//計算字元
			int count=0;
			//計算行數
			int countLine = 0;
			//計算位元組
			long countBytes = inputFile.length();
			//讀取sample
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fileReader);
			while (fileReader.read()!=-1) {
				count++;
			}
			
//			重新讀取
			fileReader = new FileReader(inputFile);
			br = new BufferedReader(fileReader);
			while(br.readLine()!=null) {
				countLine++;
			}
			System.out.println("Sample.txt檔案共有"+countBytes+"個位元組,"+count+"個字元,"+countLine+"列資料");

			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
