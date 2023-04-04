package mutableAndImmutable;

public class MutableExample {
		
		private String name;
		
		MutableExample(String name){
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
			MutableExample obj = new MutableExample("shawon");
			System.out.println(obj.getName());
			// update the, this object is mutable
			obj.setName("ahmed");
			System.out.println(obj.getName());
		}
}
