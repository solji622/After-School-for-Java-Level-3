package oop;

public class MusicPlayer {
	
	boolean isOn;
	int volume;
	
	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	
	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("현재 볼륨: " + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("현재 볼륨: " + volume);
	}
	
	void showStatus() {
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
	}
}

package oop;

public class MusicplayerMain4 {

	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		
		// player on
		player.on();
		
		// volume up(*2)
		player.volumeUp();
		player.volumeUp();
		
		// volume down
		player.volumeDown();
		
		// player Status
		player.showStatus();
		
		// player off
		player.off();
		
	}
}
