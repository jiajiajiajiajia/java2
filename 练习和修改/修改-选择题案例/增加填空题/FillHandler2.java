package ���������;



public class FillHandler2 {

	// ����...
			//@SuppressWarnings("static-access")
			public void doCheck(FillBlanks[] FillBlankss) {

				String result = "";

				for (int i = 0; i < FillBlankss.length; i++) {
					System.out.println("��"+(i+1)+"������}��Ҫ����Ŀ���Ϊ��");

					if (FillBlankss[i].check(Answer.getFills())) { 
						System.out.println("��"+(i+1)+"������}��Ҫ����Ŀ���Ϊ : ");
//						if() {
//						result = "�����" + (i+1)+"����ÿն����ˣ�����û�д�ȫ��";}
//						else
						result = "����}" + (i + 1) + " : �� ";
					} else {
						System.out.println("��"+(i+1)+"������}��Ҫ����Ŀ���Ϊ : ");
						result = "����}" + (i + 1) + " : �� ";
					}

					System.out.println(result);
				}

			}

	// ��ʾ��Ŀ..
	public void showFill(FillBlanks[] FillBlankss) {

		if (FillBlankss != null && FillBlankss.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < FillBlankss.length; i++) {

				System.out.println("����} " + (i + 1) + " : " + FillBlankss[i].getTitle());
				System.out.println(".....................................");

			}
			
		}
	
	}
	

}