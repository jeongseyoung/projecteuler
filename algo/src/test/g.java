package test;

import java.math.BigInteger;

/*
55번
*/
public class g {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10001; i++) {
			if (findNum(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean findNum(int num) {
		BigInteger bigNum = BigInteger.valueOf(num);//int와 long넣지 못하기 때문에 BigInteger를 이용함.
		for (int i = 1; i < 51; i++) {
			//reverse()를 사용하여 toString된 숫자를 거꾸로 출력한다.
			bigNum = bigNum.add(new BigInteger(new StringBuffer(bigNum.toString()).reverse().toString()));
			if (length(bigNum)) {
				return false;
			}
		}
		return true;
	}

	public static boolean length(BigInteger num) {
		int length = num.toString().length();
		//숫자를 반으로 잘라 대칭해본 후 리턴해준다
		for (int i = 0; i < length / 2; i++) {
			if (num.toString().charAt(i) != num.toString().charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
