package oop;

public class MusicPlayer {
	boolean isOn;
	int volume;
}


package oop;

public class MusicplayerMain2 {

	public static void main(String[] args) {
		MusicPlayer option = new MusicPlayer();
		
		// player on
		option.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
		
		// volume up(*2)
		option.volume++;
		System.out.println("현재 볼륨: " + option.volume);
		option.volume++;
		System.out.println("현재 볼륨: " + option.volume);
		
		// volume down
		option.volume--;
		System.out.println("현재 볼륨: " + option.volume);
		
		// player Status
		if (option.isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + option.volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
		
		// player off
		option.isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
		
	}

}
