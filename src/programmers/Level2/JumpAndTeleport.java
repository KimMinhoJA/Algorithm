package programmers.Level2;

public class JumpAndTeleport {
	/**
	 * ������ �����̵��� �̿��ؼ� n��ŭ�� ĭ�� �̵��� �Ϸ��Ѵ�. ������ �ϸ� ������ ����ŭ �̵��ϰ� �׸�ŭ �������� �Һ�ǰ� �����̵��� �ϸ� ������ġ * 2��ġ�� �̵��ϸ� 
	 * ������ �Һ� ���� �� ���� ���� �������� n��ŭ �̵��ϵ��� �Ѵ�.
	 * https://programmers.co.kr/learn/challenges
	 */
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				n -= 1;
				answer++;
			} else {
				n /= 2;
			}
		}
		return answer;
	}
}
