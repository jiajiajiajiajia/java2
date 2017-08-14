package 封装练习_员工例子;


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
		System.out.println("基本信息： 员工姓名："+a.getPerson().getName()+"  员工年龄："+a.getPerson().getAge()+"  员工住址："+a.getPerson().getAddress()+"  员工电话："+a.getPerson().getPhone()+"  员工的邮箱："+a.getPerson().getEmail());
		System.out.println("公司信息：  所在公司："+a.getCompanyInfor().getName()+"  公司文化："+a.getCompanyInfor().getCulture()+"  岗位："+a.getDepartment());//+"工资："+a.getWages().sumWages(a)
		System.out.println("部门信息：  所在部门:"+a.getDepartmentInfor().getName()+"  部门人数："+a.getDepartmentInfor().getCount()+"  部门领导:"+a.getDepartmentInfor().getLader().getPerson().getName()+"  下属人员有："+a.getDowns()[0].getPerson().getName()+a.getDowns()[1].getPerson().getName()+"  领导是："+a.getUp());
	}
	
	

}
