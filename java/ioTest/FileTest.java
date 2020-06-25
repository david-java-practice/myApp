package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		try {
			FileReader fis 
			   = new FileReader("src\\threadTest\\SynchronizedEx.java");
		    FileOutputStream fos = new FileOutputStream("output.txt"); 
			int c;
		     while((c=fis.read())!=-1){
		    	 System.out.print((char)c);
		    	 fos.write(c);
		     }
		     fis.close();
		     fos.close();
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
					e.printStackTrace();
		}

	}

}
