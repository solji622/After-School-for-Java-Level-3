package Online;

public class Documentary implements Streamable{
	private String title;
	private int time;
	
	public Documentary(String title, int time) {
		this.title = title;
		this.time = time;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public void play() {
		System.out.println("playing series: " + title);
	}

	@Override
	public void stop() {
		System.out.println("stopping series: " + title);
	}
	
	@Override
	public void pause() {
		System.out.println("pausing series: " + title);
	}
}
