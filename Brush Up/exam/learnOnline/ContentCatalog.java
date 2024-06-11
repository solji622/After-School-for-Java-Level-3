package learnOnline;

public class ContentCatalog {
	public static Learnable FindContent(String type, String title, int time) {
		if(type.equals("course")) {
			return new Course(title, time);
		} else if(type.equals("webinar")) {
			return new Webinar(title, time);
		} else if(type.equals("workshop")) {
			return new Workshop(title, time);
		} else { 
			return new DefaultContent();
		}
	}
}
