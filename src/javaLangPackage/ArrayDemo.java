package javaLangPackage;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String DC[]= {"Batman","Superman","Flash","Aquaman","Wonder-woman"};
		
		System.out.println(DC.length);
		
		System.out.println(DC[0]);
		
		System.out.println(Arrays.toString(DC)); //1st way to print an Array
		
		// DC[1]="Marvel";   
		
		// System.out.println(Arrays.toString(DC));
		
		for(int i=0; i<5; i++)                   //2nd way to print an Array(for loop)
		{
			System.out.println(DC[i]);
		}
		
		for(String D:DC)                         //3rd way to print an Array(for each loop)
		{
			System.out.println(D);
		}
		
	
	
	}

}
