package hw3;

public class Student {
	int score=0;
	
	public void play(int hours) {
		score = score-hours;
		System.out.println(score);
	}
	
	public void study(int hours) {
		score = score+hours;
		System.out.println(score);
	}

}
