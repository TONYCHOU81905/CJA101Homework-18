package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HW7_2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		int ramdonNumber = (int) (Math.random() * 1000) + 1;
		ps.println(ramdonNumber);
		System.out.println("存入" + ramdonNumber);
		ps.close();
		bos.close();
		fos.close();
//		FileOutputStream(String name, boolean append)
	}

}
