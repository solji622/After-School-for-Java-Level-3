package learnOnline;

public class learnMain {
	public static void main(String[] args) {
		EducationService educationService = new EducationService();
		
		String type1 = "course";
		String title = "Python";
		int time = 50;
		educationService.startContent(type1, title, time);
		educationService.pauseContent();
		educationService.completeContent();
	}
}
