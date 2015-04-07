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
    
    JPanel paneeli;
    
      JFrame frame = new JFrame("Caylus");
      JLayeredPane boardi = new JLayeredPane();
      JPanel special1 = new JPanel();
      JPanel panel = new JPanel();
      JPanel pan = new JPanel();
      JPanel d = new JPanel();
      ImageIcon board = new ImageIcon(getClass().getResource("/images/Caylus_board.png"));
    ImageIcon apina = new ImageIcon(getClass().getResource("/images/apina.jpg"));
    ImageIcon jeps = new ImageIcon(getClass().getResource("/images/eihuono.jpg"));
    
    
    public Window(int width, int height, String title, Caylus game)
    {
      
        
        frame.add(pan);
        frame.add(special1);
        frame.add(d);
        frame.add(panel);
        panel.setBounds(0,0,1920,1080);

        
      
        // public Spot(JLabel p, int x, int y, int w, int h){
        //asd.getImage().flush();
        
        
        //b.setBounds(0,0,0,0);
        
         Spot b = new Spot();
        b.setIcon(board);
        panel.add(b);
        
        pan.setBounds(100, 100, 100, 100);
        Spot a = new Spot();
        a.setIcon(apina);
        pan.add(a);
        
        Spot e = new Spot();
        e.setIcon(apina);
        special1.add(e);
        special1.setBounds(500,500,500,500);
       
       
     
       
        d.setBounds(500,200,300,300);
        Spot c = new Spot();
        d.add(c);
        c.setIcon(jeps);
       
        
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
       frame.add(j);
       j.setBounds(x,y,w,h);
       Spot g = new Spot();  // uusi spotti
       j.add(g);  // j.lisää(spotti)
       g.setIcon(apina); // spotille asetetaan kuva
    }
}
