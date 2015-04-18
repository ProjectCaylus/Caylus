package fi.jamk.caylus; 

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

/** 
 * 
 * @author Mythe 
 */ 

public class Window extends JFrame {
    
 

    
    /*
    private void initComponents(){
          
        mainpanel = new JPanel();
        bg = new JLabel();
        sq1 = new JLabel();
        sq2 = new JLabel();
        sq3 = new JLabel();
        r2 = new JLabel();
        
        MouseListener m1 = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
                JComponent jc = (JComponent)me.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, me, TransferHandler.COPY);
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        
                
            
        };
        
        bg.setIcon(board);
        bg.setBounds(0, 0, 1920, 1080);
        sq1.setBounds(20, 30, 100, 100);
        sq2.setBounds(250, 30, 50, 50);
        sq3.setBounds(20, 140, 100, 100);
        r2.setBounds(589,248,148,137);
        sq1.setIcon(apina);
        sq2.setIcon(jeps);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainpanel.setLayout(null);
        
        sq1.addMouseListener(m1);
        sq2.addMouseListener(m1);
        sq3.addMouseListener(m1);
        r2.addMouseListener(m1);
        sq1.setTransferHandler(new TransferHandler("icon"));
        sq2.setTransferHandler(new TransferHandler("icon"));
        sq3.setTransferHandler(new TransferHandler("icon"));
        r2.setTransferHandler(new TransferHandler("icon"));
        
        // first added is on the top!
        mainpanel.add(r2);
        mainpanel.add(sq1);
        mainpanel.add(sq2);
        mainpanel.add(sq3);
        mainpanel.add(bg);    
        // last added is on the bottom!
        
        
        add(mainpanel);
        pack();
        
    }
    */
    
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
        game.start();  
}
    
    private JPanel mainpanel;
    private JLabel bg,r1,r2,r3,r4,r5,r6,sq1,sq2,sq3;
    private MouseListener m1;
    
  
    
}

