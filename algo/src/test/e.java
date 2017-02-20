package test;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

/*
22번
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
