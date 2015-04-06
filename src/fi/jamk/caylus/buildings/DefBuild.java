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
public class DefBuild extends Resources {
    
    public DefBuild(){
        super(0,0,0,0,0,0,0,0);
    }
   
    public int defGoldMine(){
        DefBuild defGoldMine = new DefBuild();
        defGoldMine.addGold(1);
       
        return defGoldMine.getGold();
    }
    
    public int defTrader(){
        DefBuild defTrader = new DefBuild();
        int defTraderOptions = 4;
        switch(defTraderOptions){
            
            case 1: defTrader.subMoney(2);
                defTrader.addFood(1);
                break;
            
            case 2: defTrader.subMoney(2);
                defTrader.addWood(1);
                break;
                
            case 3: defTrader.subMoney(2);
                defTrader.addStone(1);
                break;
                
            case 4: defTrader.subMoney(2);
                defTrader.addSilk(1);
                break;
                
        }return defTrader.getMoney() + defTrader.getFood() + defTrader.getWood() + defTrader.getStone() + defTrader.getSilk();
        
    }
}