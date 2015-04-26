package fi.jamk.caylus; 

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;


/** 
 * 
 * @author Mythe 
 */ 

public class Window extends JFrame {
    
    public Window(Caylus game)
    {
       super("Caylus");
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setMaximumSize(new Dimension(WIDTH, HEIGHT));
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        
        //initComponents();
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        game.start();  
}
    
    public void addPanel(JPanel j, String i){
        cardPanel.add(j,i);
    }
    
  
    private JPanel cardPanel;
    private CardLayout cardLayout;
}

