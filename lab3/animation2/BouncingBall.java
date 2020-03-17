import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BouncingBall implements MoveableShape{
    
    private int x;
    private int y;
    private int speed = 5;
    
    public BouncingBall(int x, int y, int width) {
        this.x = x;
        this.y = y;
    }
	
    public void draw(Graphics2D g2) {
        Shape ellipse = new Ellipse2D.Double(x, y, 10, 10);
        g2.draw(ellipse);
    }

    public void move() {
       y += speed;
       
       if (y % 25 == 0) {
           speed =- speed;
       }
    }
}
