package test;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

/*
22번
여기 5천개 이상의 영문 이름들이 들어있는 46KB짜리 텍스트 파일 names.txt 이 있습니다 (우클릭해서 다운로드 받으세요).
이제 각 이름에 대해서 아래와 같은 방법으로 점수를 매기고자 합니다.

먼저 모든 이름을 알파벳 순으로 정렬합니다.
각 이름에 대해서, 그 이름을 이루는 알파벳에 해당하는 숫자(A=1, B=2, ..., Z=26)를 모두 더합니다.
여기에 이 이름의 순번을 곱합니다.
예를 들어 "COLIN"의 경우, 알파벳에 해당하는 숫자는 3, 15, 12, 9, 14이므로 합이 53, 그리고 정렬했을 때 938번째에 오므로 최종 점수는 938 × 53 = 49714가 됩니다.

names.txt에 들어있는 모든 이름의 점수를 계산해서 더하면 얼마입니까?
*/
public class e {

	public static void main(String[] args) throws Exception {

		File f = new File("d:\\img\\", "names.txt");//텍스트 파일을 불러온다


		@SuppressWarnings("resource")
		RandomAccessFile r = new RandomAccessFile(f, "rw");//RandomAccessFile API를 사용하여
														   //파일에 접근
		String text = "";
		String text2[] = null;
		ArrayList<String> list = new ArrayList<String>();
		while ((text = r.readLine()) != null) {
			text2 = text.split("\",\"");// " " 와 , 를 제거하여 text2에 저장
		}

		for (int i = 0; i < text2.length; i++) {
			list.add(text2[i]);
		}

		list.set(0, list.get(0).substring(1));
		list.set(5162, list.get(5162).substring(0, 6));
		Collections.sort(list);//알파벳순으로 정렬
		System.out.println(list);

		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			for(int j = 0 ; j < list.get(i).length() ; j++){
				//아스키코드를 사용하여 알파벳에 대응하는 숫자를 가져와서 계산한다.
				total += ((int)list.get(i).charAt(j)-64) * (i+1);
			}
		}
		System.out.println(total);
	}
}
