package programmers.Level2;

public class CompressionString {
	/**
	 * ���ڿ��� �����Ͽ� ���� ª�� ������ ����� ���� ���
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param s
	 * @return
	 */
	public int solution(String s) {
		int len = s.length();
		int min = len;
		int count = 1;
		
		for(int i = 1; i <= len / 2; i++) {//i�� ������ ����
			int pressLen = len;
			for(int j = 0; (j + 2) * i <= len; j++) {//j�� ���� �˻縦 ���� Ŀ��
				if(s.substring(j * i, (j + 1) * i).equals(s.substring((j + 1) * i, (j + 2) * i))){
					pressLen -= i;
					count++;
				}else {
					if(count > 1) {
						pressLen += (int)Math.log10(count) + 1;
						count = 1;
					}
				}
			}
			if(count > 1) {
				pressLen += (int)Math.log10(count) + 1;
				count = 1;
			}
			min = min > pressLen ? pressLen : min; 
		}
		
		return min;
	}
}
