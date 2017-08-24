package buycart;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String color[]= {"红色","黄色","绿色","白色"};
		Product p1 = new Product(1, "Java从入门到精通", 100,color);
		Product p2 = new Product(2, "iphone 8", 10,color);
		Product p3 = new Product(3, "iphone 10", 50,color);
		Product p4 = new Product(4, "ipad", 50,color);
		
		
		
		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack", true);
		RecInfo rec2 = new RecInfo(1, "neusoft大厦", "保安队长-boss", false);
		RecInfo[] infos1 = { rec2 };
		RecInfo[] infos2 = { rec1 , rec2 };
		
		Customer c1 = new Customer(540573386,"tom");
		c1.setRecInfos(infos1);
		System.out.println("我们商场的第一位顾客为："+c1);
		
		
		Customer c2 = new Customer(4567, "name",infos1);
		System.out.println("我们商场的第2位顾客为："+c2);
		
		Customer c3 = new Customer(4567, "name");
		c3.setRecInfos(infos2);
		System.out.println("我们商场的第3位顾客为："+c3);
		
		
		
		
		Item item1= new Item(p1 , 2 );
		Item iphone = new Item(p2 , 6 ,"黄色");
		Item item4 = new Item(p3 , 1);
		Item item5 = new Item(p4 , 1);
		
		ArrayList<Item> items = new ArrayList<Item>() ;
		items.add(item1);
		items.add(iphone);
		items.add(item4);
		items.add(item5);

		////////////////
		//修改某个订单里的数量
		iphone.delete(iphone,2);
		System.out.println(iphone.getAmount());
		item1.delete(item1,2);
		System.out.println(item1.getAmount());
		item4.add(item4,2);
		System.out.println(item4.getAmount());
		
		
		
		
		BuyCart cart = new BuyCart();
		cart.setItems(items);
		
		//做处理  , 　多余的让其加数量　　　减少项
		//cart.handler();
		
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
