import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;


public class radiobutton extends Frame implements ItemListener {
    
    String msg="";
    CheckboxGroup cbg;
    Checkbox y,n;
     public  static void main(String args[])
    {
        radiobutton rb=new radiobutton();
        rb.setSize(450,450);
        rb.setTitle("Radio Button");
        rb.setVisible(true);
    }

     
    radiobutton()
    {
        setLayout(new FlowLayout());
        cbg= new CheckboxGroup();
        y= new Checkbox("Yes",cbg,true);
        n=new Checkbox("No",cbg,false);
        add(y);
        add(n);
        y.addItemListener(this);
        n.addItemListener(this);
         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
   
   
        }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    public void paint(Graphics g)
    {
        msg="Present status:";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,15,120);
    }
     }     