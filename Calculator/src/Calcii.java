import java.util.Scanner;
		
		public class Calcii {
			public static int add(int a,int b){
				int c=a+b;
				return c;
			}
				public static int sub(int a,int b){
					int c=a-b;
					return c;	
				}
				public static int mul(int a,int b){
					int c=a*b;
					return c;
				}
				public static int div(int a,int b){
					int c=a/b;
					return c;
				}
				public static int mod(int a,int b){
					int c=a%b;
					return c;
				}
			public static void main(String[] args) {
				
				System.out.println("*****Option in my Calculator*****");
				System.out.println("1-->(+)addition(+)");
				System.out.println("2-->(-)subtract(-)");
				System.out.println("3-->(*)multiply(*)");
				System.out.println("4-->(/)divide(/)");
				System.out.println("5-->(%)modulos(%)");
				
				System.out.print("***Give first no.***");
				Scanner in1=new Scanner(System.in);
				int x=in1.nextInt();
				
				System.out.println("***Enter your choice***:->");
				Scanner in3=new Scanner(System.in);
				int c=in3.nextInt();
				
				System.out.print("***Give second no.***");
				Scanner in2=new Scanner(System.in);
				int y=in2.nextInt();
				

				
				
				int z=0;
				switch(c)
				{
				case 1:
				z=add(x,y);
				break;
				
				case 2:
					z=sub(x,y);
						break;
				
				case 3:
					z=mul(x,y);
						break;
				
				case 4:
					z=div(x,y);
						break;
						
				case 5:
					z=mod(x,y);
						break;
				default:
					System.out.println("*****Wrong Choice!!!!******");
					break;
				}
				System.out.println("****Result***-->");
				System.out.println(z);
				
				System.out.println("Press 6 to continue");
				Scanner in=new Scanner(System.in);
				int r=in.nextInt();
				if(r==6)
				{
					String[] s=null;
					main(s);
				}
			}


	}



