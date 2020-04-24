package com.picnic.kevin;
import java.util.*; 

public class Question1_LIFO {

	    static void stack_push(Stack<Integer> stack) 
	    { 
	        for (int i = 0; i < 5; i++) { 
	            System.out.println(stack.push(i)); 
	            
	        } 
	    } 
	    static void stack_pop(Stack<Integer> stack) 
	    { 

	        for (int i = 0; i < 5; i++) { 
	            int y = stack.pop(); 
	            System.out.print(y + " "); 
	        } 
	    } 
	    public static void main(String[] args) 
	    { 
	        Stack<Integer> stack = new Stack<Integer>(); 
	        System.out.println("Pushing elements to stack");
	        stack_push(stack); 
	        System.out.println("Poping element from stack");
	        stack_pop(stack); 
	    } 
	} 



//------------OUTPUT----------

/*
 Pushing elements to stack
0
1
2
3
4
Poping element from stack
4 3 2 1 0 
 */


