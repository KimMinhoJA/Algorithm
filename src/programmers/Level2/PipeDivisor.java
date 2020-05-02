package programmers.Level2;

import java.util.Stack;

public class PipeDivisor {
	/**
	 * �踷��� �������� �� ���� �ڸ��� �۾��� ()�� ǥ���Ͽ� �� �� ���� �и��� �踷��Ⱑ �������� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param arrangement
	 * @return
	 */
	public int solution(String arrangement) {
        int pipeStack = 0;
		int sum = 0;
		boolean isDivide = true;
		
		for(int i = 0; i < arrangement.length(); i++) {
			if(arrangement.charAt(i) == '(') {
				pipeStack++;
				isDivide = true;
			}else if(arrangement.charAt(i) == ')') {
				pipeStack--;
				sum++;
				if(isDivide) {
					sum += pipeStack - 1;
					isDivide = false;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		PipeDivisor pd = new PipeDivisor();
		System.out.println(pd.solution("()(((()())(())()))(())"));
	}
}
