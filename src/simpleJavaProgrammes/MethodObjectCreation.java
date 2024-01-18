package simpleJavaProgrammes;

public class MethodObjectCreation {
	
	public void add()                              //Method creation/declaration
	{System.out.println(10+20);}
	
	public void login()
	{System.out.println("Code to login functionality");}

	public static void main(String[] args) {
		
		MethodObjectCreation obj=new MethodObjectCreation ();  //Object creation 
		obj.add();                                             //Method called using object ref

		obj.login();
	}

}