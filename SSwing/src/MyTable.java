import javax.swing.*;  
public class MyTable {   
MyTable(){  
    JFrame f=new JFrame();  
      
    String data[][]={ {"100","Amit","670000"},  
              {"101","Jai","780000"},  
                          {"103","Sachin","700000"},
              {"104","Karan","900000"},
              {"105","Raju","10000000"}};  
    String column[]={"ID","NAME","SALARY"};  
      
    JTable jt=new JTable(data,column);  
    jt.setBounds(30,40,200,300);  
      
    JScrollPane sp=new JScrollPane(jt);  
    f.add(sp);  
      
    f.setSize(300,400);  
    //f.setLayout(null);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyTable();  
}  
}  