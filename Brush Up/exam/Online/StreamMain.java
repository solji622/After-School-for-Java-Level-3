package Online;

public class StreamMain {
	public static void main(String[] args) {
		StreamingService streamingService = new StreamingService();
		
		String contentType1 = "movie";
		String title1 = "Inception";
		int length1 = 148;
		streamingService.playStreaming(contentType1, title1, length1);
		
		// Pause the content
		streamingService.pauseStreaming();
		
		// Stop the content
		streamingService.stopStreaming();
		
		System.out.println();
		
		// Series 스트리밍
		String contentType2 = "series";
		String title2 = "Breaking Bad";
		int length2 = 47;
		streamingService.playStreaming(contentType2, title2, length2);
		
		System.out.println();
		
		// 잘못된 콘텐츠 유형
		String contentType3 = "music";
		String title3 = "Some Song";
		int length3 = 5;
		streamingService.playStreaming(contentType3, title3, length3);
		
	}
}
