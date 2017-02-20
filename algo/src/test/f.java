package test;

import java.math.BigInteger;

/*
55번

47이란 숫자를 골라서 뒤집은 다음 다시 원래 수에 더하면, 47 + 74 = 121 과 같이 대칭수(palindrome)가 됩니다.
물론 모든 숫자가 이토록 쉽게 대칭수를 만들어내지는 않습니다. 예를 들어 349의 경우,

349 + 943 = 1292
1292 + 2921 = 4213
4213 + 3124 = 7337

위에서 보는 것처럼 3번의 반복과정을 거쳐야 대칭수가 됩니다.

196과 같은 몇몇 숫자들은 이와 같은 과정을 아무리 반복해도 대칭수가 되지 않을 것이라고 추측되는데, 이런 수를 라이크렐 수 (Lychrel number) 라고 부릅니다. 아직 증명되지는 않았지만, 문제 풀이를 위해서 일단 라이크렐 수가 존재한다고 가정을 하겠습니다.

또한 1만 이하의 숫자들은, 50번 미만의 반복으로 대칭수가 되든지 라이크렐 수이든지 둘 중 하나라고 합니다.
1만을 넘어서면 10677에 이르렀을 때 비로소 53번의 반복으로 4668731596684224866951378664 라는 28자리의 대칭수가 만들어집니다.

그러면 1만 이하에는 몇 개의 라이크렐 수가 존재합니까?
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
