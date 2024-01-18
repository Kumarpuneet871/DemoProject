package javaLangPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(10);                   // To add elements in Array-list
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(30);
		
		System.out.println(num);
		
		System.out.println(num.size()); // To calculate length
		
		System.out.println(num.get(0)); // To get the element at nth index
		
		num.remove(0) ;                 // To remove the nth element 
		System.out.println(num);
		
		num.add(0, 10);                 // To add an element at a specific index
		System.out.println(num);
		
		num.set(3, 99);                  // To replace the nth element
		System.out.println(num);
		
		System.out.println(num.contains(99));             // Verifies if the Array list contains a specific element
		
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}

	}

}
