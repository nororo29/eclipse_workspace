package template_method;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("빨리 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump한다.");
	}

	@Override
	public void turn() {
		System.out.println("turn못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****중급자레벨*****");
	}
	
}
