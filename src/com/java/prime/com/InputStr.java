package com.java.prime.com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStr {

	

		public static void main(String[] args) throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);
			String d = reader.readLine();

			FileInputStream fis = new FileInputStream("A:\\com.build.java\\src\\com\\build\\java\\Hallo.java");
			int x = fis.available();
			byte[] xyz = new byte[x];
			fis.read(xyz);
			String FileContent = new String(xyz);

			FileOutputStream fos = new FileOutputStream("A:\\com.build.java\\src\\com\\build\\java\\Hallo.java");
			
			
			FileContent.replace("s", "4");//s is Old Char and 4 is New Char
			 
			System.out.println(FileContent);
			
			byte[] readData = FileContent.getBytes();
			fos.write(readData);
			fos.close();

		}
		

	}

	


