package test;

/*9번
세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.

a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
*/
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
