package ѡ���ⰸ��;

import java.util.Scanner;

public class Answer {
	
	
	
	private  char[] choices;


	public Answer() {
		
	}

	public static  char [] getChoices (){
		  
		Scanner choice =new Scanner(System.in);
		int count=choice.nextInt();
		System.out.println("������𰸣�");
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


	
}