package ѡ���ⰸ��;

import java.util.Scanner;

import ���������.FillBlanks;
import ���������.FillHandler2;
import ���������.oneBlank;

public class test {

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

		/////////////// �x����Ŀ����
		Question[] questions = {s1,m1};
		
		//�����һ������}---һ���յ��ǷN
		String t3 = "�����Ї������������____";
		String [] trueAnswer= {"luxun"};
		FillBlanks d1=new oneBlank(t3, 1, trueAnswer);
		
		//�����һ������}---һ���յ��ǷN
	    String t4 = "ֲ��������Ҫ��____";
		String [] trueAnswer2= {"sun","water","air"};
		FillBlanks fu1=new oneBlank(t4, 3, trueAnswer2);
		
		/////////////����}Ŀ����
		FillBlanks [] FillBlankss = {d1,fu1};


		

		/////////////////////
		// ��ʾ��Ŀ
//		QuestionHandler handler = new QuestionHandler();
//		handler.showQuestion(questions);
		FillHandler2 handler2=new FillHandler2();
		handler2.showFill(FillBlankss);

		/////////////////////

		//System.out.println("�����");
//		handler.doCheck(questions);
		handler2.doCheck(FillBlankss);

	}

}