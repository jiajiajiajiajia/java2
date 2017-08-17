package buycart;

import java.util.Arrays;

public class Customer {
	
	private int id;
	private String name;
	private RecInfo rce1 ;
	private RecInfo[] recInfos;
	

	public Customer() {
		
	}
	public Customer(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Customer(int id, String name, RecInfo[] recInfos) {
		
		this.id = id;
		this.name = name;
		this.recInfos = recInfos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RecInfo[] getRecInfos() {
		
		return recInfos;
	}

	public void setRecInfos(RecInfo[] recInfos) {
		this.recInfos = recInfos;
	}
	
	////////////////////////////
	//判断地址没写成功
	public RecInfo[] print(Customer c3) {
	if (c3.getRecInfos().length!=1) {
		for (int i=0;i<c3.getRecInfos().length;i++) {
			if (c3.getRecInfos()[i].getIsDefault()==true) {
				RecInfo[]  recInfos={c3.getRecInfos()[i]};
				System.out.println(recInfos[i].toString());
				}
			}
		}
		return recInfos;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", recInfos=" +recInfos[0].toString()+ "]";
	}
	public RecInfo getRce1() {
		return rce1;
	}
	public void setRce1(RecInfo rce1) {
		this.rce1 = rce1;
	}

	
	

}
