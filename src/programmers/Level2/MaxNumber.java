package programmers.Level2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber {
	/**
	 * �迭�� ���� ���� �Ϸķ� ������ ������ �� ���� ū ���� ����
	 * ��ó : https://programmers.co.kr/learn/challenges 
	 * @param numbers
	 * @return
	 */
	public String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for(int i =0; i < numbers.length; i++) {
			arr[i] = Integer.toString(numbers[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String num1, String num2) {
				int num1len = num1.length();
				int num2len = num2.length();
				StringBuilder sb1 = new StringBuilder();
				StringBuilder sb2 = new StringBuilder();
				for(int i = 0; i < 4; i++) {
					sb1.append(num1.charAt(i % num1len));
					sb2.append(num2.charAt(i % num2len));
				}
				return Integer.parseInt(sb2.toString()) - Integer.parseInt(sb1.toString());
			}
		});
		if(arr[0].charAt(0) == '0') {
			return "0";
		}
		StringBuilder answer = new StringBuilder();
		for(String str : arr) {
			answer.append(str);
		}
		return answer.toString();
	}
}