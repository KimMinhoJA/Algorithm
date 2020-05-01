package programmers.Level2;

public class CreateRectangle {
	/**
	 * ����w ����h�� �簢 ������ �밢������ �� �׾��� �κ��� ������ 1*1 ũ���� �簢���� ������ ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param w
	 * @param h
	 * @return
	 */
	public long solution(int w, int h) {
		int gcd = 0;
		int first = w;
		int second = h;
		int temp = 0;
		
		while(true) {
			if(first % second == 0) {
				gcd = second;
				break;
			}else {
				temp = second;
				second = first % second;
				first = temp;
			}
		}
		
		long result = (long) w * h;
		int disable = (w / gcd + h / gcd - 1) *h / (h / gcd);
		
		return result - disable;
	}
}
