package question;

public class questionTest {
	public static void main(String[] args) {
		String[] options1=new String[] {"����","��ѩ÷","���ϴ𰸾�����ȷ"};
		singleChoice s1=new singleChoice("���ǵ��ο���ʦ��ɶ��", options1, 1);
		s1.check(1);
		
		String[] options2=new String[] {"����","��ѩ÷","������"};
		int []a2=new int[] {1,3};
		multiChoice s2=new multiChoice("���ǵ���ʦ��ɶ��", options2, a2);
		int []do2=new int[] {3,1};
		s2.check(do2);
	}

}
