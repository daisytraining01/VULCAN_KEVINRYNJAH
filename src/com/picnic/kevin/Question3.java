package com.picnic.kevin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question3 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("C:\\Summer_Camp\\Input.txt");
			out = new FileOutputStream("C:\\Summer_Camp\\Output.txt");
			int count;
			while((count = in.read()) !=-1)
				{
					out.write(count);
				}
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
			if(out != null)
			{
				out.close();
			}
		}
		System.out.println("Copying the contents:: Hello People.\r\n" + "This is test file.");
	}

}



//----------------OUTPUT------
/*
Copying the contents:: Hello People.
This is test file.

*/