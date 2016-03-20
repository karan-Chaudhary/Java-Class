
public class Overridding{

	
	public static void main(String[] args) {
		
		Company a = new Company(); // Company reference and object
		eBay b = new eBay(); // Company reference but eBay object
 
	    a.address();// runs the method in Company class
		b.address();// Runs the method in eBay class
		b.add();
	}
}

class Company {
 
	public void address() {
		System.out.println("This is Address of Amazon Company...");
	}
	public void add() {
		System.out.println("world is amazing");
	}

}
 
class eBay extends Company{
 
	public void address() {
		super.address();
		
		System.out.println("This is eBay's Address...");

	}
	public void add() {
		super.add();
		System.out.println("world is Boring");
	}

}
