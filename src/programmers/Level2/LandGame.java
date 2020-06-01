package programmers.Level2;

public class LandGame {
	/**
	 * �������� ���� �������� �ʰ� ���� ū ���� ������ �� �ֵ��� �Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[][] land) {
		for(int i = 0; i < land.length - 1; i++) {
			for(int j = 0; j < land[i].length; j++) {
				land[i + 1][j] += maxRow(land[i], j);
			}
		}
		
		return maxRow(land[land.length - 1], Integer.MAX_VALUE);
	}
	
	public int maxRow(int[] row, int col) {
		int max = 0;
		for(int i = 0; i < row.length; i++) {
			if(max < row[i] && col != i) {
				max = row[i];
			}
		}
		return max;
	}
}
