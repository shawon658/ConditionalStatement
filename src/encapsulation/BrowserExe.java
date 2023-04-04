package encapsulation;

public class BrowserExe {
	public static void main(String[] args) {
		
		BrowserSetup setup = new BrowserSetup();
		setup.setBrowser("chrome");
		
		if(setup.getBrowser().equals("chrome")) {
			System.out.println("The browser is: " + setup.getBrowser());
		}else {
			System.out.println("Invalid browser.");
		}
	}

}
