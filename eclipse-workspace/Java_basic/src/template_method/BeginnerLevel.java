package template_method;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("jump못함");
	}

	@Override
	public void turn() {
		System.out.println("turn못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자레벨*****");
	}

}
