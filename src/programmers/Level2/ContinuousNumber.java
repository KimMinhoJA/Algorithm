package programmers.Level2;

public class ContinuousNumber {
	/**
	 * ���ӵ� �ڿ����� ���Ͽ� n�� ǥ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n / 2; i += 2) {
			if(n % i == 0) {
				answer++;
			}
		}
		if(n % 2 == 1) {
			answer++;
		}
		return answer;
	}
}
