package programmers.Level2;

public class MaxAndMin {
	/**
	 * �־��� ���ڿ� s���� �ִ񰪰� �ּڰ��� ã�� �ϳ��� ���ڿ��� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public String solution(String s) {
		String[] answer = s.split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int temp = 0;
		for(int i = 0; i < answer.length; i++) {
			temp = Integer.parseInt(answer[i]);
			max = max > temp ? max : temp;
			min = min < temp ? min : temp;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min);
		sb.append(" ");
		sb.append(max);
		return sb.toString();
	}
}
