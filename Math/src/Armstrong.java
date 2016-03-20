import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n1= 0,sum=0,rem=0;
		System.out.println("Enter an integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        n1=n;
	while(n1>0)
	{
		rem=n1%10;
		sum+=rem*rem*rem;
		n1/=10;
		
	}
      if(n==sum){
      System.out.println(n+" is a Armstrong no.");
      }
      else{
    	  System.out.println(n+" is not a Armstrong no.");
      }
	}

}
