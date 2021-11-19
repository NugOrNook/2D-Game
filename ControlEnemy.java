package minipro;

import java.awt.Graphics2D;
import java.util.LinkedList;

public class ControlEnemy {
    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;
    
    public ControlEnemy(){
        addEnemy(new Enemy(150, 175));
        addEnemy(new Enemy(250, 255));
        addEnemy(new Enemy(350, 335));
        addEnemy(new Enemy(450, 415));
        addEnemy(new Enemy(550, 495));
    }
    //วาดตัวละครหลายๆตัว
    public void draw(Graphics2D g2d){
        for(int i=0; i<e.size(); i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    
    //ให้ตัวละครหลายตัวเคลื่อนที่
    public void update(){
        for(int i=0; i<e.size(); i++){
            temp = e.get(i);
            temp.update();
        }
    }
    
    //เพิ่ม object ลงจอ
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    //ลบ object
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    //พื้นผิว Enemy
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
