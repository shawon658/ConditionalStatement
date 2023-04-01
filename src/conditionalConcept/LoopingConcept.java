package conditionalConcept;

public class LoopingConcept {

	public static void main(String[] args) {
		LoopingConcept obj = new LoopingConcept();
		obj.forLoop();
		obj.forLoopDsc();
		obj.whileLoop();
		obj.doWhileLoop();

	}
	//** for and while loop if particlar program does not match it will not execute. 
	// Ascending
	public void forLoop() {
		//Initialization, condition, incr/dcrment.
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	//Descending
	public void forLoopDsc() {
		for(int i=100; i>0; i--) {
			System.out.println(i);
		}
	}
	
	// While Looping
	public void whileLoop() {
		int i=1;
		while(i>11) {
			System.out.println(i);
			i++;
		}
	}
	// Do while loop also it will execute atlest one time even condition does not match.
	public void doWhileLoop() {
		int i=1;
		do {
			System.out.println(i);
			
		}while(i<11);
	}

}
