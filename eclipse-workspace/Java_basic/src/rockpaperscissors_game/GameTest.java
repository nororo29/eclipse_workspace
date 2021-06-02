package rockpaperscissors_game;

import java.util.Scanner;

class Gamer {
	static int gameNum;
	static int winNum;
	int roPaSci;
	int money;

	public Gamer() {
		gameNum = 0;
		winNum = 0;
		this.money = 10000;
	}

	public String getRoPaSci() {
		if (roPaSci == 0)
			return "가위";
		else if (roPaSci == 1)
			return "바위";
		else
			return "보";
	}

	public void setRoPaSci(String roPaScistr) {
		if (roPaScistr.equals("가위"))
			this.roPaSci = 0;
		else if (roPaScistr.equals("바위"))
			this.roPaSci = 1;
		else if (roPaScistr.equals("보"))
			this.roPaSci = 2;
	}

}

class ComputerGamer extends Gamer {

	public ComputerGamer() {
		
		this.money = 10000;
	}
	
	public void setRoPaSci() {
		this.roPaSci = (int) (Math.random() * 3);
	}

}

public class GameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Gamer g1 = new Gamer();
		ComputerGamer c1 = new ComputerGamer();

		while (true) {
			System.out.print("가위 바위 보 (0 입력 시 종료) : ");
			String roPaSci = sc.nextLine();

			if (roPaSci.equals("0")) {

				System.out.println("===== 게임 종료 =====");
				System.out.println("내 승률 : " + Gamer.winNum + "/" + Gamer.gameNum);
				System.out.println("내 포인트 : " + g1.money + ", 컴퓨터 포인트 : " + c1.money);
				return;

			} else if (roPaSci.equals("가위") || roPaSci.equals("바위") || roPaSci.equals("보")) {

				Gamer.gameNum++;
				g1.setRoPaSci(roPaSci);
				c1.setRoPaSci();

				if ((g1.roPaSci - c1.roPaSci == 1) || (g1.roPaSci - c1.roPaSci == -2)) { // win
					System.out.printf("나(%s), 컴퓨터(%s), you win\n", g1.getRoPaSci(), c1.getRoPaSci());
					Gamer.winNum++;
					g1.money += 100;
					c1.money -= 100;
				} else if (g1.roPaSci == c1.roPaSci) { // 무승부
					System.out.println("무승부");
				} else { // lose
					System.out.printf("나(%s), 컴퓨터(%s), you lose\n", g1.getRoPaSci(), c1.getRoPaSci());
					g1.money -= 100;
					c1.money += 100;
				}

				System.out.println();

			} else {
				System.out.println("입력 오류");
				System.out.println();
				continue;
			}

		}
		
	}

}
