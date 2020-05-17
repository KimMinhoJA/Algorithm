package programmers.Level2;

import java.util.*;

class Solution {
	/**
	 * ���� �ٸ� ���� �Դ� ��� ����� ���� ���
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param clothes
	 * @return
	 */
    public int solution(String[][] clothes) {
		List<String> type = new ArrayList<String>();
		List<Integer> stock = new ArrayList<Integer>();
		int result = 1;
		for(String[] clotheType : clothes) {
			if(type.contains(clotheType[1])) {
				stock.set(type.indexOf(clotheType[1]), stock.get(type.indexOf(clotheType[1])) + 1);
			}else {
				type.add(clotheType[1]);
				stock.add(1);
			}
		}
		for(int i : stock) {
			result *= i + 1;
		}
		return result - 1;
	}
}