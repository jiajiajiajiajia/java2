package 封装练习_员工例子;

import javax.print.attribute.standard.PrinterInfo;

public class departmentInfor {
	private String name;
	private int count;
	private emp lader;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public emp getLader() {
		return lader;
	}
	public void setLader(emp lader) {
		this.lader = lader;
	}
	

}
