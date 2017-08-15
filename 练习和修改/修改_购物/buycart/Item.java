package buycart;

public class Item {

	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}

	private Product product;
	private int amount;
	private double sumPrice;
	
	public Item(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", amount=" + amount + ", sumPrice=" + getSumPrice() + "]";
	}
	

	// �ж�������Ʒ�Ƿ�һ��
	@Override
	public boolean equals(Object obj) {
		Item item01 = this;
		Item item02 = (Item) obj;
		
		if (item01.getProduct().getId() == item02.getProduct().getId()) {
			System.out.println("һ��");
			return true;
		} else {
			return false;
		}
		
	}

	public double getSumPrice() {
		sumPrice=product.getPrice()*amount;
		return sumPrice;
	}

	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}

}
