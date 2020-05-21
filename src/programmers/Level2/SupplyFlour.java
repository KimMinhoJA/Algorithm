package programmers.Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class SupplyFlour {
	/**
	 * �а��� ������ dates�� �� ��¥�� ���޷� supplies�� ������ �� �� k�� ������ �ּ������� ���޹޴� Ƚ���� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param stock
	 * @param dates
	 * @param supplies
	 * @param k
	 * @return
	 */
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		int answer = 0;
		
		for(int i = 0; i < dates.length; i++) {
			if(stock - dates[i] >= 0) {
				queue.add(supplies[i]);
			}else {
				stock += queue.poll();
				answer++;
				i--;
				if(stock >= k) {
					break;
				}
			}
		}
		while(true) {
			if(stock >= k) {
				break;
			}else {
				stock += queue.poll();
				answer++;
			}
		}
		return answer;
	}
}
