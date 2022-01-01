package by.epam.chebatul.task2;

public class View {

	public void printPayment(Payment payment) {
		System.out.println("List of products:");
		if (payment.getProducts().size() > 0) {
			for (int i = 0; i < payment.getProducts().size(); i++) {
				System.out.println(payment.getProducts().get(i).toString());
			}
		} else {
			System.out.println("No products.");
		}
	}

}
