package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution8393 {
	/**
	 * �Է¹��� n�� ���� 1 ~ n�� ���� ���
	 * ��ó : https://acmicpc.net/problem/8393
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
