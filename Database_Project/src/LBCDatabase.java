import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class LBCDatabase extends JFrame implements ActionListener {
	public JLabel lb0, lb1, lb2, lb3, lb4,lb5;
	public JButton b1, b2,b3,search;
	public JTextField f0, f1, f2, f3, f4, f5;
	public JTextArea area1;
	public JScrollPane sl,sl1;
	Connection con;
	PreparedStatement stmt;
	ResultSet Rs;
	public Container cnt;
	public DefaultTableModel model=new DefaultTableModel();
	public JTable table;

	public LBCDatabase() {
		super("Student Database");   //setTitle
		setVisible(true);			//for visibility
		//setSize(550, 600);
		cnt = getContentPane();   //container
		setContentPane(new JLabel(new ImageIcon("image/LBC.jpg")));//to insert the image in control panal.
		//setSize(549, 599);
		cnt.setLayout(null);    //dispalying area in desktop.
		lb0 = new JLabel("Roll");
		lb0.setForeground(Color.red);   //to set the color of JLabel text
		add(lb0);      //to add  text in Container.
		lb0.setBounds(150, 30, 100, 20);   //to set the position n size of text
		f0 = new JTextField(15);
		f0.setFont(new Font("Times Roman", Font.BOLD, 15));   //to set the size of font inside text field
		add(f0);
		f0.setBounds(240, 30, 100, 20);
		lb1 = new JLabel("Name");
		lb1.setForeground(Color.red);
		add(lb1);
		lb1.setBounds(150, 60, 100, 20);
		f1 = new JTextField(15);
		f1.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f1);
		f1.setBounds(240, 60, 100, 20);
		lb2 = new JLabel("Mobile");
		lb2.setForeground(Color.red);
		add(lb2);
		lb2.setBounds(150, 90, 100, 20);
		f2 = new JTextField(15);
		f2.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f2);
		f2.setBounds(240, 90, 100, 20);
		lb3 = new JLabel("Adress");
		lb3.setForeground(Color.red);
		add(lb3);
		lb3.setBounds(150, 120, 100, 20);
		f3 = new JTextField(15);
		f3.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f3);
		f3.setBounds(240, 120, 100, 20);
		/*lb4 = new JLabel("Address");
		lb4.setForeground(Color.red);
		add(lb4);
		lb4.setBounds(150, 150, 100, 20);
		f4 = new JTextField(15);
		f4.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f4);
		f4.setBounds(240, 150, 100, 20);*/
		b1 = new JButton("Save");
		b1.addActionListener(this);
		add(b1);
		b1.setBounds(15, 180, 100, 20);
		search= new JButton("Search");
		search.addActionListener(this);
		add(search);
		search.setBounds(120, 180, 100, 20);
        /*area1 = new JTextArea(25, 30);
		area1.setFont(new Font("Times Roman", Font.BOLD, 15));
		cnt.add(area1);
		area1.setBounds(50, 220, 400, 300);
		sl = new JScrollPane(area1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sl.setPreferredSize(new Dimension(200, 100));
		sl.setBounds(50, 220, 400, 300);
		cnt.add(sl);*/
		table=new JTable(model);
		table.setBounds(10, 220, 550, 350);
		table.setFont(new Font("Times Roman", Font.BOLD, 15));
		model.addColumn("Roll");
		model.addColumn("Name");
		model.addColumn("Mobile");
		model.addColumn("Adress");
		sl1=new JScrollPane(table);
		sl1.setBounds(10, 220, 550, 350);
		add(sl1);
		b2 = new JButton("View");
		b2.addActionListener(this);
		add(b2);
		b2.setBounds(230, 180, 100, 20);
	
		b3 = new JButton("Delete");
		b3.addActionListener(this);
		add(b3);
		b3.setBounds(340, 180, 100, 20);

		lb5 = new JLabel("By Karan Tech");
		lb5.setForeground(Color.white);
		lb5.setBounds(400, 580,100, 40);
		add(lb5);
		cnt.setBackground(Color.GREEN);
		setLocationRelativeTo(null);
		setSize(580, 610);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new LBCDatabase();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Welcome to LBC DataBase.");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/java_student","root","");
				stmt = con
						.prepareStatement("INSERT INTO student_list(Roll,Name,Mobile,Adress) values (?,?,?,?)");
				String roll = f0.getText();
				int Roll = Integer.parseInt(roll);
				String Name = f1.getText();
				Pattern pt_user=Pattern.compile("[a-zA-Z0-9]{2,}");
				Matcher mt_Name=pt_user.matcher(Name);
				if(mt_Name.matches()){
					JOptionPane.showMessageDialog(null, "valid user");
					String Mobile= f2.getText();
					String Adress= f3.getText();
					stmt.setInt(1,Roll);
					stmt.setString(2,Name);
					stmt.setString(3,Mobile);
					stmt.setString(4,Adress);
					int i = stmt.executeUpdate();
					if (i == 1) {
						JOptionPane
								.showMessageDialog(null, "Recently added data is:"
										+ "\r\nRoll=" + Roll + "  "
										+ "\r\nName=" + Name + "  "
										+ "\r\nMobile=" + Mobile + " " 
										+ " " + "\r\nAdress=" + Adress);

					} else {
						JOptionPane
								.showMessageDialog(null, "Sorry data not added:");
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "not valid user");
				}
				String Mobile = f2.getText();
				String Adress = f3.getText();
				stmt.setInt(1, Roll);
				stmt.setString(2, Name);
				stmt.setString(3, Mobile);
				stmt.setString(4, Adress);
				int i = stmt.executeUpdate();
				if (i == 1) { 
					JOptionPane
							.showMessageDialog(null, "Recently added data is:"
									+ "\r\nRoll=" + Roll + "  "
									+ "\r\nName=" + Name + "  "
									+ "\r\nMobile=" + Mobile + " " 
									+ " " + "\r\nAdress=" + Adress);

				} else {
					JOptionPane
							.showMessageDialog(null, "Sorry data not added:");
				}
				f2.setText("");
				f1.setText("");
				f4.setText("");
				f3.setText("");
				f5.setText("");
				

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}

		} else if (e.getSource() == b2) {
			model.setRowCount(0);
			JOptionPane.showMessageDialog(null, "Welcome to DataBase");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/java_student", "root", "");
				stmt = con.prepareStatement("SELECT *FROM student_list");
				Rs = stmt.executeQuery();
				while (Rs.next()) {
					/*area1.append("\r\n");
					area1.append("     " + "Roll=" + Rs.getInt(1) + "\r\n"
							+ "     " + "Name=" + Rs.getString(2) + "\r\n"
							+ "     " + "Mobile=" + Rs.getString(3) + ""
							+ Rs.getString(4) + "\r\n" + "     " + "Adress=";
					area1.append("\r\n");
					area1.append("\r\n");
					area1.append("*****" + "Next" + "*****");
					area1.append("\r\n");
					area1.append("\r\n");
					JOptionPane.showMessageDialog(null,"ID number="+Rs.getInt(1)+"\r\nUser Name="+Rs.getString(2)+"\r\nName="+Rs.getString(3)+"\r\nAdress="+Rs.getString(4));*/
					model.addRow(new Object[]{Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4)});
					
						
				}
				
			} catch (Exception ex) {
				System.out.println(ex.getMessage());

			}

		}
		else if(e.getSource()==b3){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/java_student","root","");
				stmt=con.prepareStatement("DELETE FROM student_list where Roll=? ") ;
				String roll = f0.getText();
				int Roll = Integer.parseInt(roll);
				stmt.setInt(1, Roll);
				int i=stmt.executeUpdate();
				if(i==1){
					JOptionPane.showMessageDialog(null, "Recently deleted data is:"
							+ "\r\nroll_no=" + Roll);
				       }
				else{
					JOptionPane.showMessageDialog(null, "Data not found");
				}
			}
				catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
              }
		else if(e.getSource()==search){
			JOptionPane.showMessageDialog(null, "Welcome to search zone");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/java_student", "root", "");
				stmt = con.prepareStatement("SELECT *FROM student_list where Roll=?");
				
				String roll=f0.getText();
				int Roll=Integer.parseInt(roll);
				stmt.setInt(1, Roll);
				Rs = stmt.executeQuery();
				while (Rs.next()) {
					JOptionPane.showMessageDialog(null,"Roll="+Rs.getInt(1)+"\r\nName="+Rs.getString(2)+"\r\nMobile="+Rs.getString(3)+"\r\nAdress="+Rs.getString(4));
					
					
				}
			
			
		}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
}
}
}