package ioTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis 
			 = new FileInputStream("test.txt");
			while(true) {
				int i  = fis.read();
				if(i==-1) break;
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
