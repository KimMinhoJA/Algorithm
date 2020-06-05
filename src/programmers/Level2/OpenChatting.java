package programmers.Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChatting {
	/**
	 * ����ä�ù� ���� ���(rocord)�� ���� �޼����� �����
	 * ��ó : https://programmers.co.kr/learn/challenges
	 */
	public String[] solution(String[] record) {
		String[] records = null;
		List<String[]> list = new ArrayList<String[]>();
		Map<String, String> map = new HashMap<String, String>();
		
		for(String str : record) {
			records = str.split(" ");
			switch (records[0]) {
				case "Leave" :
					list.add(new String[]{records[1],"���� �������ϴ�."});
					break;
				case "Enter" :
					list.add(new String[]{records[1],"���� ���Խ��ϴ�."});
				case "Change" : 
					map.put(records[1], records[2]);
			}
		}
		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++) {
			records = list.get(i);
			answer[i] = map.get(records[0]).concat(records[1]);
		}
		return answer;
	}
}
