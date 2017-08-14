package Ôö¼ÓÌî¿ÕÌâ;

public class oneBlank extends FillBlanks{
	protected static int type; 

	public oneBlank(String title, int type, String[] trueAnswer) {
		super(title, type, trueAnswer);
	}

	@Override
	public boolean check(String[] Fill) {
		
		return this.trueAnswer[0].equals(Fill[0]) ? true : false;
		
		
	}


}
