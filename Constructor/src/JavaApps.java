
public class JavaApps {

	
	public static void main(String[] args) {
		youtube you=new youtube();
		new youtube("Karan Zais");
		/*we can also use new object name 
		 * i.e youtube you2=new youtube(String)
		 */
		
		
	}

}
class youtube{
	public youtube(){
		System.out.println("Hello Nepal");
	}
		public youtube(String name){
		System.out.println("Hello"+name);
		}
	}
