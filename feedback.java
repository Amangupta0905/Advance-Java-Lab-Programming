import java.awt.*;
import java.awt.event.*;
class fdemo extends Frame
{ fdemo()
{ setTitle("Registration Form");
	setLayout(null);
 Font f=new Font("Arial Black",Font.ITALIC,20);
setFont(f);
Label en=new Label("Enter Name");
en.setSize(250,50);
en.setLocation(50,100);
add(en);
TextField tx1=new TextField(10);
tx1.setSize(250,50);
tx1.setLocation(350,100);
add(tx1);

Label g=new Label("Gender");
g.setSize(250,50);
g.setLocation(50,180);
add(g);

CheckboxGroup cbg=new CheckboxGroup();

Checkbox cb1=new Checkbox("Male",true,cbg);
cb1.setSize(100,50);
cb1.setLocation(350,180);
add(cb1);

Checkbox cb2=new Checkbox("FeMale",false,cbg);
cb2.setSize(150,50);
cb2.setLocation(450,180);
add(cb2);


Label ep=new Label("Enter Password");
ep.setSize(250,50);
ep.setLocation(50,250);
add(ep);
TextField tx2=new TextField(10);
tx2.setSize(250,50);
tx2.setLocation(350,250);
tx2.setEchoChar('*');
add(tx2);

Label dob=new Label("Date of Birth");
dob.setSize(250,50);
dob.setLocation(50,330);
add(dob);

Choice li=new Choice();
for(int i=1;i<=31;i++)
    li.add(""+i);
li.setSize(100,50);
li.setLocation(350,330);
add(li);
Choice li2=new Choice();
for(int i=1;i<=12;i++)
    li2.add(""+i);
li2.setSize(100,50);
li2.setLocation(430,330);
add(li2);
Choice li3=new Choice();
for(int i=1990;i<=2030;i++)
    li3.add(""+i);
li3.setSize(100,50);
li3.setLocation(500,330);
add(li3);


Label mn=new Label("Mobile No.");
mn.setSize(250,50);
mn.setLocation(50,400);
add(mn);
TextField tx3=new TextField(10);
tx3.setSize(250,50);
tx3.setLocation(350,400);
add(tx3);

Label e=new Label("Email");
e.setSize(250,50);
e.setLocation(50,470);
add(e);
TextField tx4=new TextField(10);
tx4.setSize(250,50);
tx4.setLocation(350,470);
add(tx4);


Label l=new Label("Language");
l.setSize(250,50);
l.setLocation(50,530);
add(l);

Checkbox cb3=new Checkbox("Hindi");
cb3.setSize(100,50);
cb3.setLocation(350,530);
add(cb3);
Checkbox cb4=new Checkbox("English");
cb4.setSize(120,50);
cb4.setLocation(450,530);
add(cb4);
Checkbox cb5=new Checkbox("Other");
cb5.setSize(100,50);
cb5.setLocation(570,530);
add(cb5);
Label c=new Label("Country");
c.setSize(250,50);
c.setLocation(50,590);
add(c);
Choice li1=new Choice();
li1.add("India");
li1.add("Australia");
li1.add("England");
li1.add("UAE");
li1.setSize(250,50);
li1.setLocation(350,590);
add(li1);

Label a=new Label("Address");
a.setSize(250,50);
a.setLocation(50,650);
add(a);
TextArea ta=new TextArea();
ta.setSize(250,50);
ta.setLocation(350,650);
add(ta);
Button b1 =new Button("Submit");
b1.setSize(100,50);
b1.setLocation(35-0,750);
add(b1);

}

}

class loginformm
{public static void main (String args[])
 {
fdemo f = new fdemo();
  f.setVisible(true);
        f.setSize(1000,900);
        f.setLocation(200,10);
        f.setBackground(Color.blue);
        //f.setForeground(Color.red);
 }
}

