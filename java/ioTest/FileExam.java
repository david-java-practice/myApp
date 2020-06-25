package ioTest;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+"="+f1.getParent()+"="+f1.getName());
		String res="";
		if(f1.isFile()) res="파일";
		else if(f1.isDirectory()) res="디렉토리";
		System.out.println(f1.getPath() +"은 " + res +"입니다.");
		File f2 = new File("folder");
		if(f2.isFile()) res="파일";
		else if(f2.isDirectory()) res="디렉토리";
		System.out.println(f2.getPath() +"은 " + res +"입니다.");
		if(!f2.exists()) {
			System.out.println("파일없음");
		}
		System.out.println("--- 서브 리스트. ---");
		File[] subFiles = f2.listFiles();
		for(int i=0;i<subFiles.length;i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.println(t);
			System.out.println(f.getName());
			System.out.println("파일 크기 : " + f.length());
			System.out.printf("수정한 시간 : %ty년 %tb %td %ta %tT\n", t,t,t,t,t);
		   //6월 08 월 15:31:30
		}
		
		
		
		
		
		
		
	}

}
