package class1;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		ProductOrder [] orders = new ProductOrder [3];
		orders[0] = new ProductOrder();
		orders[0].productName = "두부";
		orders[0].price = 2000;
		orders[0].quantity = 2;
		
		orders[1] = new ProductOrder();
		orders[1].productName = "김치";
		orders[1].price = 5000;
		orders[1].quantity = 1;
		
		orders[2] = new ProductOrder();
		orders[2].productName = "콜라";
		orders[2].price = 1500;
		orders[2].quantity = 2;
		
		int sumPrice = 0;
		for (ProductOrder p : orders) {
			System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
			sumPrice += p.price * p.quantity;
		}
		System.out.println("총 결제 금액 " + sumPrice);

	}

}
