package test;

/*39번.
세 변의 길이가 모두 자연수 {a, b, c}인 직각삼각형의 둘레를 p 로 둘 때, p = 120 을 만족하는 직각삼각형은 아래와 같이 세 개가 있습니다.

{20, 48, 52}, {24, 45, 51}, {30, 40, 50}
1000 이하의 둘레 p에 대해서, 직각삼각형이 가장 많이 만들어지는 p의 값은 얼마입니까?
*/
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
				max = count;//두번 for문에서 완료된 카운트가 max값보다 많으면 max에 저장하고
				temp = p;//temp에 p(둘레)를 저장한다.
			}
		}
		System.out.println(temp);
	}
}
