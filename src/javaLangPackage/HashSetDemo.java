package javaLangPackage;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> obj= new HashSet<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(30);
		 
		System.out.println(obj);
		
		System.out.println(obj.size());   // To get the size of the HashSet
		System.out.println(obj.remove(30)); // To remove the specified element
		System.out.println(obj);
		
		// obj.clear();                    // To remove all the elements
		System.out.println(obj);

		
		// for each loop
		for(int k:obj)
		{
			System.out.println(k);
		}
 
	}

}  
