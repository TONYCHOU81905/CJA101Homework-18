package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW7_3 {
	public static void main(String[] args) {

		HW7_3 hw = new HW7_3();
		boolean isFinished = hw.copyFile();
		if (isFinished) {
			System.out.println("複製完成");
		} else {
			System.out.println("複製失敗");
		}
	}

	public boolean copyFile() {
		try {

			File inputFile = new File("Sample.txt");
			File outputFile = new File("Data.txt");

			FileReader reader = new FileReader(inputFile);
			FileWriter writer = new FileWriter(outputFile);

			int word;

			while ((word = reader.read()) != -1) {

				writer.write(word);
				System.out.println((char) word);
				System.out.flush();
			}
			reader.close();
			writer.close();
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			return false;
		}
	}
}
