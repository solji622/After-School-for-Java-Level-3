package poly.ex.pay1;

public abstract class PayStore {
	// 결제 수단이 추가되거나 삭제되는 변경 일어나면 수정하는 부분
	public static Pay FindPay(String option) {
		if (option.equals("kakao")) {
			return new KakaoPay();
		} else if (option.equals("naver")) {
			return new NaverPay();
		} else {
			return new DefaultPay();
			// null값을 리턴하면 에러날 가능성이 높기에(안 다루는 것이 좋음)
			// 새로운 클래스를 생성하여 null일 시 반환할 것을 생성
		}
	}
	
}
