package programmers.Level2;

public class GroupDelete {
	/**
	 * ���� ���� 2���� �پ������� �����Ͽ� ���������� ��� ���ڿ��� ���ŵǸ� 1��, �ƴϸ� 0�� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(String s){
        int answer = 0;
        int len = s.length();
        char ch = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
        	ch = s.charAt(i);
        	if(sb.length() == 0) {
        		sb.append(ch);
        	}else if(sb.charAt(sb.length() - 1) == ch) {
        		sb.deleteCharAt(sb.length() - 1);
        	}else {
        		sb.append(ch);
        	}
        }
        if(sb.length() == 0) {
        	answer = 1;
        }
        return answer;
    }
}
