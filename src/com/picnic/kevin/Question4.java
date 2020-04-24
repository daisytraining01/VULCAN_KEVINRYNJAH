package com.picnic.kevin;

public class Question4
{

	private int length;
	private int breadth;
	
	public int getLength(){  
		return length;  
		} 
	
	public int getBreadth(){  
		return breadth;  
		}
	
	public void getLength(int length){  
		this.length=length;
		}
	public void getBreadth(int breadth){  
		this.breadth=breadth;
		}  
	
	int height = 10;
	
	Question4(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	Question4()
	{
		System.out.println("Empty Constructor");
	}
	int mul()
	{
		return length*breadth;
	}

	public void area(int length2, int breadth2, int height2) {
		
		int area = length2*breadth2*height2;
		System.out.println("Area:: " + area);
	
	}
}