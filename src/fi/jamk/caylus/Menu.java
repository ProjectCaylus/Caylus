/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
 * 
 * @author Mythe 
 */ 

public class Menu extends JPanel{
    
    private final ImageIcon medieval = new ImageIcon(getClass().getResource("/images/medieval.png"));
    private final ImageIcon medievalplayers = new ImageIcon(getClass().getResource("/images/medievalplayers.png"));
    private JButton play, help, quit, two, three, four, five, mainmenu;
    private JLabel bg;
    private final int twoplayers = 2, threeplayers = 3, fourplayers = 4, fiveplayers = 5;
    private int playerAmount;
    private boolean done = false;
    
    public Menu(){
        setLayout(null);
        setBounds(0,0,WIDTH,HEIGHT);
        bg = new JLabel();
        bg.setBounds(0,0,1920,1080);
        menuComponentInit();
        mainMenu();
    }
    
    private void menuComponentInit(){
        play = new JButton();
        play.setBounds(390, 300, 319, 140);
        play.setContentAreaFilled(false);
        play.setBorderPainted(false);
        play.addActionListener(new playPress());
        
        help = new JButton();
        help.setBounds(390, 479, 319, 140);
        help.setContentAreaFilled(false);
        help.setBorderPainted(false);
        
        quit = new JButton();
        quit.setBounds(390, 642, 319, 140);
        quit.setContentAreaFilled(false);
        quit.setBorderPainted(false);
        quit.addActionListener(new quitPress());
    }
    
    private void mainMenu(){
        play.setVisible(true);
        help.setVisible(true);
        quit.setVisible(true);
        bg.setIcon(medieval);
        
        add(help);
        add(quit);
        add(play);
        add(bg);
    }
    
    private void playerMenu(){
        play.setVisible(false);
        help.setVisible(false);
        quit.setVisible(false);
        
        bg.setIcon(medievalplayers);
        
        two = new JButton();
        two.setBounds(379, 359, 343, 100);
        two.setContentAreaFilled(false);
        two.setBorderPainted(false);
        two.addActionListener(new playerAmountPress());
        
        three = new JButton();
        three.setBounds(379, 472, 343, 100);
        three.setContentAreaFilled(false);
        three.setBorderPainted(false);
        three.addActionListener(new playerAmountPress());
        
        four = new JButton();
        four.setBounds(379, 584, 343, 100);
        four.setContentAreaFilled(false);
        four.setBorderPainted(false);
        four.addActionListener(new playerAmountPress());
        
        five = new JButton();
        five.setBounds(379, 697, 343, 100);
        five.setContentAreaFilled(false);
        five.setBorderPainted(false);
        five.addActionListener(new playerAmountPress());
        
        mainmenu = new JButton();
        mainmenu.setBounds(379, 847, 341, 72);
        mainmenu.setContentAreaFilled(false);
        mainmenu.setBorderPainted(false);
        mainmenu.addActionListener(new mainmenuPress());
        
        add(two);
        add(three);
        add(four);
        add(five);
        add(mainmenu);
    }
    
    private class playPress implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        playerMenu();
        
    }
}
    
    private class mainmenuPress implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        five.setVisible(false);
        mainMenu();
    }
}
    
    private class quitPress implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}  
    
        private class playerAmountPress implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if(src == two){
            setPlayerAmount(twoplayers);
            setDone(true);
        }
        else if (src == three){
            setPlayerAmount(threeplayers);
            setDone(true);
        }
        else if (src == four){
            setPlayerAmount(fourplayers);
            setDone(true);
        }
        else if (src == five){
            setPlayerAmount(fiveplayers);
            setDone(true);
        }
      }
    }

    public int getPlayerAmount() {
        return playerAmount;
    }

    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
    
        
        
}
