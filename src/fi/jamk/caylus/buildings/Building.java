package fi.jamk.caylus.buildings;
import fi.jamk.caylus.*;

/** 
 * 
 * @author Mythe 
 */ 

public class Building extends Resources {

        Resources reward, cost, own;
    
    public Building(){
        
        reward = new Resources(0,0,0,0,0,0,0,0);
        cost = new Resources(0,0,0,0,0,0,0,0);
        own = new Resources(0,0,0,0,0,0,0,0);
    }
    
    public Resources defTrade(String opt){
        this.cost.addMoney(2);
        switch(opt){
            
            case "food": 
                reward.addFood(1);
                break;
            
            case "wood": 
                reward.addWood(1);
                break;
                
            case "stone": 
                reward.addStone(1);
                break;
                
            case "silk": 
                reward.addSilk(1);
                break;
                
        }
        return this.reward;
        
    }
}
