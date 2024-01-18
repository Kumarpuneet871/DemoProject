package javaLangPackage;

public class StringOperations {

	public static void main(String[] args) {
		
		String name="Puneet";
		
		String name1="PUNEET";
		
		System.out.println(name.length());
		System.out.println(name.charAt(5 ));
		System.out.println(name.concat(" is supreme"));
		
		
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.substring(2));
        System.out.println(name.startsWith("Pun"));
        System.out.println(name.endsWith("eet"));
        System.out.println(name.trim());
        System.out.println(name.replace('t', 'f'));
		
	}

}