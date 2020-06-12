package programmers.Level3;

public class HanoiTop {
	/**
	 * �ϳ���ž���� 1��° ��տ��� 3��° ������� �ű�� ������ ��ȯ
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int[][] solution(int n) {
		int[][] answer = new int[(int)Math.pow(2, n) - 1][2];
		move(3, n, 1, 0, answer);
		return answer;
	}
	public int move(int next, int n, int cur, int count, int[][] answer) {
		if(n != 1) {
			count = move(6 - next - cur, n - 1, cur, count, answer);
			answer[count][0] = cur;
			answer[count++][1] = next;
			count = move(next, n - 1, 6 - next - cur, count, answer);
		}else {
			answer[count][0] = cur;
			answer[count++][1] = next;
		}
		return count;
	}
}
