package com.picnic.kevin;

import java.util.Scanner;

public class Question2 {
	int num1=0,num2=1;

	public void fibo(int num)
	{
		System.out.println("The Fibonacci series is::");
		if(num==0)
			System.out.print("Please enter a number greater than 0");	
		else
		{
		System.out.print(num1 + " " + num2);
		
		for(int i=1;i<num;i++)
		{
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" ");
			System.out.print(sum);
		}
	}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num;
		System.out.println("Enter the number for finding the Fibnacci series::");
		num = s.nextInt();
		Question2 f = new Question2();
		f.fibo(num);
	}
}


//-----------OUTPUT-------------

/*
Enter the number for finding the Fibnacci series::
5
The Fibonacci series is::
0 1 1 2 3 5
  
 */
