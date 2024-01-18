package oopsPackage;

public class Constructor {
	
	public Constructor( int x)
	{
		System.out.println("I am a constructor");
	}
	
	public Constructor(String s)
	{
		System.out.println("Are you a constructor?");
	}

	public static void main(String[] args) {
		
		Constructor obj=new Constructor(10);
		Constructor obj1=new Constructor("hell");
	}

}
