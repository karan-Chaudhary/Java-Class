import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JSubmenu extends JFrame{

	
		public Container cnt;
		public JMenuBar mb;
		public JMenu file,edit;
		public JMenuItem submenu,fileNew,fileOpen,subOpenWeb,subOpenDoc,fileExit,submenu1;	
		
		
		public JSubmenu(){
		setTitle("Demo Submenu");
			mb=new JMenuBar();
			setJMenuBar(mb);
			file=new JMenu("File");
			edit=new JMenu("Edit");
			mb.add(file);
			mb.add(edit);
			
			submenu=new JMenu("Sub Menu");
			submenu1=new JMenu("Sub Menu2");
		    fileOpen=new JMenuItem("Open");
		    fileExit=new JMenuItem("Exit");
		    submenu.add(fileOpen);
		    submenu.add(fileExit);
		    submenu1.add(fileOpen);
		    file.add(submenu1);
		    subOpenWeb=new JMenuItem("Open Web");
		    subOpenDoc=new JMenuItem("Open Doc");
		    submenu.add(subOpenDoc);
		    file.add(submenu);
		   
		    setSize(600,200);
		    setVisible(true);
		    setLocationRelativeTo(null);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String args[]){
			new JSubmenu();
			}
		
			}
	
