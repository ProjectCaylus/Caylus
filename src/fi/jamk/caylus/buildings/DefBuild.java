package fi.jamk.caylus.buildings;
import fi.jamk.caylus.Resources;

/** 
 * 
 * @author Mythe 
 */ 

public class DefBuild extends Building{
    
    public DefBuild(){
        super();
    }
    
    public void defGoldMine(){
        
    }
      public Resources trade(String opt){
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