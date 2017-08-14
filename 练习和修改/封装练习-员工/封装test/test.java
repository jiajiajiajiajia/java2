package 封装test;

	import java.util.concurrent.locks.ReadWriteLock;

	import javax.tools.Diagnostic;


	import 封装练习_员工例子.companyInfor;
	import 封装练习_员工例子.departmentInfor;
	import 封装练习_员工例子.emp;
	import 封装练习_员工例子.function;
	import 封装练习_员工例子.people;
	import 封装练习_员工例子.wages;

	public class test {

		public static void main(String[] args) {
			people r1=new people();//new一个people出来，通过接口访问其属性并赋值
			r1.setName("boss");
			r1.setAddress("山西省太原市");
			r1.setAge(23);
			r1.setEmail("1234@123.com");
			r1.setPhone(12345678);
			
			
			people r2=new people();
			r2.setName("张三");
			emp R2=new emp();//new一个员工出来
			R2.setPerson(r2);
			
			people r3=new people();
			r3.setName("李四");
			emp R3=new emp();//new一个员工出来
			R3.setPerson(r3);
			
			people r4=new people();
			r4.setName("王五");
			emp R4=new emp();//new一个员工出来
			R4.setPerson(r4);
			
			people r5=new people();
			r5.setName("赵六");
			emp R5=new emp();//new一个员工出来
			R5.setPerson(r5);
			
			
			departmentInfor d1=new departmentInfor();//new一个新部门
			d1.setCount(10);
			d1.setName("董事会");
			
			companyInfor a=new companyInfor();//new一个a公司
			a.setCulture("细节决定命运。");
			a.setName("星月集团");
			
			wages w=new wages();//new出来一个新工资水平
			int w1=w.sumWages(2);
			
			
			emp R1=new emp();//new一个员工出来
			R1.setPerson(r1);//说明这个员工就是刚才new出来的那个people ： r1
			R1.setDepartmentInfor(d1);//说明这个员工属于d1部门
			R1.setCompanyInfor(a);//员工属于a公司
			emp[] emps = { R2, R3};
			R1.setDowns(emps);
			R1.setDepartment("总裁");
			
			d1.setLader(R1);
			
			
			
			R1.print(R1);
			System.out.println("他的薪资是："+w1);
			
			
			function function=new function();
			function.addemp(emps, R4);
			function.deleteemp(emps, 1);
		}
	

}
