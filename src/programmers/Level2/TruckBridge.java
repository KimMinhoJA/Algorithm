package programmers.Level2;

import java.util.LinkedList;

public class TruckBridge {
	/**
	 * Ʈ������ ���Կ� �ٸ��� �ߵ� �� �ִ� ���Ը� ����Ͽ� ��� Ʈ���� �ٸ��� ���� �� ���� �ɸ� �ð��� ���϶�
	 * ��ó : https://programmers.co.kr/learn/challenges
	 * @param bridge_length
	 * @param weight
	 * @param truck_weights
	 * @return
	 */
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int truckWeight = 0;
		int time = 0;
		LinkedList<Integer> truckList = new LinkedList<Integer>();
		int passTruck = 0;
		
		for(Integer truck : truck_weights) {
			if(truckWeight + truck > weight) {	
				while(truckWeight + truck > weight) {
					int firstTime = truckList.poll();
					decreaseTime(firstTime, truckList);
					truckWeight -= truck_weights[passTruck++];
					time += firstTime;
				}
			}else {
				time++;
				decreaseTime(1, truckList);
				if(!truckList.isEmpty() && truckList.peek() == 0) {
					truckList.poll();
					truckWeight -= truck_weights[passTruck++];
				}
			}
			truckWeight += truck;
			truckList.add(bridge_length);
		}
		time += bridge_length;
		return time;
	}
	
	public void decreaseTime(int time, LinkedList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) - time);
		}
	}
	public static void main(String[] args) {
		TruckBridge tb = new TruckBridge();
		int [] truck_weights = {7,4,5,6};
		System.out.println(tb.solution(2, 10, truck_weights));
	}
}
