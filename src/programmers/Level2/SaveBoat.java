package programmers.Level2;

import java.util.Arrays;

public class SaveBoat {
	/**
	 * ����Ʈ�� ����� �ּ��� �պ��Ͽ� ���϶�(�ִ� 2�� ž��)
	 * ��ó : https://programmser.co.kr/learn/challenges
	 * @param people
	 * @param limit
	 * @return
	 */
	public int solution(int[] people, int limit) {
		int answer = 0;
		int start = 0;
		int end = people.length - 1;
		Arrays.sort(people);
		while(start <= end) {
			if(people[end] + people[start] <= limit) {
				start++;
			}
			end--;
			answer++;
		}
		return answer;
	}
}
