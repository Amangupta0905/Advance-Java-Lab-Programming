import  java.awt.*;
import java.awt.event.*;
public class mylist extends Frame implements ItemListener{	
	String msg="";
	List alist;
	Panel apanel;
	Label alabel;
	mylist(){
		setLayout(new FlowLayout());
	     alabel=new Label("Language");
		alabel.setAlignment(Label.CENTER);
	    alist=new List();
		alist.add("c");
		alist.add("c++");
		alist.add("java");
		alist.add("python");
		
		alist.addItemListener(this);
		apanel=new Panel();
		add(apanel);
		apanel.add(alabel);
		apanel.add(alist);
		apanel.setBackground(Color.yellow);
		
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
		
	}
	public void paint(Graphics g) {
		
	g.drawString("Selected Language:", 25, 140);
	msg=alist.getSelectedItem();
	g.drawString(msg, 40,160);
	}
public static void main(String[] args) {
	mylist f=new mylist();
	f.setSize(500,500);
	f.setTitle("List");
	f.setVisible(true);
	f.addWindowListener(new exit1());
	
}
}
class exit1 extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}