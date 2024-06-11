package learnOnline;

public class DefaultContent implements Learnable{

	@Override
	public void start() {
		System.out.println("No start");
		
	}

	@Override
	public void pause() {
		System.out.println("No pause");
		
	}

	@Override
	public void complete() {
		System.out.println("No complete");
		
	}
	
}
