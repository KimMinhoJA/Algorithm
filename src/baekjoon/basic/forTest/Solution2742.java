package baekjoon.basic.forTest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution2742 {
	/**
	 * ����n�� �Է¹޾� n~1�� �� �پ� ���
	 * ��ó : https://acmicpc.net/problem/2742
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = sc.nextInt();
		for(int i = a; i > 0; i--) {
			bw.write(i + "\n");
		}
		bw.flush();
	}
}
