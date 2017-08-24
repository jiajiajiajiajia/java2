package 选择题案例;

import java.util.Scanner;

import 增加填空题.FillBlanks;
import 增加填空题.FillHandler2;
import 增加填空题.oneBlank;

public class test {

	public static void main(String[] args) {

		// 构造一个单选题
		//题干
		String t1 = "以下说法错误的是? ";
		//单选题的四个选项
		Option so1 = new Option('A', "==可用于基本类型数据的比较");
		Option so2 = new Option('B', "equals()  可用于引用 类型数据的比较");
		Option so3 = new Option('C', "intanseOf 可用于判断对象的类型");
		Option so4 = new Option('D', "String 是基本数据类型");
		Option[] sOptions = { so1, so2, so3, so4 };
		//代表  此题的正确答案是 D
		char singleAnswer = 'D';

		//第一题  构造完成
		Question s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer);

		////////////////////////////////////////////

		String t2 = "关于 集合 以下说法正确的是? ";

		Option mo1 = new Option('A', "ArrayList比数组好用");
		Option mo2 = new Option('B', "comparable 接口提供了排序功能");
		Option mo3 = new Option('C', "iterator 是类");
		Option mo4 = new Option('D', "Map继承自 Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//正确答案的数组 
		char[] multiAnswer = { 'A', 'B' };

		//多选题构造完毕
		Question m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);

		/////////////// 選擇题目集合
		Question[] questions = {s1,m1};
		
		//構造第一個填空題---一個空的那種
		String t3 = "近代中國最為大的作家是____";
		String [] trueAnswer= {"luxun"};
		FillBlanks d1=new oneBlank(t3, 1, trueAnswer);
		
		//構造第一個填空題---一個空的那種
	    String t4 = "植物生长需要：____";
		String [] trueAnswer2= {"sun","water","air"};
		FillBlanks fu1=new oneBlank(t4, 3, trueAnswer2);
		
		/////////////填空題目集合
		FillBlanks [] FillBlankss = {d1,fu1};


		

		/////////////////////
		// 显示题目
//		QuestionHandler handler = new QuestionHandler();
//		handler.showQuestion(questions);
		FillHandler2 handler2=new FillHandler2();
		handler2.showFill(FillBlankss);

		/////////////////////

		//System.out.println("检测结果");
//		handler.doCheck(questions);
		handler2.doCheck(FillBlankss);

	}

}