package hw7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HW7_4 {

	String fileRouteString = "object.ser";

	public static void main(String[] args) throws Exception {
		HW7_4 hw = new HW7_4();
		hw.generateSer();
		hw.readSer();

	}

	public void generateSer() throws Exception {
		File file = new File(fileRouteString);
		Cat cat = new Cat("豆泥");
		Dog dog = new Dog("黑妞");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(cat);
		oos.writeObject(dog);

		oos.close();
		fos.close();

		System.out.println("FINISH");
	}

	public void readSer() throws Exception {

		FileInputStream file = new FileInputStream(fileRouteString);
		ObjectInputStream bis = new ObjectInputStream(file);

		System.out.println("檔案內容如下");
		Object[] obj = new Object[2];
		obj[0] = (Cat) bis.readObject();
		obj[1] = (Dog) bis.readObject();

		for (int i = 0; i < 2; i++) {
			if (obj[i] instanceof Cat) {
				((Cat) obj[i]).speak();
			} else if (obj[i] instanceof Dog) {
				((Dog) obj[i]).speak();
			}
		}
	}
}
