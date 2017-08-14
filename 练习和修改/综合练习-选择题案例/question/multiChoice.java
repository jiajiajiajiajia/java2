package question;

public class multiChoice extends question{

	private String[] options;
	private int[] answers;
	public multiChoice(String text2,String[] options ,int [] answers) {
		super(text2);
		this.answers=answers;
		this.options=options;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int[] getAnswers() {
		return answers;
	}
	public void setAnswers(int[] answers) {
		this.answers = answers;
	}
	
	
	public boolean check(int[] doanswers) {
		//判断两个数组长度是否一样
		if (doanswers.length == answers.length) {
			
			//给用户输入的答案排个顺序
			int temp=0;
			for(int i=0;i<=doanswers.length;i++) {
				for (int j=0;j<doanswers.length-1;j++) {
					if (doanswers[j]<doanswers[j+1]) {
						temp=doanswers[j];
						doanswers[j]=doanswers[j+1];
						doanswers[j+1]=temp;
					}
				}
			}
			//给标准答案排一下顺序
			int temp2=0;
			for(int i=0;i<=answers.length;i++) {
				for (int j=0;j<answers.length-1;j++) {
					if (answers[j]<answers[j+1]) {
						temp=answers[j];
						answers[j]=answers[j+1];
						answers[j+1]=temp;
					}
				}
			}
			//判断数组中每个值是否一样，一样就对，不一样就错
			boolean b=false;
			for (int i=0;i<answers.length;i++) {
				if (doanswers[i]==answers[i]) {
					b=true;
				}else { b=false; break;}
				
			}
			if (b)System.out.println("您输入的答案正确");
			else System.out.println("您输入的答案错误");
			}
		else {//长度不一样，直接输出错误
			System.out.println("您输入的答案错误");
			}
		return false;
		
	}
	
}
