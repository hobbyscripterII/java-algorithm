package S01_String;

import java.util.Scanner;

public class EX1_1 {
	public static int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); // String 대문자 변환
		t = Character.toUpperCase(t); // char 대문자 변환
		
//		for(int i = 0; i < str.length(); i++) {
//			// index로 문자열에 접근한다.
//			if(str.charAt(i) == t)
//				// Scanner로 받은 문자열과 일치할 경우, cnt가 answer에 저장된다.
//				answer++;
//		}
		
		// toCharArray(): 문자열을 분리해 문자열 배열을 생성한다.
		for(char c : str.toCharArray()) {
			if(c == t)
				answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 문자열을 받는다.
		char c = sc.next().charAt(0); // 0번째 문자를 받는다.
		System.out.print(EX1_1.solution(str, c));
	}
}