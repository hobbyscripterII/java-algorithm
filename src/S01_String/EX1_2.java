package S01_String;

import java.util.Scanner;

public class EX1_2 {
	public static String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			// �ҹ��� �ƽ�Ű ���� ����: 97 ~ 122
			if(x >= 97 && x <= 122)
				// ���ڸ� ���ڷ� ����ȯ�Ѵ�.
				answer += (char)(x - 32);
			// �빮�� �ƽ�Ű ���� ����: 65 ~ 90
			else
				answer += (char)(x + 32);
			
//			if(Character.isLowerCase(x))
//				answer += Character.toUpperCase(x);
//			else
//				answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(EX1_2.solution(str));
	}
}