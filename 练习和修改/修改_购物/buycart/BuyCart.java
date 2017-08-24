package buycart;

import java.util.ArrayList;

public class BuyCart {

	
	ArrayList<Item> items;

	public  ArrayList<Item> getItems() {
		return items;
	}
	
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

//	//合并订单的。
//	public void handler() {
//		for (int i = 0; i < items.length-1; i++) {
//			if(items[i].equals(items[i+1])) {
//				items[i].setAmount(items[i].getAmount()+items[i+1].getAmount()); // 6+1
//				items[i+1] = null;
//				//裁剪数组
//				items = ArrayUtils.subarray(items, 0, items.length-1);
//			}
//		}
//	}
	
	

	public void showBuyCart() {

		for (Item item : items) {
			if (item.getAmount()>0)
				System.out.println(item);
		}

	}
	
	public ArrayList<Item> Dele() {
		for (int i=0;i<items.size();i++) {
			if (items.get(i).getAmount()==0) {
				items.remove(i);
			}
		}
		return items;
		
	}

	@Override
	public String toString() {
//		for (int i=0;i<items.length;i++) {
//			if (items[i].getAmount()==0) {
//				items[i]=null;
//			}
//		}		
		return "BuyCart [" + (items != null ? "items=" + items : "") + "]";
	}

}
