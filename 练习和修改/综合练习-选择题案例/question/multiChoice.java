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
		//�ж��������鳤���Ƿ�һ��
		if (doanswers.length == answers.length) {
			
			//���û�����Ĵ��Ÿ�˳��
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
			//����׼����һ��˳��
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
			//�ж�������ÿ��ֵ�Ƿ�һ����һ���Ͷԣ���һ���ʹ�
			boolean b=false;
			for (int i=0;i<answers.length;i++) {
				if (doanswers[i]==answers[i]) {
					b=true;
				}else { b=false; break;}
				
			}
			if (b)System.out.println("������Ĵ���ȷ");
			else System.out.println("������Ĵ𰸴���");
			}
		else {//���Ȳ�һ����ֱ���������
			System.out.println("������Ĵ𰸴���");
			}
		return false;
		
	}
	
}
