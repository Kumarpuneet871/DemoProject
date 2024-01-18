package oopsPackage;

public class DemoAbstractChild extends DemoAbstract{
	

	public void m1() {
		System.out.println("This is m1");
	}


	public void m2() {
	    System.out.println("This is m2");
	}

	public static void main(String[] args) {
		
		DemoAbstractChild obj= new DemoAbstractChild();
		
		obj.m1();
		obj.m2();
		obj.add(); 
		
	}


}
