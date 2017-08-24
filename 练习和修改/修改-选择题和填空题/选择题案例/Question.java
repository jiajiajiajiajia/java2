package 选择题案例;



//JavaBean
public class Question {

	protected String title;
	protected Option[] options;
	protected int type; // 案例中 没用到 type    , 0 = 单选 , 1 = 多选
	
	
	public Question() {
		
	}
	
	public Question(String title, Option[] options , int type) {
		super();
		this.title = title;
		this.options = options;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	//父类定义 , 但由子类来实现真正的检验方式
		

		public boolean check(char[] choices) {
			// TODO 自动生成的方法存根
			return false;
		}

		public boolean check(Answer answer) {
			// TODO 自动生成的方法存根
			return false;
		}

		

		
	
}