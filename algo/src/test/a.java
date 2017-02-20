package test;

public class a {
/**
 *
 * Bubble sort
 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
            int num[] = {1,10,2,60,23,21};
            for(int i=0;i<num.length-1;i++) {
                for(int j=1;j<num.length-i;j++){
                    if(num[j-1] < num[j]) {
                        int tmp = num[j-1];
                        num[j-1] = num[j];
                        num[j] = tmp;
                    }
                }
            }
            for(int i=0;i<num.length;i++){
                System.out.println(" for 1 : " + num[i]);
            }
            System.out.println("");
            for(int i : num){
            	System.out.println(" for 2 : " + i);
            }
        }
    }
