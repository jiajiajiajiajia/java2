package ��װ��ϰ_Ա������;


public class emp {
	private people person;
	private departmentInfor departmentInfor;
	private wages wages;
	private companyInfor companyInfor;
	
	
	private emp up;
	private emp[] downs;
	private String department;
	
	
	public people getPerson() {
		return person;
	}
	public void setPerson(people person) {
		this.person = person;
	}
	public departmentInfor getDepartmentInfor() {
		return departmentInfor;
	}
	public void setDepartmentInfor(departmentInfor departmentInfor) {
		this.departmentInfor = departmentInfor;
	}
	public wages getWages() {
		return wages;
	}
	public void setWages(wages wages) {
		this.wages = wages;
	}
	public companyInfor getCompanyInfor() {
		return companyInfor;
	}
	public void setCompanyInfor(companyInfor companyInfor) {
		this.companyInfor = companyInfor;
	}
	
	public emp getUp() {
		return up;
	}
	public void setUp(emp up) {
		this.up = up;
	}
	public emp[] getDowns() {
		return downs;
	}
	public void setDowns(emp[] downs) {
		this.downs = downs;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void print(emp a) {
		System.out.println("������Ϣ�� Ա��������"+a.getPerson().getName()+"  Ա�����䣺"+a.getPerson().getAge()+"  Ա��סַ��"+a.getPerson().getAddress()+"  Ա���绰��"+a.getPerson().getPhone()+"  Ա�������䣺"+a.getPerson().getEmail());
		System.out.println("��˾��Ϣ��  ���ڹ�˾��"+a.getCompanyInfor().getName()+"  ��˾�Ļ���"+a.getCompanyInfor().getCulture()+"  ��λ��"+a.getDepartment());//+"���ʣ�"+a.getWages().sumWages(a)
		System.out.println("������Ϣ��  ���ڲ���:"+a.getDepartmentInfor().getName()+"  ����������"+a.getDepartmentInfor().getCount()+"  �����쵼:"+a.getDepartmentInfor().getLader().getPerson().getName()+"  ������Ա�У�"+a.getDowns()[0].getPerson().getName()+a.getDowns()[1].getPerson().getName()+"  �쵼�ǣ�"+a.getUp());
	}
	
	

}
