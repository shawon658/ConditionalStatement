package stringConcept;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		AutoboxingUnboxing obj = new AutoboxingUnboxing();
		obj.boxing();
		obj.unboxing();
		obj.AnotherWay();

	}
	public void boxing() {
		int a = 50;
		//Wrapper class
		Integer a1 = new Integer(a); //Boxing  creating objet of integer
		Integer a2 = 5;
		System.out.println(a1+ " "+a2);
	}
	public void unboxing() {
		
		Integer a1 = new Integer(50);
		
		  int x =a1;// Unboxing and storing to x
		  
		  System.out.println(x);
	}
	// Another way to do wrapper class conversion
	public void AnotherWay() {
		int a = 10;
		
		Integer i = Integer.valueOf(a);
		System.out.println(i);
	}

}
