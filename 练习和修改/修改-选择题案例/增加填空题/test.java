package ���������;

public class test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// ����һ����ѡ��
		//���
		String t1 = "����˵���������? ";
		//��ѡ����ĸ�ѡ��
		Option so1 = new Option('A', "==�����ڻ����������ݵıȽ�");
		Option so2 = new Option('B', "equals()  ���������� �������ݵıȽ�");
		Option so3 = new Option('C', "intanseOf �������ж϶��������");
		Option so4 = new Option('D', "String �ǻ�����������");
		Option[] sOptions = { so1, so2, so3, so4 };
		//����  �������ȷ���� D
		char singleAnswer = 'D';

		//��һ��  �������
		Question s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer);

		////////////////////////////////////////////

		String t2 = "���� ���� ����˵����ȷ����? ";

		Option mo1 = new Option('A', "ArrayList���������");
		Option mo2 = new Option('B', "comparable �ӿ��ṩ��������");
		Option mo3 = new Option('C', "iterator ����");
		Option mo4 = new Option('D', "Map�̳��� Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//��ȷ�𰸵����� 
		char[] multiAnswer = { 'A', 'B' };

		//��ѡ�⹹�����
		Question m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);
		
		/////////////����⹹��
		String t3="�ҹ�������ΰ���������˭___";
		String[] trueAnswer=new String[] {"³Ѹ"};
		FillBlanks f1=new oneBlank(t3, 1, trueAnswer);
		
		String t4="ֲ����������Ҫ����___";
		String[] trueAnswer2=new String[] {"����","����","ˮ"};
		FillBlanks f2=new oneBlank(t4, 3, trueAnswer2);

		/////////////// ��Ŀ
		Question[] questions = {s1,m1};
		FillBlanks[] fillBlankss=new FillBlanks[] {f1,f2};
		
		
		
		
		
		
		

		/////////////////////
		// ��ʾ��Ŀ
//		QuestionHandler handler = new QuestionHandler();
//		handler.showQuestion(questions);
		FillHandler2 handler2=new FillHandler2();
		handler2.showFill(fillBlankss);

		/////////////////////

		//System.out.println("�����");
//		handler.doCheck(questions);
		handler2.doCheck(fillBlankss);

	}

}