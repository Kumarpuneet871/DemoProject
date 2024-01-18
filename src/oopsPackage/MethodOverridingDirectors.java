package oopsPackage;

public class MethodOverridingDirectors extends MethodOverriding {
	
	public void ZackSnyder()
	{
		System.out.println("Justice league");
	}
	
	public void QuentinTarantino()
	{
		System.out.println("Pulp Fiction");
	}

	public static void main(String[] args) {
		
		MethodOverridingDirectors films= new MethodOverridingDirectors();
		
		films.ZackSnyder();
		films.QuentinTarantino();
	}

}
