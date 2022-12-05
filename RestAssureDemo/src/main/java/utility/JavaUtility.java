package utility;

import java.util.Random;

public class JavaUtility {

	public static int getRanDomNum(int index) {
		Random randNum = new Random();
		int ranDomNum = randNum.nextInt(index);
		System.out.println(ranDomNum);
		return ranDomNum;
		}
}
