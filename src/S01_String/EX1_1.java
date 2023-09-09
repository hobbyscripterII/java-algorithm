package S01_String;

import java.util.Scanner;

public class EX1_1 {
	public static int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); // String �빮�� ��ȯ
		t = Character.toUpperCase(t); // char �빮�� ��ȯ
		
//		for(int i = 0; i < str.length(); i++) {
//			// index�� ���ڿ��� �����Ѵ�.
//			if(str.charAt(i) == t)
//				// Scanner�� ���� ���ڿ��� ��ġ�� ���, cnt�� answer�� ����ȴ�.
//				answer++;
//		}
		
		// toCharArray(): ���ڿ��� �и��� ���ڿ� �迭�� �����Ѵ�.
		for(char c : str.toCharArray()) {
			if(c == t)
				answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // ���ڿ��� �޴´�.
		char c = sc.next().charAt(0); // 0��° ���ڸ� �޴´�.
		System.out.print(EX1_1.solution(str, c));
	}
}