package 增加填空题;

import javax.sound.midi.MidiChannel;

import org.apache.commons.lang3.ArrayUtils;

public class mulitBlanks extends FillBlanks{

	public mulitBlanks(String title, int type, String[] trueAnswer) {
		super(title, type, trueAnswer);
	}

	@Override
	public boolean check(String[] MulitFill) {
		boolean flag = true; //

		if (MulitFill != null && MulitFill.length == trueAnswer.length) { // 答案的个数和正确答案的个数 要匹配

			for (int i = 0; i < trueAnswer.length; i++) {

				flag =MulitFill[i].equals(trueAnswer[i]);

				if (!flag) break;
			}

		} else {
			flag = false;
		}

		return flag;
	}

}
