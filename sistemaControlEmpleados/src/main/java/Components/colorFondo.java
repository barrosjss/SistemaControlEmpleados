package Components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorFondo extends JPanel {
    
    private Color color1 = Color.decode("#9FD5D1");
    private Color color2 = Color.decode("#367588");
    
    @Override
    public  void paint(Graphics g) {
        super.paint(g);
        
        //this.setBackground(color1);
        
        Graphics2D g2 = (Graphics2D) g;
        
        int w = getWidth();
        int h = getHeight();
        
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2.setPaint(gp);
        g2.fillRect(0, 0, w, h);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        colorFondo mColor = new colorFondo();
        
        frame.add(mColor);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
