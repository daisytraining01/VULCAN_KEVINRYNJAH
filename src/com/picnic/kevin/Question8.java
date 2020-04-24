package com.picnic.kevin;

	public class Question8 {
		int x,y;
		void math()
		{
			System.out.println("Empty");
		}
		int math(int a,int b)
		{	
			int c = a+b;
			System.out.println("Addition = " + c);
			return c;
			
		}
		void math(float a, float b)
		{
			float y=a/b;
			System.out.println("Division = " + y);
		}
		void math(int a,int b,int c)
		{
			int z=a-b-c;
			System.out.println("Subtraction = " + z);
		}

	public static void main(String args[])
	{
		Question8 o = new Question8();
		o.math(20.0f,20.0f);
		o.math(10,5,30);
		o.math();
		o.math(10,5);

	}
}
	
	
	
//-----------------------------------OUTPUT=-------------------
	
/*			Division = 1.0
			Subtraction = -25
			Empty
			Addition = 15	*/
	