package template_method;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ���� �޸���.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump�Ѵ�.");
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ����.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****����ڷ���*****");
	}

}
