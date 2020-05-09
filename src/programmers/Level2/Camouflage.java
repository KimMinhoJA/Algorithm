package programmers.Level2;

import java.util.*;

public class Camouflage {
	/**
	 * ���� �ٸ� ���� �Դ� ��� ����� ���� ���
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param clothes
	 * @return
	 */
	public int solution(String[][] clothes) {
		int result = 1;
	        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
	        for(String[] strArr : clothes) {
	        	if(map.containsKey(strArr[1]))
	        		map.get(strArr[1]).add(strArr[0]);
	        	else {
	        		map.put(strArr[1],new ArrayList<String>());
	        		map.get(strArr[1]).add(strArr[0]);
	        	}
	        	
	        }
	        for(String key: map.keySet()) {
	        	result *= map.get(key).size();
	        }
	        
	        return result;
	}
}
