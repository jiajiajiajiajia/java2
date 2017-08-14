package question;

public class questionTest {
	public static void main(String[] args) {
		String[] options1=new String[] {"贾明","杨雪梅","以上答案均不正确"};
		singleChoice s1=new singleChoice("你们的任课老师叫啥？", options1, 1);
		s1.check(1);
		
		String[] options2=new String[] {"贾明","杨雪梅","吴晓静"};
		int []a2=new int[] {1,3};
		multiChoice s2=new multiChoice("你们的老师叫啥？", options2, a2);
		int []do2=new int[] {3,1};
		s2.check(do2);
	}

}
