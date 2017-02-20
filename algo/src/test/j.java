package test;

//9¹ø
public class j {
	public static void main(String[] args) {
		for (int i = 1; i < 500; i++) {
			for (int j = 1; j < 500; j++) {
				int c = (int) (Math.pow(i, 2) + Math.pow(j, 2));
				if (i < j && j < c && i < c && i + j + Math.sqrt(c) == 1000) {
					System.out.println(i * j * (int)Math.sqrt(c));
				}

			}
		}
	}
}
