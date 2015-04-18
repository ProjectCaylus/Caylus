/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.caylus.buildings;
import fi.jamk.caylus.Resources;
/**
 *
 * @author Omistaja
 */
public class WoodBuild extends Building {

    public WoodBuild() {
    }

    public WoodBuild(int money, int food, int wood, int stone, int silk, int gold, int rep, int aut) {
        super(money, food, wood, stone, silk, gold, rep, aut);
    }

    WoodBuild woodfoodfarm1 = new WoodBuild(0,reward.addFood(2)+cost.subFood(1),cost.subWood(1),0,0,0,0,cost.addAut(2)+own.addAut(2));
    WoodBuild woodfoodfarm2 = new WoodBuild(0,cost.subFood(1),cost.subWood(1),0,reward.addSilk(1),0,0,cost.addAut(2)+own.addAut(2));
    
}

    

