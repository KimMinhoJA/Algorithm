package baekjoon.basic.ifTest;

import java.util.Scanner;

public class Solution2753 {
	/**
	 * �Է¹��� �⵵�� �������� üũ
	 * ��ó : https://acmicpc.net/problem/2753
	 * @param args
	 */
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		if(a % 4 == 0 && a % 100 != 0) {
			System.out.println(1);
		}else if(a % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
