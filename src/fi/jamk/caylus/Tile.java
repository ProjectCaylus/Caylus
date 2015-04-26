/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import fi.jamk.caylus.buildings.Building;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/** 
 * 
 * @author Mythe 
 */ 


public class Tile extends JButton {
    
    ImageIcon board = new ImageIcon(getClass().getResource("/images/Caylus_board.png"));
    ImageIcon apina = new ImageIcon(getClass().getResource("/images/apina.jpg"));
    ImageIcon jeps = new ImageIcon(getClass().getResource("/images/eihuono.jpg"));
    ImageIcon fill = new ImageIcon(getClass().getResource("/images/fill.png"));

    private ImageIcon img;
    private Building building;
    private JLabel plr;
    private LineBorder p1border = new LineBorder(Color.BLUE, 5);
    private LineBorder p2border = new LineBorder(Color.RED, 5);
    
    public Tile(){
        setSize(150,139);
        setVisible(true);
        setBorderPainted(true);
        setContentAreaFilled(false);
        this.img = null;
        this.building = null;
        setBorder(p1border);
        addActionListener(new normalPress());
        
        
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
    
private class specialPress implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        setContentAreaFilled(true);
        setIcon(apina);
    }
}

private class normalPress implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        setBorder(p2border);
        setContentAreaFilled(true);
        setIcon(jeps);
        setDisabledIcon(jeps);
        setEnabled(false);
        setForeground(Color.BLUE);
        setText("asd");
    }
}
    
}
