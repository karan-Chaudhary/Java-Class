
public class Ovrriding {

	
	public static void main(String[] args) {
		
		Companies a=new Companies();
		Amazo b=new Amazo();
		
		a.address();
		b.know();
	}	
	}
	class Companies{
		public void address(){
		System.out.println("This is my real estate bussiness");
	}
	}
		class Amazo{
			public void know(){
				System.out.println("It's an eBay Company.....");
			}
		}
	
