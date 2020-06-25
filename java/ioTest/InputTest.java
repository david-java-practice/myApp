package ioTest;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		while(true) {
			try {
				int i = System.in.read();
				if(i==-1) break;
				System.out.print((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
