package ��װtest;

	import java.util.concurrent.locks.ReadWriteLock;

	import javax.tools.Diagnostic;


	import ��װ��ϰ_Ա������.companyInfor;
	import ��װ��ϰ_Ա������.departmentInfor;
	import ��װ��ϰ_Ա������.emp;
	import ��װ��ϰ_Ա������.function;
	import ��װ��ϰ_Ա������.people;
	import ��װ��ϰ_Ա������.wages;

	public class test {

		public static void main(String[] args) {
			people r1=new people();//newһ��people������ͨ���ӿڷ��������Բ���ֵ
			r1.setName("boss");
			r1.setAddress("ɽ��ʡ̫ԭ��");
			r1.setAge(23);
			r1.setEmail("1234@123.com");
			r1.setPhone(12345678);
			
			
			people r2=new people();
			r2.setName("����");
			emp R2=new emp();//newһ��Ա������
			R2.setPerson(r2);
			
			people r3=new people();
			r3.setName("����");
			emp R3=new emp();//newһ��Ա������
			R3.setPerson(r3);
			
			people r4=new people();
			r4.setName("����");
			emp R4=new emp();//newһ��Ա������
			R4.setPerson(r4);
			
			people r5=new people();
			r5.setName("����");
			emp R5=new emp();//newһ��Ա������
			R5.setPerson(r5);
			
			
			departmentInfor d1=new departmentInfor();//newһ���²���
			d1.setCount(10);
			d1.setName("���»�");
			
			companyInfor a=new companyInfor();//newһ��a��˾
			a.setCulture("ϸ�ھ������ˡ�");
			a.setName("���¼���");
			
			wages w=new wages();//new����һ���¹���ˮƽ
			int w1=w.sumWages(2);
			
			
			emp R1=new emp();//newһ��Ա������
			R1.setPerson(r1);//˵�����Ա�����Ǹղ�new�������Ǹ�people �� r1
			R1.setDepartmentInfor(d1);//˵�����Ա������d1����
			R1.setCompanyInfor(a);//Ա������a��˾
			emp[] emps = { R2, R3};
			R1.setDowns(emps);
			R1.setDepartment("�ܲ�");
			
			d1.setLader(R1);
			
			
			
			R1.print(R1);
			System.out.println("����н���ǣ�"+w1);
			
			
			function function=new function();
			function.addemp(emps, R4);
			function.deleteemp(emps, 1);
		}
	

}
