
public class Inheritances {

	public static void main(String[] args) {
		 
		Roman a=new Roman();
		Russia b=new Russia();
		Egypt c=new Egypt();
		
		a.getEducation();
		b.getEducation();
		c.getEducation();
	}

}
	class  Roman{
		public void getEducation(){
			System.out.println("I got degree from Rome");
		}
	}
	class Russia extends Roman{
		public void getEducation(){
			super.getEducation();
			System.out.println("I got job in Russia ");
	}
	}
	class Egypt extends Russia{
			public void getEducation(){
				super.getEducation();
				System.out.println("I got a placement in Egypt");
			}
	}
	
	
	