package programmers.Level1.AllFactorSum;

public class AllFactorSum {
	/**
	 * ���ڷ� ���� ������ ��� ������� ���� ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param n
	 * @return
	 */
	public int solution(int n) {
		int result = 0;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				result += i;
				System.out.println(i);
			}
		}
		return result + n;
	}
}
