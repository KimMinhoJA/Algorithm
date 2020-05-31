package programmers.Level3;

import java.util.ArrayList;
import java.util.List;

public class NExpression {
	/**
	 * N���� ��Ģ������ �̿��� number�� ǥ���ϴ� ���� ������ ����� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public int solution(int N, int number) {
		int cur = 0;
		int num = 0;
		List<Integer> list = new ArrayList<Integer>();
		int len = list.size();
		if(number == N) {
			return 1;
		}
		list.add(N);
		for (int i = 2; i <= 8; i++) {
			len = list.size();
			for(; cur < len; cur++) {
				num = list.get(cur);
				if(!list.contains(num + N))list.add(num + N);
				if(!list.contains(num * N))list.add(num * N);
				if(!list.contains(num / N) && (num / N) > 0)list.add(num / N);
				if(!list.contains(num - N) && (num - N > 0))list.add(num - N);
			}
			list.add(Integer.parseInt(new String(new char[i]).replace("\0", Integer.toString(N))));
			if(list.contains(number))
				return i;
		}
		return -1;
	}
}
