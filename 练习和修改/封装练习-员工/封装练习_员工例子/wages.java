package 封装练习_员工例子;

public class wages {
	private int basicWages;
	private int bonus;
	
	
	public int getBasicWages() {
		return basicWages;
	}
	public void setBasicWages(int basicWages) {
		this.basicWages = basicWages;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int sumWages(int a) {
		switch (a) {
		case 1:{basicWages=550000;
		        bonus=30000;
		}
		case 2:{basicWages=80000;
				bonus=30000;
		}
		case 3:{basicWages=60000;
		        bonus=20000;
		}
			
			break;
		}
		int sum=basicWages+bonus;
		return sum;
		
	}

}
