package hw5;

public class HW5_3 {

	public int maxElement(int[][] intArray) {
		int maxValue = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int value = intArray[i][j];
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		return maxValue;
	}

	public double maxElement(double[][] doubleArray) {
		double maxValue = 0.0;
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				double value = doubleArray[i][j];
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		HW5_3 hw = new HW5_3();
		System.out.println(hw.maxElement(intArray));
		System.out.println(hw.maxElement(doubleArray));

	}

}
