import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JSubmenu extends JFrame{

	
		public Container cnt;
		public JMenuBar mb;
		public JMenu file,edit;
		public JMenuItem fileNew,fileOpen,subOpenDoc,fileExit;
		JSubmenu subOpenWeb;	
		
		
		public JSubmenu(){
		setTitle("Demo Submenu");
			mb=new JMenuBar();
			setJMenuBar(mb);
			file=new JMenu("File");
			edit=new JMenu("Edit");
			mb.add(file);
			mb.add(edit);
			fileNew=new JMenuItem("New");
		    fileOpen=new JMenuItem("Open");
		    fileExit=new JMenuItem("Exit");
		    file.add(fileNew);
		    file.addSeparator();
		    file.add(fileOpen);
		    file.add(fileExit);
		    subOpenWeb=new JSubmenu();
		    subOpenDoc=new JMenuItem("Open Doc");
		    fileOpen.add(subOpenWeb);
		    fileOpen.add(subOpenDoc);
		    setSize(600,200);
		    setVisible(true);
		    setLocationRelativeTo(null);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String args[]){
			new JSubmenu();
			}
		
			}
	
