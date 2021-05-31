import java.awt.*;
import java.awt.event.*;
class fdemo extends Frame{}
class Demo
 { 
   public static void main(String args[])
  {
    fdemo f=new fdemo();
	f.setVisible(true);
	f.setSize(400,300);
	f.setLocation(300,100);
	f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent b)
		{
		System.exit(0);
		}
	});
  }	
 }
