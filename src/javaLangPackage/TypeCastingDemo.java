package javaLangPackage;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		int i=10;
		double d=i;                //Implicit casting
		
		System.out.println(d);
		
		double d1= 15.9;
		int i1=(int) d1;          //Explicit casting
		
		System.out.println(i1);
		
	}

}
