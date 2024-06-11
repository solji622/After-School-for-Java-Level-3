package learnOnline;

public class EducationService {
	private static final Learnable nullLabel = new DefaultContent();
	private static Learnable lastLearnContent = nullLabel;
	
	public static void startContent(String type, String title, int time) {
		System.out.println(type + "을 시작합니다. 제목: " + title + " 시간: " + time);
		Learnable learnable = ContentCatalog.FindContent(type, title, time);
		learnable.start();
		lastLearnContent = learnable;
	}
	
	public void pauseContent() {
		if (lastLearnContent != nullLabel) {
			lastLearnContent.pause();
		} else {
			System.out.println("현재 재생 중인 콘텐츠가 없습니다.");
		}
	}
	
	public void completeContent() {
		if (lastLearnContent != nullLabel) {
			lastLearnContent.complete();
			lastLearnContent = nullLabel;
		} else {
			System.out.println("현재 재생 중인 콘텐츠가 없습니다.");
		}
	}
	
	public Learnable getLastLearnContent() {
		return lastLearnContent;
	}
}
