import javax.swing.JOptionPane;

public class DemoSwings {

	public static void main(String[] args) {
		
		
  JOptionPane.showMessageDialog(null,"You are Welcome","Karan World", 0);
  JOptionPane.showInputDialog(null,"Please Enter your name","Input Your Name");
  
  JOptionPane.showInputDialog(null,"Please Enter the name of goods you want to buy","Name");
  
  String x=JOptionPane.showInputDialog(null,"Enter the price of goods you want to purchase","Price");
   double price=Double.parseDouble(x);
   
   String y=JOptionPane.showInputDialog(null,"Enter the number of goods that you had purchased");
   double number=Double.parseDouble(y);
   
   double total=Cash(price,number);
   JOptionPane.showMessageDialog(null,"Congrats the total price="+total);
   
	}

	public static double Cash(double price, double number) {
		double totalrupees=0;
		if(price<=300){
		totalrupees=price*number;
		}
		else{
			double discount=price-300;
			totalrupees=price*number-(price*number)/10;
			
		}
		return totalrupees;
	}

}
