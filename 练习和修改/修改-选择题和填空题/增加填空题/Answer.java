package 增加填空题;

import java.util.Scanner;

public class Answer {
	
	
	
	@SuppressWarnings("unused")
	private  char[] choices;
	@SuppressWarnings("unused")
	private  String[] Fills;


	public Answer() {
		
	}

	public static  char [] getChoices (){
		  
		@SuppressWarnings("resource")
		Scanner choice =new Scanner(System.in);
		int count=choice.nextInt();
		System.out.println("请输入答案：");
		char[]choices=new char[count];
		for(int i=0;i<count;i++) {
			String str=choice.next();
			choices[i]=str.charAt(0);
		}
		
		return choices;
	}
	
	
	public Answer(char[] choices) {
		this.choices=choices;
		
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public static  String [] getFills(){
		  
		Scanner Fill =new Scanner(System.in);
		int count=Fill.nextInt();
		System.out.println("请输入答案：");
		String[]Fills=new String[count];
		//String[]Fills=new String[FillBlanks.getType()];
		for(int i=0;i<count;i++) {
			String str=Fill.next();
			Fills[i]=str;
		}
		
		return Fills;
	}


	
}