package baekjoon.basic.print;

import java.util.Scanner;

public class Solution10869 {
	/**
	 * �Է¹޴� ���� A, B�� ���� ��Ģ������ ��� ���
	 * ��ó : https://www.acmicpc.net/problem/10869
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
