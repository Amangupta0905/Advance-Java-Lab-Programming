import java.awt.*;

class Emogydemo extends Frame{
    Emogydemo(){}

    public void paint(Graphics g){
        Color mustard=new Color(245,169,10);
        g.setColor(mustard);
        g.fillOval(105,105,530,530);

        Color yellow= new Color(253,222,2);
        g.setColor(yellow);
        g.fillOval(120,120,500,500);



        Color red=new Color(237,28,38);
        g.setColor(red);
        g.fillArc(210,230,320,300,180,180);

        Color dcream=new Color(251,237,193);
        g.setColor(dcream);
        g.fillArc(210,310,320,140,180,180); //teeth

        
        g.setColor(yellow);
        g.fillArc(210,340,320,80,180,180);

        Color black= new Color(0,0,0);
        g.setColor(black);
        g.drawArc(210,340,320,80,180,180); //mouth
        g.drawArc(210,230,320,300,180,180);
        g.drawArc(210,310,320,140,180,180);

    
        Color pink = new Color(255,81,135);
         g.setColor(pink);
        g.fillArc(290,480,160,42,180,180);//tongue

            try{Thread.sleep(500);
            }
            catch(Exception e){}
    
               g.setColor(black);
                g.fillOval(260,180,70,130); //eye
                g.fillOval(410,180,70,130); //eye
        
                g.drawArc(285,162,5,20,270,180); //eyelashes
                g.drawArc(295,160,5,20,270,180);
                g.drawArc(305,164,5,20,270,180);
                g.drawArc(435,162,5,20,270,180);
                g.drawArc(445,160,5,20,270,180);
                g.drawArc(455,164,5,20,270,180);
        
                Color cream= new Color(252,241,185);
                g.setColor(cream);
                g.fillOval(280,200,30,30); //eye
                g.fillOval(430,200,30,30); //eye
                
                
         
        
    }
}


public class emojiii{
    public static void main(String ar[]){
        Emogydemo f =new Emogydemo();
        f.setVisible(true);
        f.setSize(740,740);
        f.setLocation(250,0);
        f.setBackground(Color.black);
    }
}