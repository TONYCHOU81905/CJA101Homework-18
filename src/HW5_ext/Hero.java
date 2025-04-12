package HW5_ext;

public abstract class Hero {
	
	protected String name;
	protected int level;
	protected double exp;
	
	private AttackBehavior attackBehavior;
	private MoveBehavior moveBehavior;
	private DefendBehavior defendBehavior;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setAttackBehavior(AttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	
	public void setMoveBehavior(MoveBehavior moveBehavior) {
		this.moveBehavior=moveBehavior;
	}
	
	public void setDenfendBehavior(DefendBehavior defendBehavior) {
		this.defendBehavior=defendBehavior;
	}
	
	
	protected void attack() {
		attackBehavior.attack();
	}
	
	protected void movie() {
		moveBehavior.move();
	}
	void defend() {
		defendBehavior.defend();
	}
}
