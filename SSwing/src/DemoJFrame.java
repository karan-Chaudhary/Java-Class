import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoJFrame extends JFrame {
	public JLabel lb1,lb2;
	public JButton jb1,jb2,jb3;
	public DemoJFrame(){
		setTitle("My First Apps");
		setSize(500,300);
		setVisible(true);
		setResizable(false);
		setLayout(new FlowLayout());
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb1=new JLabel("Welcome");
		add(lb1);
		jb1=new JButton("1");
		add(jb1);
		jb2=new JButton("2");
		add(jb2);
		jb3=new JButton("3");
		add(jb3);
		lb2=new JLabel("My name is Karan");
		add(lb2);
		
		
		
	}

	public static void main(String[] args) {
		new DemoJFrame();
	}

}
