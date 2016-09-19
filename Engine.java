import java.awt.event.*;
import javax.swing.*;
import java.io.InputStream;
import java.applet.*;
import java.net.*;
public class Engine
{
    public static void main(String[]args)
    {
        final JFrame frame=new JFrame();
        frame.setSize(700,850);
        final GridComponent grid = new GridComponent();
        final SnakeComponent snake = new SnakeComponent();
        final FoodComponent food = new FoodComponent();
        final StatsComponent stats = new StatsComponent();
        final OutcomeComponent lose = new OutcomeComponent(false);
        final OutcomeComponent win = new OutcomeComponent(true);
        frame.add(food);
        frame.setVisible(true);
        frame.add(grid);
        frame.setVisible(true);
        frame.add(snake);
        frame.setVisible(true);
        frame.add(stats);
        frame.setVisible(true);
        class KListener implements KeyListener, ActionListener
        {
            int moveX;
            int moveY;
            public void keyPressed(KeyEvent e)
            {
                moveX=0;
                moveY=0;
                stats.yesStarted();
                if(e.getKeyCode()==KeyEvent.VK_UP) moveY=-25;
                if(e.getKeyCode()==KeyEvent.VK_DOWN) moveY=25;
                if(e.getKeyCode()==KeyEvent.VK_RIGHT) moveX=25;
                if(e.getKeyCode()==KeyEvent.VK_LEFT) moveX=-25;
            }

            public void actionPerformed(ActionEvent e)
            {
                snake.movE(moveX, moveY);
                if(stats.getStarted())
                {
                    stats.moved();
                }
                if(snake.getMyX()>450 || snake.getMyX()<0)
                {
                    moveX=moveX*-1;
                }
                if(snake.checkTail())
                {
                    stats.noStarted();
                    frame.add(lose);
                    frame.setVisible(true);
                }
                if(snake.getMyY()>450 || snake.getMyY()<0)
                {
                    moveY=moveY*-1;
                }
                if((snake.getMyX()==food.getMyX())&&(snake.getMyY()==food.getMyY()))
                {
                    try {
                        AudioClip clip = Applet.newAudioClip(new URL("http://static1.grsites.com/archive/sounds/musical/musical012.wav"));
                        clip.play();
                    } catch (MalformedURLException murle) {
                        System.out.println(murle);
                    }
                    snake.addToTail();
                    stats.addScore();
                    food.movE();
                }
                if((snake.getMyX()==grid.getHoleX())&&(snake.getMyY()==grid.getHoleY()))
                {
                    stats.noStarted();
                    frame.add(lose);
                    frame.setVisible(true);
                }
                if((snake.getLength())==25)
                {
                    stats.noStarted();
                    frame.add(win);
                    frame.setVisible(true);
                }
            }

            public void keyReleased(KeyEvent e){}

            public void keyTyped(KeyEvent e) {}
        }
        KListener key = new KListener();
        frame.addKeyListener(key);
        Timer time = new Timer(100,key);
        time.start();
        frame.setVisible(true);
    }
}