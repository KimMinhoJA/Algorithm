package programmers.Level2;

public class CorrectParentheses {
	/**
	 * ��ȣ�� ���� �������� ���� �ùٸ��� ¦������ �ùٸ� ��ȣ�� ������ ��� true�� �ƴҰ�� false�� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	boolean solution(String s) {
		boolean answer = false;
		int check = 0;
		char[] chrArr = s.toCharArray();
		for(char ch : chrArr) {
			if(ch == '(') {
				check++;
			}else {
				check--;
			}
			if(check < 0) {
				return answer;
			}
		}
		if(check == 0) {
			answer = true;
		}
		return answer;
	}
}
