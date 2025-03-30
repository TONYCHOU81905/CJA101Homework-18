package hw6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public boolean setX(int x) throws CalException {
		try {
			this.x = x;
			System.out.println("X設定完成");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
			// TODO: handle exception
		}
	}

	public boolean setX(String x) throws CalException {
		try {
			throw new CalException("輸入格式不正確");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return false;
	}

	public boolean setY(int y) {

		try {
			if (x == 0 && y == 0) {
				throw new CalException("0的0次方沒有意義");
			} else {
				this.y = y;
				System.out.println("Y設定完成");
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
			// TODO: handle exception
		}
	}

	public void powerXY() {
		double power = Math.pow(x, y);
		System.out.println(x + "的" + y + "次數為" + power);
	}

}
