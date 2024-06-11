package Online;

public class DefaultContent implements Streamable {
	
	@Override
	public void play() {
		System.out.println("No play");
	}

	@Override
	public void stop() {
		System.out.println("No stop");
	}
	
	@Override
	public void pause() {
		System.out.println("No pause");
	}
	
}
