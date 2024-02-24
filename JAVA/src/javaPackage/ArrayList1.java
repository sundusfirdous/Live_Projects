package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//Creating ArrayList
		ArrayList<Object> obj = new ArrayList<Object>(); // obj is a reference of arraylist
		
		//Adding Object in ArrayList
		obj.add(1); //add is function
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');	
		obj.add(3 > 12);
	//Print ArrayList Element - 1st way
		System.out.println(obj);
		
		//Print ArrayList Element - 2nd way
		Iterator abc = obj.iterator();//abc is reference of iterator
		                              //Iterator is an object and object is a class that is why Iterator  'I' is capital
		while(abc.hasNext()) //hasNext() i<=5
		{
			System.out.println("while loop : " + abc.next()); //.next  i++
		
			
		}
		
		//Print ArrayList Element - 3rd way
		for (Object bcd : obj) 
		{
			System.out.println("for each loop : " + bcd);
		}
		
		
	
	}

}
