/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
 * 
 * @author Mythe 
 */ 

public class Board extends JPanel {
    
    ImageIcon board = new ImageIcon(getClass().getResource("/images/Caylus_board.png"));
    ImageIcon apina = new ImageIcon(getClass().getResource("/images/apina.jpg"));
    ImageIcon jeps = new ImageIcon(getClass().getResource("/images/eihuono.jpg"));
    ImageIcon fill = new ImageIcon(getClass().getResource("/images/fill.png"));
    

    
    public Board(){
        
        setLayout(null);
        setBounds(0,0,WIDTH,HEIGHT);
        JLabel bg = new JLabel();
        bg.setIcon(board);
        bg.setBounds(0,0,1920,1080);
        
        
        
        
        JButton bt = new JButton("Paina tästä");
        
        /*
                                bt.setIcon(transparent);
                                bt.setOpaque(false);
                                bt.setContentAreaFilled(false);
                                bt.setBorderPainted(false);
                */
        bt.setBounds(200,200,200,200);
                                
            bt.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    //bg.setVisible(false);
                    //bt.setVisible(false);
                    Maini();
                }
            });
             
       add(bt);
       
       /*
        if(state == GameState){
        
        }else if(state == GameState.MENU) {
            JButton s = new JButton();
            add(s);
            s.setBounds(300,300,300,300);
         }
    */
add(bg);
}
    
    private void Maini(){
        JButton g = new JButton("asd");
        add(g);
        g.setBounds(100,100,100,100);
    }
}
