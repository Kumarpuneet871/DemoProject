package oopsPackage;

public class MethodOverloading {
	
	public void add()
	{
		System.out.println("No arg method");
	}
	
	public void add(int x)
	{
		System.out.println("Int arg method");
	}
	
	public void add(String s)
	{
		System.out.println("String arg method");
	}

	public static void main(String[] args) {
		
		MethodOverloading m= new MethodOverloading();
		
		m.add();
		m.add(0);
		m.add(null);
		m.add('z');
		
	}

}
