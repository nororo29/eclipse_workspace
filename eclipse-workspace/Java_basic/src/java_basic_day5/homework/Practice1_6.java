package java_basic_day5.homework;

public class Practice1_6 {

	public static void main(String[] args) {
		// 학점
		int score = 70;
		char grade;

		if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("학점 : " + grade);
	}

}
