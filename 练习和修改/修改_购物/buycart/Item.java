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
		return "product=" +"编号："+ product.getId()+"，商品名字"+ product.getName()+ "，商品颜色"+cColor+"，商品价格"+ product.getPrice() + ", amount=" + amount + ", sumPrice=" + getSumPrice();
	}
	

	// 判断两个产品是否一样
	@Override
	public boolean equals(Object obj) {
		Item item01 = this;
		Item item02 = (Item) obj;
		
		if (item01.getProduct().getId() == item02.getProduct().getId()) {
			//System.out.println("一样");
			return true;
		} else {
			return false;
		}
		
	}
	
	//增加一个删除函数
//	public int  delete (Item item[],int i,int p) {
//		item[p].amount-=i;
//		if (item[p].amount==0) {
//			item[p]=item[p+1];
//			//裁剪数组
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
