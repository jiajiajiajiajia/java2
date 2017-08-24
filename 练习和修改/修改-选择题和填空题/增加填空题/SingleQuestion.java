package ���������;



public class SingleQuestion extends Question {
	
	public char answer; //��ȷ��
	
	public SingleQuestion(String title , Option[] options , int type , char answer) {
		
		super(title , options , type);
		this.answer = answer;
		
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}
	
	
	public boolean check(char[] customerChoice) {
		
		return this.answer == customerChoice[0] ? true : false;
	}
	

}
