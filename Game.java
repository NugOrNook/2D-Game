package minipro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener{
    Timer loop;
    Player player;
    ControlEnemy c;
    
    public static final Color AA = new Color(67,110,238);
    public static final Color BB = new Color(72,118,255);
    public static final Color CC = new Color(28,134,238);
    public static final Color DD = new Color(176,226,255);
    public static final Color EE = new Color(99,184,255);
    public static final Color FF = new Color(135,206,255);
    
    public static final Color II = new Color(127,255,0);
    public static final Color JJ = new Color(118,238,0);
    public static final Color KK = new Color(102,205,0);
    
    
    public Game(){
        loop=new Timer(10,this);
        loop.start();
        player=new Player(300, 640);   
        c=new ControlEnemy();
        addKeyListener(new KeyInput(player));
        setFocusable(true);
        
        
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(0, 150, BackG.WIDTH, 400);
        
        //ท้องฟ้า
        g2d.setColor(AA);
        g2d.fillRect(0, 0, BackG.WIDTH, 25);
        g2d.setColor(BB);
        g2d.fillRect(0, 25, BackG.WIDTH, 25);
        g2d.setColor(CC);
        g2d.fillRect(0, 50, BackG.WIDTH, 25);
        g2d.setColor(DD);
        g2d.fillRect(0, 125, BackG.WIDTH, 25);
        g2d.setColor(EE);
        g2d.fillRect(0, 75, BackG.WIDTH, 25);
        g2d.setColor(FF);
        g2d.fillRect(0, 100, BackG.WIDTH, 25);
        
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 150, BackG.WIDTH, 5);
        
        //พื้นหญ้า
        g2d.setColor(II);
        g2d.fillRect(0, 550, BackG.WIDTH, 35);
        g2d.setColor(JJ);
        g2d.fillRect(0, 585, BackG.WIDTH, 65);
        g2d.setColor(KK);
        g2d.fillRect(0, 650, BackG.WIDTH, 50);
        
        //เส้นกั้นถนน
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 230, BackG.WIDTH, 3);
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 310, BackG.WIDTH, 3);
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 390, BackG.WIDTH, 3);
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 470, BackG.WIDTH, 3);
        
        //เส้นสีเหลือง
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(35, 190, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(165, 190, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(295, 190, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(425, 190, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(555, 190, 50, 8);
        
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(35, 270, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(165, 270, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(295, 270, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(425, 270, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(555, 270, 50, 8);
        
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(35, 350, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(165, 350, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(295, 350, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(425, 350, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(555, 350, 50, 8);
        
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(35, 430, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(165, 430, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(295, 430, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(425, 430, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(555, 430, 50, 8);
        
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(35, 510, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(165, 510, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(295, 510, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(425, 510, 50, 8);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(555, 510, 50, 8);
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(400, 30, 210, 40); 
        
        g2d.setColor(Color.PINK);
        g2d.setFont(new Font ("Tahoma",Font.BOLD,28));
        g2d.drawString("Score  "+Player.score, 425, 60);
        
        
        player.draw(g2d);
        c.draw(g2d);
        if(Player.u>=1){
            Finish.draw(g2d);
        }
        
        endGame.draw(g2d);
        
       
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        player.update();
        c.update();
        repaint();
    }
    
    
}
