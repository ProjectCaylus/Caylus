package fi.jamk.caylus; 

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/** 
 * 
 * @author Mythe 
 */ 

public class Window extends Canvas {
    
      JFrame frame = new JFrame("Caylus");
      JLayeredPane boardi = new JLayeredPane();
      JPanel panel = new JPanel();
      JPanel pan = new JPanel();
      JPanel d = new JPanel();
    ImageIcon board = new ImageIcon("C:\\Users\\Mythe\\Documents\\NetBeansProjects\\Caylus\\Caylus_board.png");
    ImageIcon apina = new ImageIcon("C:\\Users\\Mythe\\Documents\\NetBeansProjects\\Caylus\\apina.jpg");
    
    
    public Window(int width, int height, String title, Caylus game)
    {
      
        frame.add(boardi);
        boardi.add(panel, new Integer(1));
        frame.add(pan);
        frame.add(d);
        frame.add(panel);
        panel.setBounds(0,0,1920,1080);

        
      
        // public Spot(JLabel p, int x, int y, int w, int h){
        //asd.getImage().flush();
        
        Spot b = new Spot();
        b.setIcon(board);
        panel.add(b);
        b.setBounds(0,0,100,100);
        
        pan.setBounds(100, 100, 100, 100);
        Spot a = new Spot();
        a.setIcon(apina);
        pan.add(a);
        
       
       
     
       
        d.setBounds(500,200,300,300);
        Spot c = new Spot();
        d.add(c);
        c.setIcon(apina);
        
        game.setPreferredSize(new Dimension(width,height));
        game.setMaximumSize(new Dimension(width,height));
        game.setMinimumSize(new Dimension(width,height));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null); 
        frame.add(game);
        frame.pack();
        frame.setVisible(true);
          
        game.start();   
    }
    
    public void addPanel(int x,int y,int w, int h){
       JPanel j = new JPanel(); // uusi paneeli
       panel.add(j, new Integer(2)); // JLayered panell +j paneeli
       Spot g = new Spot();  // uusi spotti
       j.setBounds(x,y,w,h); // j paneelin rajat
       j.add(g);  // j.lisää(spotti)
       g.setIcon(apina); // spotille asetetaan kuva
    }
}
