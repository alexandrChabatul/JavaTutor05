package by.epam.chebatul.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Product> products;

	{
		products = new ArrayList<>();
	}

	public Payment() {
	}

	public boolean addProduct(String name, int price) {
		return products.add(new Product(name.toLowerCase(), price));
	}

	public boolean removeProduct(String name) {
		int counter = 0;
		if (products.size() > 0) {
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i).getName().equals(name.toLowerCase())) {
					products.remove(i);
					i--;
					counter++;
				}
			}
		}
		return counter > 0;
	}

	public List<Product> getProducts() {
		return products;
	}

	public int getSum() {
		int sum = 0;
		if (products.size() > 0) {
			for (Product p : products) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [products=" + products + ", sum=" + getSum() + "]";
	}

	public static class Product {

		private String name;
		private int price;

		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "Product name - " + name + ", price - " + price + ".";
		}

	}
}
