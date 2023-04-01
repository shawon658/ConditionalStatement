package stringConcept;

public class StringMethod {

	public static void main(String[] args) {
		StringMethod obj = new StringMethod();
		obj.charAt();
		obj.equalsMethod();
		obj.equalsIgnoreCase();
		obj.compareTo();
		obj.comapreToIgnoreCase();
		obj.indexOf();
	}
	
	// Char CharAt(int Index);
	
	public void charAt() {
		
		String a = "shawon@gmail.com";
		
		char expected = '@';
		char actual = a.charAt(6);
		
		if(expected == actual) {
			
			System.out.println("Working as expected.");
			
		}else {
			System.out.println("Actual char is different.");
		}
	}
	
	//boolean equals--
	public void equalsMethod() {
		String a = "Hello";
		String b = "Hello";
		
		if(a.equals(b)) {
			System.out.println("Both value matched.");
		}else {
			System.out.println("Both value are not same as expected.");
		}
	}
	
	// equals ignore case method
	
	public void equalsIgnoreCase() {
		
		String a = "shawon";
		
		if(a.equalsIgnoreCase("Shawon")) {
			System.out.println("shawon matched even though Capital S.");
		}
		
	}
	// int compare to method
	
	public void compareTo() {
		
		String str1 = "String method tutorial";
		String str2 = "ComapreTo method example";
		String str3 = "String method tutorial";
		
		int var1 = str1.compareTo(str2);
		System.out.println("str1 and str2 comparison: "+var1);
		
		int var2 = str1.compareTo(str3);
		System.out.println("str1 and str3 comparison: "+var2);
		
		int var3 = str2.compareTo("ComapreTo method example");
		System.out.println("str2 and string argument comparision: "+var3);
	}
	// int compare to ignore case method
	public void comapreToIgnoreCase() {
		String str1 = "HELLO";
		String str2 = "hello";
		String str3 ="HellO";
		
		int var1 = str1.compareToIgnoreCase(str2);
		System.out.println("Str1 and str2 comparision: "+var1);
		
		int var2 = str1.compareToIgnoreCase(str3);
		
	}
	//int indexof single char method
	public void indexOf() {
		String a = "Hello";
		System.out.println(a.indexOf("o"));
	}
	//int and char indexOf method
	

}
