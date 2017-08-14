package question;

public class singleChoice extends question{
	private String [] options;
	private int answers;
	public singleChoice(String text2,String[] options ,int answers) {
		super(text2);
		this.answers=answers;
		this.options=options;
	}
	public boolean check(int doanswers) {
		if (doanswers== answers) {
			System.out.println("您输入的答案正确");
			}
		else {
			System.out.println("您输入的答案错误");
			}
			return false;
		
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getAnswers() {
		return answers;
	}
	public void setAnswers(int answers) {
		this.answers = answers;
	}

}
