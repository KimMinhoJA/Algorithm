package programmers.Level2;

public class FibonacciNumber {
	/**
	 * n��° �Ǻ���ġ ���� 1234567���� ���� �������� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int temp = 0;
		int num1 = 1;
		int num2 = 1;
		for(int i = 2; i < n; i++) {
			temp = num1;
			num1 = (num1 + num2) % 1234567;
			num2 = temp;
		}
		return num1;
	}
}
