package com.picnic.kevin;

import java.util.LinkedList; 
import java.util.Queue; 
  
public class Question1_FIFO {
  	
	    public static void main(String[] args) 
	    { 
	    	 Queue<Integer> q = new LinkedList<>(); 
	    	   
	         for (int i = 0; i < 5; i++) 
	             q.add(i); 
	  
	         System.out.println("Elements in queue::" + q); 
	   
	         int r = q.remove(); 
	         System.out.println("Removed element::" + r); 
	   
	         System.out.println(q); 

}
}

//--------------OUTPUT----------

/*

Elements in queue::[0, 1, 2, 3, 4]
Removed element::0
[1, 2, 3, 4]

*/