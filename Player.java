package minipro;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    private int x;
    private int y;
    Finish f;
    endGame a;
    
    //กำหนดความเร็วการเคลื่อนที่
    private int speedx=0;
    private int speedy=0;
    private LinkedList<Enemy> e = ControlEnemy.getEnemyBounds();   
    
    public static int u = 0;
    public static int score = 1000;
    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void update(){
        x+=speedx;
        y+=speedy;
        
        //การชนขอบจอ
        if(x<0){x=0;}
        if(y<110){y=110; u++;}
        if(x>605){x=605;} 
        if(y>667){y=667;}
        
        collision();
        collision3();
    }
    
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.PINK);
        g2d.fillRect(x, y, 32, 32);
        g2d.draw(getBounds());
    }
    
    public void KeyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=5;
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=-5;
        }
        if(key==KeyEvent.VK_DOWN){
            speedy=5;
        }
        if(key==KeyEvent.VK_UP){
            speedy=-5;
        }
    }
    public void KeyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=0;
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=0;
        }
        if(key==KeyEvent.VK_DOWN){
            speedy=0;
        }
        if(key==KeyEvent.VK_UP){
            speedy=0;
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x, y, 32, 32);
    }
    public void collision(){
        for(int i=0; i<e.size(); i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                score-=10;
                
                if(score<=0){
                    
                    collsion2();
                    a=new endGame();
                }
               
            }
        }
            
    }

    private void collsion2() {
        for(int j=0; j<e.size(); j++){
            e.remove(j);
        }
    }

    private void collision3() {
        f=new Finish();
    }

}
