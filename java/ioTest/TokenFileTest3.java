package ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFileTest3 {
	//input.txt 파일을 읽어서
	//8진수로 변환하여 octal.txt 파일로 출력
	//단, StringTokenizer 클래스 사용

	public static void main(String[] args) {
		Scanner sc=null;
		PrintStream pst=null;
			try {
				sc = new Scanner(new File("src\\iotest\\input.txt"));
				pst = new PrintStream("src\\iotest\\octal.txt");
				while(sc.hasNext()) {
					String str  = sc.nextLine();
					StringTokenizer st = new StringTokenizer(str,":");
					
					while(st.hasMoreTokens()) {
						String tok = st.nextToken();
						//8진수로 출력
						int v = Integer.parseInt(tok);
						System.out.print(Integer.toOctalString(v)+"\t");
						pst.print(Integer.toOctalString(v)+"\t");
					}
				}
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			}finally {
				sc.close();
				pst.close();
			}
			
		

	}


}
