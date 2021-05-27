package template_method;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel() {
		if (level instanceof BeginnerLevel) {
			this.level = new AdvancedLevel();
		} else if (level instanceof AdvancedLevel) {
			this.level = new SuperLevel();
		} else {
			System.out.println("최고 레벨입니다.");
		}
		level.showLevelMessage();
	}
	
	public void play(int n) {
		level.go(n);
	}
	
	
}
