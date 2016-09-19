import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class SnakeComponent extends JComponent
{
    ArrayList<Rectangle2D.Double> snake;
    Rectangle2D.Double start;

    public SnakeComponent()
    {
        snake = new ArrayList<Rectangle2D.Double>();
        start = new Rectangle2D.Double(25,25,20,20);
        snake.add(start);
    }
    
    public boolean checkTail()
    {
        boolean check=false;
        for(int i = 1; i<=snake.size()-1; i++)
        {
            if((snake.get(i).getX()==snake.get(0).getX()) && (snake.get(i).getY()==snake.get(0).getY()))
            {
                check = true;
            }
        }
        return check;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        for(int y = 0; y<=snake.size()-1; y++)
        {
            g2.draw(snake.get(y));
            g2.fill(snake.get(y));
        }
    }

    public void movE(int x, int y)
    {
        for(int i = snake.size()-1; i>0; i--)
        {
            snake.set(i, snake.get(i-1));
        }
        snake.set(0, new Rectangle2D.Double((snake.get(0).getX()+x), (snake.get(0).getY()+y),25,25));
        repaint();
    }

    public void addToTail()
    {
        snake.add(new Rectangle2D.Double((snake.get(snake.size()-1).getX()), (snake.get(snake.size()-1).getY()),25,25));
    }

    public int getMyX()
    {
        int xX = (int)(snake.get(0).getX());
        return xX;
    }

    public int getMyY()
    {
        int yY = (int)(snake.get(0).getY());
        return yY;
    }

    public int getLength()
    {
        return snake.size();
    }
} 