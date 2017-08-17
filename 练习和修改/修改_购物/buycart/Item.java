package buycart;

import org.apache.commons.lang3.ArrayUtils;

public class Item {

	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}

	private Product product;
	private int amount;
	private double sumPrice;
	private String cColor;
	
	public Item(Product product, int amount,String cColor) {
		this.product = product;
		this.amount = amount;
		this.setcColor(cColor);
	}
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
		return "product=" +"��ţ�"+ product.getId()+"����Ʒ����"+ product.getName()+ "����Ʒ��ɫ"+cColor+"����Ʒ�۸�"+ product.getPrice() + ", amount=" + amount + ", sumPrice=" + getSumPrice();
	}
	

	// �ж�������Ʒ�Ƿ�һ��
	@Override
	public boolean equals(Object obj) {
		Item item01 = this;
		Item item02 = (Item) obj;
		
		if (item01.getProduct().getId() == item02.getProduct().getId()) {
			//System.out.println("һ��");
			return true;
		} else {
			return false;
		}
		
	}
	
	//����һ��ɾ������
//	public int  delete (Item item[],int i,int p) {
//		item[p].amount-=i;
//		if (item[p].amount==0) {
//			item[p]=item[p+1];
//			//�ü�����
//			item = ArrayUtils.subarray(item, 0, item.length-1);
//		}
//		return item[p].amount;
//	}
	
	
	
	public int delete (Item item,int i) {
		
		return item.amount-=i;
		
	}
	public int add (Item item,int i) {
		
		return item.amount+=i;
		
	}
	
	
	

	public double getSumPrice() {
		sumPrice=product.getPrice()*amount;
		return sumPrice;
	}

	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}
	public String getcColor() {
		return cColor;
	}
	public void setcColor(String cColor) {
		this.cColor = cColor;
	}

}
