/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/** 
 * 
 * @author Mythe 
 */ 

public class Board extends JPanel {
    
    static enum GamePhase {
        PHASE1, PHASE2, PHASE3
    }
    
    public GamePhase phase;
    
    public void setPhase(GamePhase sd) {
        this.phase = sd;
    }
    
    public GamePhase getPhase(){
        return phase;
    }
    
    ImageIcon board = new ImageIcon(getClass().getResource("/images/Caylus_board.png"));
    ImageIcon apina = new ImageIcon(getClass().getResource("/images/apina.jpg"));
    ImageIcon jeps = new ImageIcon(getClass().getResource("/images/eihuono.jpg"));
    ImageIcon fill = new ImageIcon(getClass().getResource("/images/fill.png"));
    
    private boolean allow = false;
    

    
    public Board(){
        setLayout(null);
        setBounds(0,0,WIDTH,HEIGHT);
        JLabel bg = new JLabel();
        bg.setIcon(board);
        bg.setBounds(0,0,1920,1080);
        specialgate = new Tile();
        specialgate.setLocation(588,80);
        specialmoney = new Tile();
        specialmoney.setLocation(768,80);
        
        add(specialmoney);
        add(specialgate);
        add(bg);
       
    }
    
    
  
    private Tile specialgate, specialmoney, specialguild, specialfield, specialstables, specialturn,
                 randforest, randmine, randfarm, randlumber, randmarket;
}
