
import java.sql.*;

import javax.swing.JOptionPane;
public class Database {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Java_Student","root","");//Java_Student=database name.
							/*YOU can add more password
							 * after Username i.e. root(admin)
							 * into (" ")
							 */
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Student_list"); //Student_list=name of table.
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4));
				
			}
				}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("The related driver was not installed in your device");
			//JOptionPane.showMessageDialog(null, arg1);
		}
		

	}

}