package �̳�_��һ��;

public class firstPhone {
	private int price;
	private String name;
	private String color="bleak";
	private String brand;
	private int cpu;
	
	
	public String type="ipnone5";
	
	
	public firstPhone() {
		
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public  void takePhoto() {
		System.out.println("������ʹ��Ѽ�湫˾��Ʒ���е����չ��ܡ�");
	}
	public  void conversition() {
		System.out.println("������ʹ��Ѽ�湫˾��Ʒ���е�ͨ�����ܡ�");
	}
	public  void inline() {
		System.out.println("������ʹ��Ѽ�湫˾��Ʒ���е��������ܡ�");
	}

}
