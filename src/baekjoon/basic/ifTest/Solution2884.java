package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution2884 {
	/**
	 * �ð��� �Է¹޾� �ش�ð����� 45�� �� �ð��� ���
	 * ��ó : https://acmicpc.net/problem/2884
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		h = sc.nextInt();
		m = sc.nextInt();
		if(m - 45 < 0) {
			if(h == 0) {
				System.out.println("23 " + (m + 15));
			}else {
				System.out.println(h - 1 + " " + (m + 15));
			}
		}else {
			System.out.println(h + " " + (m - 45));
		}
	}
}
