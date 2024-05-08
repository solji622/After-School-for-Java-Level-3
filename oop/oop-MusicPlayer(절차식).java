package oop;

public class MusicplayerMain1 {

	public static void main(String[] args) {
		boolean isOn = false;
		int volume = 0;
		
		// player on
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
		
		
		// volume up 
		volume++;
		System.out.println("현재 볼륨: " + volume);
		
		// volume up + 1
		volume++;
		System.out.println("현재 볼륨: " + volume);
		
		// volume down 
		volume--;
		System.out.println("현재 볼륨: " + volume);
		
		
		// player Status
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
		
		
		// player off
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}

}
