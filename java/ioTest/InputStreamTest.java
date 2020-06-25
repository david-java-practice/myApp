package ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("test.txt");
			while(true) {
				int i = System.in.read();
				if(i==-1) break;
				fs.write(i);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}

	}

}
