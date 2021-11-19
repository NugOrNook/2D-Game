package minipro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class endGame {
    static void draw(Graphics2D g2d) {
        if(Player.score<=0){
            
            g2d.setColor(Color.PINK);
            g2d.fillRect(0, 0, BackG.WIDTH, BackG.HIGHT);
        
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font ("Tahoma",Font.BOLD,48));
            g2d.drawString("Score  0", 215, 350);
        
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font ("Tahoma",Font.BOLD,48));
            g2d.drawString("LOSE", 252, 250);
        }

    }

    
   
}
