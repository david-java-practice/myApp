package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장입력>>");
		String line = sc.nextLine();
		//문장의 길이만큼 반복
		for(int i=0; i<line.length();i++) {
			//1. 첫글자 구하기
			// 2. 두번째부터 끝까지 구하기
			// 2+1   하기
			//String first = line.substring(0,1);
			char first = line.charAt(0);
			String second = line.substring(1);
			line = second+first;
			System.out.println(line);
		}

	}

}
