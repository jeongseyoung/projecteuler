package test;
/*
* 20¹ø
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
