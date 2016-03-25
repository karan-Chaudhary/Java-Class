import java.io.*;

public class filedelete {

	public static void main(String[] args) {
		File file=new File("Ram.txt");
		if(file.delete()){
			System.out.println("Okay");
		}
		else{
			System.out.println("Sorry");
		}
	}
	

}
