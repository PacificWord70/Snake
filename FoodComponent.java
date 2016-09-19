import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
public class FoodComponent extends JComponent
{
    Ellipse2D.Double food;
    Point2D.Double [ ] nums = new Point2D.Double [20];
    Point2D.Double spot;
    double blah1;
    double blah2;
    int foodgen;
    Random gen;
    BufferedImage cheeseI;
        BufferedImage image = null;

    public FoodComponent()
    {
        gen = new Random();
        foodgen = gen.nextInt(20);
        for(int j =0; j<20; j++)
        {
            int x = 25*gen.nextInt(19);
            int y = 25*gen.nextInt(19);
            if(y==0) y+=25;
            if(x==0) x+=25;
            Point2D.Double i = new Point2D.Double(x,y);
            nums[j] = i;
        }
        spot=nums[foodgen];
        food = new Ellipse2D.Double(spot.getX(), spot.getY(), 25, 25);
        
        try {
            image = ImageIO.read(new URL("http://static.freepik.com/free-photo/cheese-burger-clip-art_427546.jpg"));
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image.getScaledInstance(25, 25, 0), (int)(food.getX()), (int)(food.getY()), null);
    }

    public void movE()
    {
        foodgen = gen.nextInt(20);
        spot=nums[foodgen];
        food.setFrame(spot.getX(),spot.getY(),25,25);
        repaint();
    }

    public int getMyX()
    {
        int xX = (int)(spot.getX());//
        return xX;
    }

    public int getMyY()
    {
        int yY = (int)(spot.getY());//
        return yY;
    }
}