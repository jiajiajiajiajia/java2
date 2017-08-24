package buycart;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String color[]= {"��ɫ","��ɫ","��ɫ","��ɫ"};
		Product p1 = new Product(1, "Java�����ŵ���ͨ", 100,color);
		Product p2 = new Product(2, "iphone 8", 10,color);
		Product p3 = new Product(3, "iphone 10", 50,color);
		Product p4 = new Product(4, "ipad", 50,color);
		
		
		
		RecInfo rec1 = new RecInfo(1, "�ǻ۹�Ԣ", "����-jack", true);
		RecInfo rec2 = new RecInfo(1, "neusoft����", "�����ӳ�-boss", false);
		RecInfo[] infos1 = { rec2 };
		RecInfo[] infos2 = { rec1 , rec2 };
		
		Customer c1 = new Customer(540573386,"tom");
		c1.setRecInfos(infos1);
		System.out.println("�����̳��ĵ�һλ�˿�Ϊ��"+c1);
		
		
		Customer c2 = new Customer(4567, "name",infos1);
		System.out.println("�����̳��ĵ�2λ�˿�Ϊ��"+c2);
		
		Customer c3 = new Customer(4567, "name");
		c3.setRecInfos(infos2);
		System.out.println("�����̳��ĵ�3λ�˿�Ϊ��"+c3);
		
		
		
		
		Item item1= new Item(p1 , 2 );
		Item iphone = new Item(p2 , 6 ,"��ɫ");
		Item item4 = new Item(p3 , 1);
		Item item5 = new Item(p4 , 1);
		
		ArrayList<Item> items = new ArrayList<Item>() ;
		items.add(item1);
		items.add(iphone);
		items.add(item4);
		items.add(item5);

		////////////////
		//�޸�ĳ�������������
		iphone.delete(iphone,2);
		System.out.println(iphone.getAmount());
		item1.delete(item1,2);
		System.out.println(item1.getAmount());
		item4.add(item4,2);
		System.out.println(item4.getAmount());
		
		
		
		
		BuyCart cart = new BuyCart();
		cart.setItems(items);
		
		//������  , ����������������������������
		//cart.handler();
		
		//////////////////////
		//�鿴���ﳵ
		cart.showBuyCart();
		
		////////////////////
		//���ɶ���   �������.....
		Date date =new Date();
		Orders orders1=new Orders("������",date, c1, cart); 
		Orders.shouOrder(orders1);
		
		
	}
	

}
