package question;

public class question {
	private String text;
	private int []trueanswers;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int[] getTrueanswers() {
		return trueanswers;
	}
	public void setTrueanswers(int[] trueanswers) {
		this.trueanswers = trueanswers;
	}
	public question(String text2) {
		// TODO �Զ����ɵĹ��캯�����
	}
	public boolean check(int[] answers) {
		if (answers==trueanswers)
		return true;
		else return false;
		
	}

}
