package Online;

public class NullLabel {
	private static final Streamable nulllabel = new DefaultContent();
	private Streamable lastPlayedContent = nulllabel;
	
	public void playStreaming(String option, String title, int times) {
		System.out.println("스트리밍을 시작합니다. 유형: " + option + " 제목: " + title + " 재생 시간: " +times);
		Streamable content = ContentStore.FindStream(option, title, times);
		content.play();
		lastPlayedContent = content;
	}
	
	public void pauseStreaming() {
        if (lastPlayedContent != nulllabel) {
            lastPlayedContent.pause();
        } else {
            System.out.println("재생 중인 콘텐츠가 없습니다.");
        }
    }

    public void stopStreaming() {
        if (lastPlayedContent != nulllabel) {
            lastPlayedContent.stop();
            lastPlayedContent = nulllabel;
        } else {
            System.out.println("재생 중인 콘텐츠가 없습니다.");
        }
    }

    public Streamable getLastPlayedContent() {
        return lastPlayedContent;
    }
	
} 
