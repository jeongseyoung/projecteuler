package test;

import java.math.BigInteger;
import java.util.ArrayList;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseStr = "123";
/*		BigInteger sum;
		BigInteger num = new BigInteger("1234567899");
		BigInteger z = new BigInteger("50");
		BigInteger j = new BigInteger("1");
		j = z.add(BigInteger.valueOf(6));*/
		String str = "abcdefg";
		String str2 = "";
/*		System.out.println(new StringBuffer(num.toString()).reverse());
		System.out.println(Math.pow(20, 2) + " + " + Math.pow(48, 2) + " =  " + (Math.pow(20, 2) + Math.pow(48, 2)));
		System.out.println(Math.pow(288, 2) + Math.pow(175, 2));
		System.out.println(Math.pow(337, 2));*/
		for (int z = 0; z < String.valueOf(str).length(); z++) {
			for (int k = String.valueOf(str).length() - 1; k > -1; k--) {
				System.out.println("z: " + str.charAt(z) + " k: " + str.charAt(k));
			}
		}
		for(int i = 1 ; i < 10 ;  i++) {
			for (int j = 1 ; j < 10 ; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + " ");
			}
			System.out.println();
		}
		/*ArrayList<Integer> list = new ArrayList<>();
		list.add(13);
		list.add(13);
		list.add(13);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(5);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		int max = 0;
		int bestP = 0;
		for (int p = 1; p <= 1000; p++) {
			int found = 0;
			for (int a = 1; a < 300; a++) {
				for (int b = 1; b < 300; b++) {
					double c = Math.sqrt(a * a + b * b);
					if (a + b + c == p) {
						System.out.println(a + " " + b + " " + c + " " + " = " + (a + b + c));
						found++;
					}
				}
			}
			if (found > max) {
				max = found;
				bestP = p;
				list2.add(p);
			}
		}

		System.out.println(bestP);
		System.out.println(list2);*/
	}

	public static boolean reverse(String str) {
		if (str.equals("aa")) {
			return false;
		}
		return true;
	}

}
