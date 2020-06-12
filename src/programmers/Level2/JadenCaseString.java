package programmers.Level2;

public class JadenCaseString {
	/**
	 * ��� �ܾ��� ù ���ڰ� �빮�ڷ� �����ϰ� ������ �ҹ��ڷ� �̷���� JadenCase�� �ٲٱ�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public String solution(String s) {
		int len = s.length();
		boolean isFirst = true;
		char ch = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			ch = s.charAt(i);
			if(ch == ' ') {
				isFirst = true;
				sb.append(ch);
			}else if(isFirst){
				sb.append(Character.toUpperCase(ch));
				isFirst = false;
			}else {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
	}
}
