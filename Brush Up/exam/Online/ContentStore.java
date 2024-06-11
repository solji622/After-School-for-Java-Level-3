package Online;

public class ContentStore {
	public static Streamable FindStream(String option, String title, int time) {
		if(option.equals("movie")) {
			return new Movie(title, time);
		} else if(option.equals("series")) {
			return new Series(title, time);
		} else if(option.equals("documentary")) {
			return new Documentary(title, time);
		} else {
			return new DefaultContent();
		}
	}
}
