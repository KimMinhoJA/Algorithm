package baekjoon.basic.print;

import java.util.Scanner;

public class Solution2588 {
	/**
	 * a, b�� �Է� �޾� ���� ����� ���� �����ֱ�
	 * ��ó : https://acmicpc.net/problem/2588
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int temp = b;
		System.out.println(a * (temp % 10));
		temp /= 10;
		System.out.println(a * (temp % 10));
		temp /= 10;
		System.out.println(a * (temp % 10));
		System.out.println(a * b);
	}
}
