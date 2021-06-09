import java.awt.*;
import java.awt.event.*;

public class loginform
{
    public static void main(String[] args)
    {
     	 Frame f=new Frame("Login Page");
         f.setVisible(true);
         f.setSize(600,300);
         f.setBackground(Color.yellow);		 
         f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
			} 		 
		 });
		f.setLayout(null); 
		Font s=new Font("Forte",Font.BOLD,20);
		Label l1=new Label("User ID");
		l1.setVisible(true);
		l1.setBounds(110,105,150,50);
		l1.setFont(s);
		f.add(l1);
		
		Label l2=new Label("Password"); 
		l2.setVisible(true);
		l2.setBounds(110,155,110,40);
		l2.setFont(s);
		f.add(l2);
		
		TextField t1=new TextField();
		t1.setVisible(true);
		t1.setBounds(300,110,170,30);
		t1.setFont(s);
		f.add(t1);
		
		TextField t2=new TextField();
		t2.setVisible(true);
		t2.setBounds(300,160,170,30);
		t2.setEchoChar('*');
		t2.setFont(s);
		f.add(t2);
		
		Button b1=new Button("Login");
		b1.setVisible(true);
		b1.setBounds(250,230,100,40);
		b1.setFont(s);
		f.add(b1);
	}
}