package programmers.Level3;

public class TileDecoration {
	/**
	 * �Ǻ���ġ ���� ������� ���簢���� �̾� ���� �� N���� ���簢���� �̾���� �ѷ��� ���̸� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public long solution(int N) {
		long suf = 1;
		long pre = 1;
		long temp = 0;
		for(int i = 2; i <= N; i++) {
			temp = suf;
			suf = pre + suf;
			pre = temp;
		}
		return (suf + pre) * 2;
	}
}
