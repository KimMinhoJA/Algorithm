package baekjoon.basic.forTest;

import java.util.Scanner;

public class Solution10950 {
	/**
	 * �ݺ��� �� a�� �Է¹޾� �ݺ� Ƚ����ŭ �� ������ �Է¹޾� �� ���� ���
	 * ��ó : https://acmicpc.net/proble/10950
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b,c = 0;
		for(int i = 0; i < a; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.println(b + c);
		}
	}
}
