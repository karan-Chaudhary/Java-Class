import javax.swing.JOptionPane;

public class Swing1Demo {

	public static void main(String[] args) {
		
		
	JOptionPane.showMessageDialog(null,"You are Welcome to our Department store","MK Department Store",0);
	JOptionPane.showInputDialog(null,"Enter the name of goods u want to buy");
	String goods=JOptionPane.showInputDialog(null,"Enter the price of goods");
	double price=Double.parseDouble(goods);
	String number=JOptionPane.showInputDialog(null,"Enter the number of goods");
	double value=Double.parseDouble(number);
	
	double x=Costs(price,value);
	JOptionPane.showMessageDialog(null,"The Total cost of goods is"+x);
	
	}
 public static double Costs(double price,double value){
	 double rupees=0;
	 if(value<=10){
		 rupees=price*value;
		 
	 }
	 else{
		double extra=value-10;
		 rupees=price*value-(price*value)/10;
	 }
	 return rupees;
 }
}
