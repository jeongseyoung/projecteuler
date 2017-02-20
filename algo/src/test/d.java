package test;
/*
* 20번

예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
여기서 10!의 각 자리수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.

100! 의 자리수를 모두 더하면 얼마입니까?
*/
public class d {

	public static void main(String[] args) {
		long result = 0;
		long num = 10;
		long sum = 0;
		for (int i = 10; i > 0; i--) {
			if (i - 1 == 0) {
				break;
			}
			result = num * (i - 1);
			num = result;
		}
		do {
			sum += result % 10;

			result /= 10;
		} while (result > 0);
		System.out.println(sum);

	}
}
