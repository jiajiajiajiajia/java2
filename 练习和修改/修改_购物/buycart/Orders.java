package buycart;

import java.util.Date;

public class Orders {
	
	private String oid;
	private Date date;
	private double totel;
	
	private RecInfo recInfo;
	private BuyCart buyCart;
	private Customer customer;
	
	
	public Orders(String oid, Date date,BuyCart buyCart) {
		this.oid = oid;
		this.date = date;
		this.buyCart = buyCart;
	}
	
	public Orders(String oid, Date date,Customer customer, BuyCart buyCart) {
		this.oid = oid;
		this.date = date;
		this.customer =customer;
		this.buyCart = buyCart;
	}
	
	@Override
	public String toString() {
		return "新生成了一笔订单，信息如下：【"+"订单号为：" + oid +"日期为：" + date +","+ "\n"+ "顾客信息为：" + customer +","+ "\n"+"购物车信息为：" + buyCart +"" +","+ "\n"+"订单总价为："+getTotel()+"】";
		
	}
	
	public static void shouOrder(Orders orders) {
		System.out.println(orders);
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public RecInfo getRecInfo() {
		return recInfo;
	}

	public void setRecInfo(RecInfo recInfo) {
		this.recInfo = recInfo;
	}

	public BuyCart getBuyCart() {
		return buyCart;
	}

	public void setBuyCart(BuyCart buyCart) {
		this.buyCart = buyCart;
	}

	public double getTotel() {
		for (int i=0;i<buyCart.getItems().length;i++) {
			 totel+=buyCart.getItems()[i].getSumPrice();
			 }
		return totel;
	}

	public void setTotel(double totel) {
		this.totel = totel;
	}
	
	
	

}
