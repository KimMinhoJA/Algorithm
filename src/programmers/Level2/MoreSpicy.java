package programmers.Level2;

import java.util.*;

public class MoreSpicy {
	/**
	 * scoville�迭�� �� �� k���� ���� ���鿡 ���� ���� ���� �� + (�� ��°�� ���� ��)*2�� ���ο� ���� ����� ���鼭 ��� ���� k���� Ŭ �� �ֵ��� �Ѵ�.
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param scoville
	 * @param K
	 * @return
	 */
	public int solution(int[] scoville, int K) {
		int answer = 0;
		int newSpicy = 0;
		boolean isSpicy = false;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i : scoville) {
			if(i < K) {
				queue.offer(i);
			}else {
				break;
			}
		}
		while(queue.size() > 1) {
			newSpicy = queue.poll() + queue.poll() * 2;
			if(newSpicy < K) {
				queue.offer(newSpicy);
			}else {
				isSpicy = true;
			}
			answer++;
		}
		if(isSpicy) {
			return answer + queue.size();
		}
		return -1;
	}
}
