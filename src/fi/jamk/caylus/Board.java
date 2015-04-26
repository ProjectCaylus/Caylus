/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
 * 
 * @author Mythe 
 */ 

public class Board extends JPanel {
    
    public static enum GamePhase {
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
        try{
        Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/res/MorrisRoman.ttf"));
        turn = new JLabel("Player " + getPlayerTurn() +"s turn");
        turn.setBounds(600,30,600,30);
        turn.setFont(font.deriveFont(Font.BOLD, 24f));
        
        player1info = new JLabel();
        player1info.setBounds(1530, 430, 350, 75);
        player1info.setForeground(Color.green);
        player2info = new JLabel();
        player2info.setBounds(1530, 480, 350, 75);
        player2info.setForeground(Color.red);
        player3info = new JLabel();
        player3info.setBounds(1530, 530, 350, 75);
        player3info.setForeground(Color.yellow);
        player4info = new JLabel();
        player4info.setBounds(1530, 580, 350, 75);
        player4info.setForeground(Color.blue);
        player5info = new JLabel();
        player5info.setBounds(1530, 630, 350, 75);
        player5info.setForeground(Color.cyan);
        
        randwood = new Tile();
        randwood.setLocation(767,247);
        
        
        //specialgate = new Tile();
        //specialgate.setLocation(588,80);
        //specialmoney = new Tile();
        //specialmoney.setLocation(768,80);
        
        add(player1info);
        add(player2info);
        add(player3info);
        add(player4info);
        add(player5info);
        add(turn);
        add(bg);
        
        } catch (FontFormatException | IOException e) {  // Catching exceptions for possible errors
            e.printStackTrace();
        }
       
    }
    
    public void createPlayerInfos(int i){
        
        switch(i){
             case 5:
                player5info.setText("<html> Player5's resources: <br>" + player5Res + "<br>  </html>");
                player5info.setVisible(true);
             case 4:
                player4info.setText("<html> Player4's resources: <br>" + player4Res + "<br>  </html>");
                player4info.setVisible(true);
             case 3:
                player3info.setText("<html> Player3's resources: <br>" + player3Res + "<br>  </html>");
                player3info.setVisible(true);
             case 2:
                player2info.setText("<html> Player2's resources: <br>" + player2Res + "<br>  </html>");
                player2info.setVisible(true);
                player1info.setText("<html> Player1's resources: <br>" + player1Res + "<br> </html>");
                player1info.setVisible(true);
                break;
            }
        
    }
    
    public void Phase1(){
        if(allowClick == true){
            
        }
    }
    
    private String playerTurn, player1Res, player2Res, player3Res, player4Res, player5Res;
    private JLabel turn, player1info, player2info, player3info, player4info, player5info;
    private Tile specialgate, specialmoney, specialguild, specialfield, specialstables, specialturn,
                 randforest, randstone, randfarm, randwood, randtrader, randpermit;
    private boolean allowClick = false;
    private int requiredMoney = 1;
    
    public void requiredMoneyCheck(){
        setRequiredMoney(1);
    }
    
    public void setRequiredMoney(int i){
        this.requiredMoney = i;
    }
    
    public int getRequiredMoney(){
        return requiredMoney;
    }


    public String getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(String pturn) {
        this.playerTurn = pturn;
    }

    public void setPlayer1Res(String player1Res) {
        this.player1Res = player1Res;
    }

    public void setPlayer2Res(String player2Res) {
        this.player2Res = player2Res;
    }

    public void setPlayer3Res(String player3Res) {
        this.player3Res = player3Res;
    }

    public void setPlayer4Res(String player4Res) {
        this.player4Res = player4Res;
    }

    public void setPlayer5Res(String player5Res) {
        this.player5Res = player5Res;
    }
    
    
    
}
