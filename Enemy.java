package minipro;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Enemy {
    private int x, y;
    private int speedx = 2;
    
    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(x, y, 32, 32);
    }
    
    public void update(){
        x+=speedx;
        if(x<0){speedx=8;}
        if(x>605){speedx=-8;}
       
    }
    public Rectangle getBounds(){
        return new Rectangle(x, y, 32, 32);
    }
}
