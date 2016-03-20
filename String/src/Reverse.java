
public class Reverse {

	
	public static void main(String[] args) {
		 String strOriginal = "Hello World";
		    System.out.println("Original String : " + strOriginal);
		   
		    /*
		    The easiest way to reverse a given string is to use reverse()
		    method of java StringBuffer class.
		    reverse() method returns the StringBuffer object so we need to
		    cast it back to String using toString() method of StringBuffer
		    */
		   
		    strOriginal = new StringBuffer(strOriginal).reverse().toString();
		       
		    System.out.println("Reversed String : " + strOriginal);
		  }
		 
		}