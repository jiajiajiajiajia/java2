package buycart;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		
		Customer c1 = new Customer();
		c1.setId(540573386);
		c1.setName("tom");
		System.out.println("我们商场的第一位顾客为："+c1);
		
		
//		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack", true);
//		RecInfo rec2 = new RecInfo(1, "neusoft大厦", "保安队长-boss", false);
//		RecInfo[] infos = { rec1 , rec2 };
		
		
		Item item01 = new Item(p1 , 2 );
		Item item02 = new Item(p2 , 6 );
		Item item03 = new Item(p2 , 1);
		
		Item[] items = { item01 , item02 , item03};
		
		BuyCart cart = new BuyCart();
		
		cart.setItems(items);
		
		//做处理  , 　多余的让其加数量　　　减少项
		cart.handler();
		
		//////////////////////
		//查看购物车
		cart.showBuyCart();
		
		////////////////////
		//生成订单   留给大家.....
		Date date =new Date();
		Orders orders1=new Orders("订单号",date, c1, cart); 
		Orders.shouOrder(orders1);
	}
	

}
