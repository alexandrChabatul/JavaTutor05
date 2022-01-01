package by.epam.chebatul.task2;

public class Test {

	public static void main(String[] args) {
		Payment pay = new Payment();
		pay.addProduct("Milk", 10);
		pay.addProduct("Bread", 12);
		pay.addProduct("Eags", 11);
		pay.addProduct("Potato", 1);

		View view = new View();
		view.printPayment(pay);
		System.out.println(pay.getSum());

		System.out.println(pay.removeProduct("MILK"));
		System.out.println();
		view.printPayment(pay);
		System.out.println(pay.getSum());

	}

}
