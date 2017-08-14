package 选择题案例;



public class QuestionHandler {

	// 检查答案...
			//@SuppressWarnings("static-access")
			public void doCheck(Question[] questions) {

				String result = "";

				for (int i = 0; i < questions.length; i++) {
					System.out.println("第"+(i+1)+"道题的答案数为：");

					if (questions[i].check(Answer.getChoices())) {  //答案是 Answer 类  , 内容在  此类的数组里 
						System.out.println("第"+(i+1)+"道题的测评结果为 : ");
						result = "题" + (i + 1) + " : √ ";
					} else {
						System.out.println("第"+(i+1)+"道题的测评结果为 : ");
						result = "题" + (i + 1) + " : × ";
					}

					System.out.println(result);
				}

			}

	// 显示题目..
	public void showQuestion(Question[] questions) {

		if (questions != null && questions.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				
				System.out.println(".....................................");

			}
			
		}
	
	}
	

}