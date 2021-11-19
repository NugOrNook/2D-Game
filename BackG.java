package minipro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BackG{
    public static final int WIDTH = 640;
    public static final int HIGHT = 700;
    
    
    public static void main (String[] args)throws Exception {
        JFrame jf = new JFrame();
        jf.setTitle("2D GAME : CROSS THE ROAD");
        jf.setSize(WIDTH+10, HIGHT+36);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null); 
        jf.setTitle("2D GAME : CROSS THE ROAD");   
        
        jf.add(new Game());
        jf.setVisible(true);
    
    }
    
    
    
}
  

