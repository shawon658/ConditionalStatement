package mutableAndImmutable;

public final class ImmutableExample {
		
	private String name;
	
	ImmutableExample(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	// this setter can modify the name.
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		MutableExample obj = new MutableExample("shawon"); // we will get result but program might crash or out of concept of immutable
		System.out.println(obj.getName());
		obj.setName("ahmed");
		System.out.println(obj.getName());
	}
}
