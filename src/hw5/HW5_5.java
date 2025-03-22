package hw5;

public class HW5_5 {

	public static void main(String[] args) {
		HW5_5 hw = new HW5_5();
		System.out.println("本次隨機產生驗證碼為：");
		hw.genAuthCode();
	}

	public void genAuthCode() {
		char[] ramdonArrayStrings = new char[62];
		int addValue = 0;
		// A-Z
		for (int i = 65; i < 91; i++) {
			char asciiText = (char) i;
			ramdonArrayStrings[addValue] = asciiText;
			addValue++;
		}
		//a-z
		for (int i = 97; i < 123; i++) {
			char asciiText = (char) i;
			ramdonArrayStrings[addValue] = asciiText;
			addValue++;
		}
		//0-9
		for (int i = 0; i < 10; i++) {
			ramdonArrayStrings[addValue] = (char)('0'+i);
			addValue++;
		}

		
		for (int i = 0; i < 8; i++) {
			int randomNumber = (int) (Math.random() * 62);
			System.out.print(ramdonArrayStrings[randomNumber]);

		}
	}

}
