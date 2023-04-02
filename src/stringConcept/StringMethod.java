package stringConcept;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		StringMethod obj = new StringMethod();
		obj.charAt();
		obj.equalsMethod();
		obj.equalsIgnoreCase();
		obj.compareTo();
		obj.comapreToIgnoreCase();
		obj.indexOf();
		obj.intcharIndexOf();
		obj.lastIndex();
		obj.subString();
		obj.expactSubstring();
		obj.conCat();
		obj.isEmpty();
		obj.tream();
		obj.length();
		obj.split();
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
	public void intcharIndexOf() {
		String a = "alexxa";
		System.out.println(a.indexOf('x', 1));
	}
	//last index of
	public void lastIndex() {
		String a = "alaex";
		System.out.println(a.lastIndexOf('a'));
	}
	//sub string method
	public void subString() {
		
		String a = "alex";
		String b = "alaex";
		
		System.out.println(a.substring(2));
		// other substring method
		System.out.println(b.substring(2, 3));
	}
	// verifying expected and actual substring |idex of and substring both are example of method overloading
	public void expactSubstring() {
		
		String name = "My name is Alex";
		String actualName = name.substring(11, 15);
		String expectedName = "Alex";
		
		if(actualName.equals(expectedName)) {
			System.out.println("Name verified..");
		}else {
			System.out.println("Name does not match..");
		}
	}
	//String concat method 
	public void conCat() {
		String name = "Mohamed";
		String name2 = "Shawon";
		
		System.out.println(name+ " "+name2);
		System.out.println(name.concat(name2));
	}
	//String replace method
	public void replaceMethod() {
		String name = "Alex";
		String name2 = name.replace('A', 'Z');
		
		System.out.println(name2);
	}
	//String boolean isEmpty
	public void isEmpty() {
		String userName = "";
		
		if(userName.isEmpty()) {
			System.out.println("Enter a valid username: ");
		}
	}
	//Trim method
	public void tream() {
		String userName = " Alex ";
		System.out.println(userName);
		System.out.println(userName.trim());
	}
	//length method
	public void length() {
		String userName = "Alex";
		int lenght = userName.length();
		System.out.println(lenght);
		
	}
	//Split method
	public void split() {
		
		String sentence ="I am a QA Lead";
		 String[] Words=sentence.split(" ");//After using 
		//split(), now it is an array
		 System.out.println(Arrays.toString(Words));
		 System.out.println("Number of words :"+Words.length);
	}
	

}
