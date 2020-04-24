package com.picnic.kevin;

public class Question4MainClass extends Question4 {

	public static void main(String args[])
	{
		Question4 a = new Question4();
		Question4 a2 = new Question4(5,2);
		a.area(a.getLength(),a.getBreadth(),a.height);
		int x = a2.mul();
		System.out.println("Area of a Rectangle:: " + x);
	}
}


//-------OUTPUT-----

/*
Empty Constructor 
Area:: 0
Area of a Rectangle:: 10
*/