import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class GridComponent extends JComponent
{
    Line2D.Double startVline1 = new Line2D.Double(25,0,25,500);
    Line2D.Double startHline1 = new Line2D.Double(0,25,500,25);
    Random generator = new Random();
    int x = 25*generator.nextInt(20);
    int y = 25*generator.nextInt(20);
    Ellipse2D.Double hole = new Ellipse2D.Double(x,y,25,25);
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        Line2D.Double vline = new Line2D.Double(0,0,0,500);
        Line2D.Double hline = new Line2D.Double(500,0,0,0);
        Line2D.Double vline1 = new Line2D.Double(25,0,25,500);
        Line2D.Double hline1 =new Line2D.Double(0,25,500,25);
        Line2D.Double vline2 = new Line2D.Double(50,0,50,500);
        Line2D.Double hline2 =new Line2D.Double(0,50,500,50);
        Line2D.Double vline3 =new Line2D.Double(75,0,75,500);
        Line2D.Double hline3 =new Line2D.Double(0,75,500,75);
        Line2D.Double vline4 =new Line2D.Double(100,0,100,500);
        Line2D.Double hline4 =new Line2D.Double(0,100,500,100);
        Line2D.Double vline5 =new Line2D.Double(125,0,125,500);
        Line2D.Double hline5 =new Line2D.Double(0,125,500,125);
        Line2D.Double vline6 =new Line2D.Double(150,0,150,500);
        Line2D.Double hline6 =new Line2D.Double(0,150,500,150);
        Line2D.Double vline7 =new Line2D.Double(175,0,175,500);
        Line2D.Double hline7 =new Line2D.Double(0,175,500,175);
        Line2D.Double vline8 =new Line2D.Double(200,0,200,500);
        Line2D.Double hline8 =new Line2D.Double(0,200,500,200);
        Line2D.Double vline9 =new Line2D.Double(225,0,225,500);
        Line2D.Double hline9 =new Line2D.Double(0,225,500,225);
        Line2D.Double vline10 =new Line2D.Double(250,0,250,500);//
        Line2D.Double hline10 =new Line2D.Double(0,275,500,275);//
        Line2D.Double vline11 =new Line2D.Double(300,0,300,500);
        Line2D.Double hline11 =new Line2D.Double(0,300,500,300);
        Line2D.Double vline12 =new Line2D.Double(325,0,325,500);
        Line2D.Double hline12 =new Line2D.Double(0,325,500,325);
        Line2D.Double vline13 =new Line2D.Double(350,0,350,500);
        Line2D.Double hline13 =new Line2D.Double(0,350,500,350);
        Line2D.Double vline14 =new Line2D.Double(375,0,375,500);
        Line2D.Double hline14 =new Line2D.Double(0,375,500,375);
        Line2D.Double vline15 =new Line2D.Double(400,0,400,500);
        Line2D.Double hline15 =new Line2D.Double(0,400,500,400);
        Line2D.Double vline16 =new Line2D.Double(425,0,425,500);
        Line2D.Double hline16 =new Line2D.Double(0,425,500,425);
        Line2D.Double vline17 =new Line2D.Double(450,0,450,500);
        Line2D.Double hline17 =new Line2D.Double(0,450,500,450);
        Line2D.Double vline18 =new Line2D.Double(475,0,475,500);
        Line2D.Double hline18=new Line2D.Double(0,475,500,475);
        Line2D.Double vline19 =new Line2D.Double(500,0,500,500);
        Line2D.Double hline19 =new Line2D.Double(0,500,500,500);
        Line2D.Double vline20 =new Line2D.Double(275,0,275,500);//
        Line2D.Double hline20 =new Line2D.Double(0,250,500,250);//
        
        g2.draw(startVline1);
        g2.draw(startHline1);
        
        g2.draw(hole);
        g2.fill(hole);
        
        g2.draw(vline);
        g2.draw(vline1);
        g2.draw(vline2);
        g2.draw(vline3);
        g2.draw(vline4);
        g2.draw(vline5);
        g2.draw(vline6);
        g2.draw(vline7);
        g2.draw(vline8);
        g2.draw(vline9);
        g2.draw(vline10);
        g2.draw(vline11);
        g2.draw(vline12);
        g2.draw(vline13);
        g2.draw(vline14);
        g2.draw(vline15);
        g2.draw(vline16);
        g2.draw(vline17);
        g2.draw(vline18);
        g2.draw(vline19);
        g2.draw(vline20);

        g2.draw(hline);
        g2.draw(hline1);
        g2.draw(hline2);
        g2.draw(hline3);
        g2.draw(hline4);
        g2.draw(hline5);
        g2.draw(hline6);
        g2.draw(hline7);
        g2.draw(hline8);
        g2.draw(hline9);
        g2.draw(hline10);
        g2.draw(hline11);
        g2.draw(hline12);
        g2.draw(hline13);
        g2.draw(hline14);
        g2.draw(hline15);
        g2.draw(hline16);
        g2.draw(hline17);
        g2.draw(hline18);
        g2.draw(hline19);
        g2.draw(hline20);
    }
    
    public int getHoleX()
    {
        return Math.round((int)hole.getX());
    }
    
    public int getHoleY()
    {
        return Math.round((int)hole.getY());
    }
}