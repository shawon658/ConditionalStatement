package encapsulation;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.setNumber(100);
		
		System.out.println(a.getNumber());
	}

}
