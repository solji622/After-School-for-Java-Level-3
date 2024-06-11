package learnOnline;

public class Workshop implements Learnable{
	private String title;
	private int time;
	
	public String getTitle() {
		return title;
	}
	
	public int getTime() {
		return time;
	}
	
	public Workshop(String title, int time) {
		this.title = title;
		this.time = time;
	}

	@Override
	public void start() {
		System.out.println("Course start: " + title);
		
	}

	@Override
	public void pause() {
		System.out.println("Course pause: " + title);
		
	}

	@Override
	public void complete() {
		System.out.println("Course complete: " + title);
		
	}
	
}
