package programmers.Level2;

import java.util.HashSet;
import java.util.Set;

public class Phonecketmon {
	/**
	 * nums�� ������ ������ �� ���� �� ���� �ٸ� nums�� ������ �� �ִ� �ִ� ���� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size() >= nums.length/2){
            return nums.length/2;
        }else{
            return set.size();
        }
    }
}
