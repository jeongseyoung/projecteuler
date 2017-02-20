package test;

import java.util.ArrayList;

public class i {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 300; i++) {
			for (int j = 0; j < String.valueOf(i).length(); j++) {
				for (int k = String.valueOf(i).length() - 1; k > -1; k--) {
					if (String.valueOf(i).charAt(j) != String.valueOf(i).charAt(k)) {
						System.out.println("j: " + String.valueOf(i).charAt(j) + " k: " + String.valueOf(i).charAt(k));
						list.add(i);
					}
				}
			}
		}
		System.out.println(list);
	}
}
