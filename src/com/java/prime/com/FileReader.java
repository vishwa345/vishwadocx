package com.java.prime.com;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

	
		public static void main(String[] args) throws IOException {
			
			FileInputStream fis = new FileInputStream("B:\\TreeWork.java");
			
			int size = fis.available();
			
			
			for(int i = 0; i < size ; i++) {
				int a = fis.read();
				System.out.print((char)a);
		
			}
	        fis.close();
		}
		}


	



