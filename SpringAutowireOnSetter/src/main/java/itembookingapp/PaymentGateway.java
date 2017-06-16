package itembookingapp;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentGateway {
	private Order order;

	public Order getOrder() {
		return order;
	}

	@Autowired
	public void setOrder(Order order) {
		this.order = order;
	}

	public String toString(){
		return "Ordered Item : " +order.getItem() +" | "
				+"Price : " +order.getPrice();
	}
}
