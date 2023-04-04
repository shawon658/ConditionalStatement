package conditionalConcept;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		ConditionalStatement obj = new ConditionalStatement();
		obj.ifCondition();
		obj.elseCondition();
		obj.ifElseIfCondition();
		obj.nestedIf();
		obj.loopBreak();
		obj.conTinue();
		

	}
	public void ifCondition() {
		int num = 5;
		
		if(num>=1) {
			System.out.println("The number is bigger than 1");
			
		}
		
	}
	
	public  void elseCondition() {
		int age = 10;
		
		if(age>=18) {
			System.out.println("Allowed to enter.");
		}
		else {
			System.out.println("Not allowed or Not Eligible");
		}
	}
	
	public void ifElseIfCondition() {
		 int marks=65;  
	      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
	}
	public void nestedIf() {
		int age = 18;
		String gender = "male";
		
		if(age>=18) {
			if(gender.equals("male")) {
				System.out.println("Allowed to take admission for this program.");
			}else {
				System.out.println("Not male.");
			}
		}else {
			System.out.println("Not adult");
		}
	}
	// break
	public void loopBreak() {
		for (int i = 0; i<10; i++) {
			if(i == 4) {
				break;
			}
			System.out.println(i);
		}
	}
	// continue for this 4 will be skipped.
	public void conTinue() {
		for(int i=0; i<10; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
