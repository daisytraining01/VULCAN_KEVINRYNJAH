package com.picnic.kevin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question7 {
	   public static void main(String[] argv) {
	      List<String>list1 = new ArrayList<String>();
	      list1.add("TestVal1");
	      list1.add("TestVal2");
	      list1.add("TestVal1");
	      list1.add("TestVal2");
	      list1.add("TestVal2");
	      list1.add("TestVal3");
	      list1.add("TestVal3");
	      
	      HashSet<String>set = new HashSet<String>(list1);
	      List<String>list2 = new ArrayList<String>(set);
	      System.out.println("List after removing duplicate elements:");
	      for (Object ob: list2)
	         System.out.println(ob);
	   }
}

//--------------------OUTPUT-----------

/*
 
List after removing duplicate elements:
TestVal1
TestVal2
TestVal3
*/