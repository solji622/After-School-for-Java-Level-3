package Online;

public class Movie implements Streamable{
	private String title;
	private int time;
	
	public Movie(String title, int time) {
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
		System.out.println("playing Movie: " + title);
	}

	@Override
	public void stop() {
		System.out.println("stopping Movie: " + title);
	}
	
	@Override
	public void pause() {
		System.out.println("pausing Movie: " + title);
	}
	
}
