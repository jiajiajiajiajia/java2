package ѡ���ⰸ��;



public class QuestionHandler {

	// ����...
			//@SuppressWarnings("static-access")
			public void doCheck(Question[] questions) {

				String result = "";

				for (int i = 0; i < questions.length; i++) {
					System.out.println("��"+(i+1)+"����Ĵ���Ϊ��");

					if (questions[i].check(Answer.getChoices())) {  //���� Answer ��  , ������  ����������� 
						System.out.println("��"+(i+1)+"����Ĳ������Ϊ : ");
						result = "��" + (i + 1) + " : �� ";
					} else {
						System.out.println("��"+(i+1)+"����Ĳ������Ϊ : ");
						result = "��" + (i + 1) + " : �� ";
					}

					System.out.println(result);
				}

			}

	// ��ʾ��Ŀ..
	public void showQuestion(Question[] questions) {

		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("��Ŀ " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				
				System.out.println(".....................................");

			}
			
		}
	
	}
	

}