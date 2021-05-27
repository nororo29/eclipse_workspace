package template_method;

public class MainBoard {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.play(1);
		
		p1.upgradeLevel();
		p1.play(2);
		
		p1.upgradeLevel();
		p1.play(3);
		
		p1.upgradeLevel();
		p1.upgradeLevel();
	}

}
