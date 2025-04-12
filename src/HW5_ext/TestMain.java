package HW5_ext;

public class TestMain {
	
	public static void main(String[] args) {
		
		SwordMan swordMan = new SwordMan("劍人", 10, 5.5);
		swordMan.setAttackBehavior(new SwordAttack());
		swordMan.setMoveBehavior(new SwordMove());
		swordMan.setDenfendBehavior(new SwordDefense());
		swordMan.attack();
		swordMan.movie();
		swordMan.defend();
		
		ArrowMan arrowMan = new ArrowMan("弓箭者", 20, 10.3);
		arrowMan.setAttackBehavior(new ArrowAttack());
		arrowMan.setMoveBehavior(new ArrowMove());
		arrowMan.setDenfendBehavior(new ArrowDefend());
		arrowMan.attack();
		arrowMan.movie();
		arrowMan.defend();
	}

}
