import javax.swing.*;


public class DemoSwing {


public static void main(String args[]){
	JOptionPane.showMessageDialog(null,"Enter to our WORLD","Name",JOptionPane.INFORMATION_MESSAGE);
	String hour=JOptionPane.showInputDialog(null,"Enter your working hour","Working_hour");
	double Working_hour=Double.parseDouble(hour);
	String hourlyIncome=JOptionPane.showInputDialog(null,"Enter a income you got per hour","Hourly_Income");
	double Hourly_Income=Double.parseDouble(hourlyIncome);
	
	
	 
	double Income=Monthlysalary(Working_hour,Hourly_Income);
	JOptionPane.showMessageDialog(null,"Congrats your total salary is "+Income);
 }


 	public static double Monthlysalary(double Working_hour,double Hourly_Income){
 		double total=0;
 		if(Working_hour<=40){
 		total=Working_hour*Hourly_Income;

 		}
 		else{
 			double Overtime=Working_hour-40;
 			total=Working_hour*40+(1.5*Overtime)*Hourly_Income;
 		}
 		return total;
 	}

 	
	}

