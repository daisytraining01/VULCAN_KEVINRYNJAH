package com.picnic.kevin;

import java.util.Scanner;
public class Question6
	{ 
		public static void main(String args[])
			{
				String str,rev="";
				Scanner s = new Scanner(System.in);
				System.out.println("Enter any string::");
				str=s.nextLine();
				int length=str.length();
				for(int i=length-1;i>=0;i--)
					rev = rev + str.charAt(i);
				System.out.println("Reverse of a string::" + rev);
				if(str.equals(rev))	
					System.out.println(str + " is a palindrome");
				else
					System.out.println(str + " is not a palindrome");
			}
	}

//-------OUTPUT--------
/*
Enter any string::
KEVIN
Reverse of a string::NIVEK
KEVIN is not a palindrome
*/
