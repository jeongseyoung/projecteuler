package test;

import java.math.BigInteger;

/*
55¹ø ½ÇÆÐ
*/
public class f {

	public static void main(String[] args) throws Exception {
		BigInteger reverseStr;
		BigInteger sum;
		String mfStr = "";
		String mrStr = "";
		BigInteger num;
		int a = 1;
		int count = 0;
		do {
			num = BigInteger.valueOf(a);
			for (int i = 1; i < 51; i++) {
				reverseStr = reverse(num);
				sum = num.add(reverseStr);
				System.out.println(num + " + " + reverseStr + " = " + sum);
				num = sum;
				int m = String.valueOf(num).length() / 2;

				for (int k = 0; k < String.valueOf(num).length(); k++) {

					if (m % 2 == 0) {
						if (k == m) {
							break;
						}
						mfStr += String.valueOf(num).charAt(k);
					} else {
						if (k == (m + 1)) {
							break;
						}
						mfStr += String.valueOf(num).charAt(k);
					}
				}
				System.out.println("mf" + mfStr);
				for (int k = String.valueOf(num).length() - 1; k > -1; k--) {
					if (m % 2 == 0) {
						if (k == (m-1)) {
							break;
						}
						mrStr += String.valueOf(num).charAt(k);System.out.println("k:"+k);
					} else {
						if (k == (m-1)) {
							break;
						}
						mrStr += String.valueOf(num).charAt(k);System.out.println("k:"+k);
					}
				}
				System.out.println("mr" + mrStr);
				if (mfStr.equals(mrStr)) {
					count++;
					break;
				}
				System.out.println("i" + i);
				mfStr = "";
				mrStr = "";
			}
			a++;
		} while (a < 10001);
		System.out.println("ÃÑ°¹¼ö : " + (10000 - count));
	}

	public static BigInteger reverse(BigInteger num) {
		int numLength = String.valueOf(num).length();
		String reverseStr = "";
		for (int i = numLength - 1; i > -1; i--) {
			reverseStr += String.valueOf(num).charAt(i);
		}
		return new BigInteger(reverseStr);
	}

	/*
	 * public static boolean Sub(BigInteger num, int m) { String mfStr = "";
	 * String mrStr = ""; for (int k = 0; k < String.valueOf(num).length(); k++)
	 * { if (k == m) { break; } mfStr += String.valueOf(num).charAt(k);
	 * System.out.println(mfStr); } for (int k = String.valueOf(num).length() -
	 * 1; k > -1; k--) { if (k == (m - 1)) { break; } mrStr +=
	 * String.valueOf(num).charAt(k); System.out.println(mrStr); } return true;
	 * }
	 */
}
