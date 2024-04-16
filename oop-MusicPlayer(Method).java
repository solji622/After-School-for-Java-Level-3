package oop;

public class MusicplayerMain3 {

	public static void main(String[] args) {
		MusicPlayerData option = new MusicPlayerData();
		
		// player on
		on(option);
		
		// volume up(*2)
		volumeUp(option);
		
		// volume down
		volumeDown(option);
		
		// player Status
		showStatus(option);
		
		// player off
		off(option);
		
	}
	
	
	static void on(MusicPlayerData option) {
		MusicPlayerData.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	
	static void off(MusicPlayerData option) {
		MusicPlayerData.isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	
	static void volumeUp(MusicPlayerData option) {
		MusicPlayerData.volume++;
		System.out.println("현재 볼륨: " + MusicPlayerData.volume);
	}
	
	static void volumeDown(MusicPlayerData option) {
		MusicPlayerData.volume--;
		System.out.println("현재 볼륨: " + MusicPlayerData.volume);
	}
	
	static void showStatus(MusicPlayerData option) {
		if (MusicPlayerData.isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + MusicPlayerData.volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
	}
	

}
