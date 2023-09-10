package S01_String;

import java.util.Scanner;

public class EX1_2 {
	public static String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			// 소문자 아스키 문자 범위: 97 ~ 122
			if(x >= 97 && x <= 122)
				// 숫자를 문자로 형변환한다.
				answer += (char)(x - 32);
			// 대문자 아스키 문자 범위: 65 ~ 90
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