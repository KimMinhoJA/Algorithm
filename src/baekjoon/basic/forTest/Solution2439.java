package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution2439 {
	/**
	 * ����� ����-1
	 * ��ó : https://acmicpc/problem/2439
	 * @param args
	 */
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a - i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
