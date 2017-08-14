package 封装练习_员工例子;

import java.security.MessageDigestSpi;

public class function {
	
	private emp emp;
	private departmentInfor departmentInfor;
	private emp[] emps;
    
	//增加员工
	public  static void addemp(emp emps [],emp a) {
		emp [] emps2=new emp[emps.length+1];
		System.arraycopy(emps, 0, emps2, 0, emps.length);
		emps2[emps.length]=a;
		for (int i=0;i<3;i++) {
		System.out.println(emps2[i].getPerson().getName()+"\t");
		}
		
	}
	//删除员工
	public  static emp[] deleteemp(emp emps [],int a) {
		emp [] emps2=new emp[emps.length-1];
		System.arraycopy(emps, 0, emps2, 0,a-1 );
		
		for (int i=a;i<emps.length-1;i++) {
			emps2[a]=emps[a+1];
			System.out.println(emps2[i].getPerson().getName()+"\t");
		}
		return emps2;
		
	}
	

}
