import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class OutcomeComponent extends JComponent
{
    String words;
    Rectangle2D.Double comp = new Rectangle2D.Double(0,0,500,500);
    public OutcomeComponent(boolean x)
    {
        if(x)
        {
            words="win!";
        }
        else
        {
            words="lose!";
        }
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        g2.setColor(Color.BLACK);
        g2.draw(comp);
        g2.fill(comp);
        g2.setColor(Color.WHITE);
        Font font = new Font("Dialos",Font.PLAIN, 50);
        g2.drawString("You",100 , 100);
        g2.drawString(words,100 ,200 );
    }
}