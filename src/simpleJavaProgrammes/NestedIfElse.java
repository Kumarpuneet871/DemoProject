package simpleJavaProgrammes;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int mark=69;
		
		if(mark>=75)
		{System.out.println("Distinction");}
		
		else if(mark>=60 && mark<75)
		{System.out.println("First class");}

		else if(mark>=50 && mark<60)
		{System.out.println("Second class");}
		
		else if(mark>=35 && mark<50)
		{System.out.println("First Class");}
		
		else
		{System.out.println("Failed");}
	}

}
