package java_basic_0524;

import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) {
		//A-Z 모스부호 사용해 문장/문자 입력 시 모스부호 출력
		Scanner sc = new Scanner(System.in);
		String[] morseCode = new String[26];
		
		morseCode[0] = ".-"; morseCode[1] = "-..."; morseCode[2] = "-.-."; morseCode[3] = "-..";
		morseCode[4] = "."; morseCode[5] = "..-."; morseCode[6] = "--."; morseCode[7] = "....";
		morseCode[8] = ".."; morseCode[9] = ".---"; morseCode[10] = "-.-"; morseCode[11] = ".-..";
		morseCode[12] = "--"; morseCode[13] = "-."; morseCode[14] = "---"; morseCode[15] = ".--.";
		morseCode[16] = "--.-"; morseCode[17] = ".-."; morseCode[18] = "..."; morseCode[19] = "-";
		morseCode[20] = "..-"; morseCode[21] = "...-"; morseCode[22] = ".--"; morseCode[23] = "-..-";
		morseCode[24] = "-.--"; morseCode[25] = "--..";
		
		String msg = sc.nextLine();
		
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			
			if ((c < 'A') || (c > 'z') || ((c > 'Z') && (c < 'a')))
				continue;
			else if (c >= 'a' && c <= 'z') {
				System.out.print(morseCode[c - 97] + " ");
			} else
				System.out.print(morseCode[c - 65] + " ");
		}
		
	}

}
