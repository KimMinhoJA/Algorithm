package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution1330 {
	/**
	 * �Է� ���� �� ���� ũ�� ��
	 * ��ó : https://acmicpc.net/problem/1330
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
