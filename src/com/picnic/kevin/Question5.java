package com.picnic.kevin;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		String str1 = null,str2 = null;
		String temp = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string::");
		str1 = s.nextLine();
		System.out.println("Please enter the character(s) you want to remove:::");
		str2 = s.nextLine();
		temp = str1;
		 if (str1.contains(str2))
		 { 
	         str1 = str1.replaceAll(str2, "");
	   		 System.out.println("The String after modification:: " + str1);	
		 }
		 else
		 {
			 System.out.println("The Character you have entered is invalid::");
		 }
		 if(str1.contentEquals(temp))
		 {
			 System.out.println("The string is the same and has not been modified");
		 }
		 else
		 {
			 System.out.println("The string has been modified"); 
		 }
	}
}






//-----------------------------output---------

/*Please enter the string::
REST ASSURED
Please enter the character(s) you want to remove:::
ST
The String after modification:: RE ASSURED
The string has been modified
*/