package �̳�_test;

import �̳�_��һ��.SecondPad;
import �̳�_��һ��.thirdPhone;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		thirdPhone phone =new thirdPhone();
		phone.setBrand("iphone");
		phone.setColor("��ɫ");
		System.out.println("��������ֻ���"+phone.getColor()+"��"+phone.getBrand()+"�ֻ������ǣ�"+phone.type);
		
		phone.takePhoto();
		phone.takeYourselfPhoto();
		phone.order();
		
		SecondPad pad =new SecondPad();
		pad.setBrand("ipad");
		pad.setColor("��ɫ");
		System.out.println("������ĵ��Ӳ�Ʒ��"+pad.getColor()+"��"+pad.getBrand()+"�����ǣ�"+pad.type);
		
		pad.takePhoto();
		pad.watchTV();
	

	}

}
