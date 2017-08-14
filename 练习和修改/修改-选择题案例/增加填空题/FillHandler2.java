package 增加填空题;



public class FillHandler2 {

	// 检查答案...
			//@SuppressWarnings("static-access")
			public void doCheck(FillBlanks[] FillBlankss) {

				String result = "";

				for (int i = 0; i < FillBlankss.length; i++) {
					System.out.println("第"+(i+1)+"道填空題您要输入的空数为：");

					if (FillBlankss[i].check(Answer.getFills())) { 
						System.out.println("第"+(i+1)+"道填空題您要输入的空数为 : ");
//						if() {
//						result = "填空题" + (i+1)+"您答得空都对了，但是没有答全。";}
//						else
						result = "填空題" + (i + 1) + " : √ ";
					} else {
						System.out.println("第"+(i+1)+"道填空題您要输入的空数为 : ");
						result = "填空題" + (i + 1) + " : × ";
					}

					System.out.println(result);
				}

			}

	// 显示题目..
	public void showFill(FillBlanks[] FillBlankss) {

		if (FillBlankss != null && FillBlankss.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < FillBlankss.length; i++) {

				System.out.println("填空題 " + (i + 1) + " : " + FillBlankss[i].getTitle());
				System.out.println(".....................................");

			}
			
		}
	
	}
	

}