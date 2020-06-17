package programmers.Level2;

import java.util.Arrays;

public class FindMinimum {
	/**
	 * A,B�迭�� �� ���ҵ��� ���Ͽ� ���� ���� ���� �������� ����
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] A, int[] B) {
		int len = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int min = 0;
		
		for(int i = 0; i < len; i++) {
			min += A[i] * B[len - i - 1];
		}
		return min;
	}
}
