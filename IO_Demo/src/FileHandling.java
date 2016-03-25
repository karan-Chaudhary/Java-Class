import java.io.File;

public class FileHandling {
	public static void main(String args[]){
		
		File file=new File("Ram.txt");
		try{
			if(file.createNewFile()){
				System.out.println("Successful");
			}
			else{
				System.out.println("Sorry");
				
			}
		}
		catch(Exception ex){
			
		}
	}

}

