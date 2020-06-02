package programmers.Level2;

public class MakePrime {
	/**
	 * �־��� nums���� 3���� ���Ͽ� �Ҽ��� �Ǵ� ����� ���� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	int answer = 0;
	public int solution(int[] nums) {
		sum(nums, 0, 1, 0);
		return answer;
	}
	public void sum(int[] nums, int sum, int depth, int cursor) {
		for(int i = cursor; i < nums.length - (3 - depth); i++) {
			if(depth == 3) {
				if(isPrime(sum + nums[i])) {
					answer++;
				}
			}else {
				sum(nums, sum + nums[i], depth + 1, i + 1);
			}
		}
	}
	public boolean isPrime(int sum) {
		for(int i = 2; i*i <= sum; i++) {
			if(sum % i == 0) {
				return false;
			}
		}
		return true;
	}
}
