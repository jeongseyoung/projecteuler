package test;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,10,2,60,23,21};
		int temp;
		for(int i=0;i<num.length;i++){
			temp = i;
			for(int j=1;j<num.length;i++) {
				if(num[temp] > num[j]) {
					temp = j;
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}

}
