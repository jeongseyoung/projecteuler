package test;

//39번.
public class h {
	public static void main(String[] args) {
		int count = 0;
		int max = 0; //가장많은 카운트를 저장할 변수
		int temp = 0;//둘레의 길이를 저장할 변수
		for (int p = 1; p < 1001; p++) {
			count = 0;
			for (int i = 1; i < 500; i++) {
				for (int j = 1; j < 500; j++) {
					int c = (int) (Math.pow(i, 2) + Math.pow(j, 2));
					if (i + j + Math.sqrt(c) == p) {
						//피타고라스정리를 이용하여 직각삼각형이 되는 경우에만 카운트를증가
						count++;
					}
				}
			}

			if (count > max) {
				max = count;//두번쨰 for문에서 완료된 카운트가 max값보다 많으면 max에 저장하고
				temp = p;//temp에 p(둘레)를 저장한다.
			}
		}
		System.out.println(temp);
	}
}
