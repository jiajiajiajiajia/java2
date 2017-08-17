package buycart;

import java.util.Arrays;

import org.omg.CORBA.portable.Delegate;

public class BuyCart {

	private  Item[] items; 

	public  Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
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
	
	public Item[] Dele() {
		for (int i=0;i<items.length;i++) {
			if (items[i].getAmount()==0) {
				items[i]=null;
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
		return "BuyCart [" + (items != null ? "items=" + Arrays.toString(items) : "") + "]";
	}

}
