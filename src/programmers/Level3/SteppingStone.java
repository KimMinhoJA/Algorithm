package programmers.Level3;

import java.util.*;
import java.util.stream.IntStream;

public class SteppingStone {
	/**
	 * �ǳ� �� �ִ� Ƚ���� ���ѵ� ���ǵ��� �迭stones���� �� ���� �ִ� k��ŭ �ǳʶ� �� ���� �� ���� ���� ����� �ǳʴ� ���
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] stones, int k) {
		IntStream stream = null;
		int bridgeLife = 200000000;
		int perLife = 0;
		for (int i = 0; i < stones.length - k; i++) {
			stream = Arrays.stream(stones, i, i + k);
			perLife = stream.max().getAsInt();
			if (bridgeLife > perLife) {
				bridgeLife = perLife;
			}
		}
		return bridgeLife;
	}
}
