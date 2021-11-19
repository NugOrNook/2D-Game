package minipro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Finish {
    static void draw(Graphics2D g2d) {
        if(Player.u>=1){
        g2d.setColor(Color.CYAN);
        g2d.fillRect(0, 0, BackG.WIDTH, BackG.HIGHT);
        
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font ("Tahoma",Font.BOLD,48));
        g2d.drawString("Score  "+Player.score, 190, 350);
        
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font ("Tahoma",Font.BOLD,48));
        g2d.drawString("WIN", 258, 250);
        }
    }
}
