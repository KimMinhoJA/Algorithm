package baekjoon.basic.forTest;

import java.io.IOException;
import java.util.Scanner;

public class Solution10871 {
	/**
	 * a��ŭ�� �迭�� �� b���� ���� ������ ���
	 * ��ó : https://acmicpc.net/problem/10871
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		for(int i = 0 ; i < a; i++) {
			c = sc.nextInt();
			if(b > c) {
				builder.append(c);
				builder.append(' ');
			}
		}
		System.out.println(builder.toString().trim());
	}
}
