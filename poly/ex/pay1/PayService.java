package poly.ex.pay1;

public class PayService {
	public void proccessPay(String option, int amount) {
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
		
		Pay pay = PayStore.FindPay(option);
		
		boolean result = pay.pay(amount);
		
		if(result) {
			System.out.println("결제가 성공되었습니다.");
		} else {
			System.out.println("결제를 실패하였습니다.");
		}
		
		
	}
}
