package ‘ˆº”ÃÓø’Ã‚;

public abstract class FillBlanks {
	protected String title;
	protected static int type; 
	protected String[] trueAnswer; 
	
	public FillBlanks(String title,int type,String [] trueAnswer) {
		this.title = title;
		this.trueAnswer=trueAnswer;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static int getType() {
		return type;
	}

	public String[] getTrueAnswer() {
		return trueAnswer;
	}

	public void setTrueAnswer(String[] trueAnswer) {
		this.trueAnswer = trueAnswer;
	}
	public abstract boolean check(String[] Fill);


}
