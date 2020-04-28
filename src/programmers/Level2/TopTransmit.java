package programmers.Level2;

public class TopTransmit {
	/**
	 * �Ϸķ� ���� ž�� �迭 heights���� �������� ��ȣ�� ���� �� ���ſ��θ� ��ȯ 
	 * @param heights
	 * @return
	 */
	public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1; i > 0; i--) {
        	for(int j = i - 1; j >= 0; j--) {
        		if(heights[j] > heights[i]) {
        			answer[i] = j + 1;
        			break;
        		}
        	}
        }
        return answer;
    }
}
