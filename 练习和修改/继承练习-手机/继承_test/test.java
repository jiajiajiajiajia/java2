package 继承_test;

import 继承_试一试.SecondPad;
import 继承_试一试.thirdPhone;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		thirdPhone phone =new thirdPhone();
		phone.setBrand("iphone");
		phone.setColor("白色");
		System.out.println("我新买的手机是"+phone.getColor()+"的"+phone.getBrand()+"手机类型是："+phone.type);
		
		phone.takePhoto();
		phone.takeYourselfPhoto();
		phone.order();
		
		SecondPad pad =new SecondPad();
		pad.setBrand("ipad");
		pad.setColor("白色");
		System.out.println("我新买的电子产品是"+pad.getColor()+"的"+pad.getBrand()+"类型是："+pad.type);
		
		pad.takePhoto();
		pad.watchTV();
	

	}

}
