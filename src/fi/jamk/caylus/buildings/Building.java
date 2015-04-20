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
    /*
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
    */
    public Resources woodfoodfarmopt(String opt){
        switch(opt){
            
            case "food":
                reward.addFood(2);
                break;
                
            case "silk":
                reward.addSilk(1);
                break;
        }
        return this.reward;
    }
    
    public Resources woodsilkfarm(String opt){
        switch(opt){
            
            case "silk":
                reward.addSilk(2);
                break;
                
            case "food":
                reward.addFood(1);
                break;
        }
        return this.reward;
    }
    
    public Resources woodmarketconstructing(String opt){
        this.cost.addWood(1);
        switch(opt){
            
            case "food":
                cost.addFood(1);
                break;
                
            case "wood":
                cost.addWood(1);
                break;
                
            case "stone":
                cost.addStone(1);
                break;
                
            case "silk":
                cost.addSilk(1);
                break;
        }
        return this.cost;
    }
    
    public Resources woodmarketshopping(String opt){
        this.reward.addMoney(6);
        switch(opt){
            
            case "food":
                cost.addFood(1);
                break;
                
            case "wood":
                cost.addWood(1);
                break;
                
            case "stone":
                cost.addStone(1);
                break;
                
            case "silk":
                cost.addSilk(1);
                break;
        }
        return this.cost;
    }
    
    
    public Resources woodtraderconstruction(String opt){
        this.cost.addFood(1);
        switch(opt){
            
            case "wood":
                cost.addWood(1);
                break;
                
            case "stone":
                cost.addStone(1);
                break;
                
            case "silk":
                cost.addSilk(1);
                break;
        }
        return this.cost;
    }
    
    public Resources woodtradershopping(String opt){
        switch(opt){
            
            case "1 coin":
                this.cost.addMoney(1);
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
            
            case "2 coins":
                this.cost.addMoney(2);
                switch(opt){
                    
                    case "food + food":
                        reward.addFood(2);
                        break;
                        
                    case "wood + wood":
                        reward.addWood(2);
                        break;
                        
                    case "stone + stone":
                        reward.addStone(2);
                        break;
                        
                    case "silk + silk":
                        reward.addSilk(2);
                        break;
                        
                    case "food + wood":
                        reward.addFood(1);
                        reward.addWood(1);
                        break;
                        
                    case "food + stone":
                        reward.addFood(1);
                        reward.addStone(1);
                        break;
                        
                    case "food + silk":
                        reward.addFood(1);
                        reward.addWood(1);
                        break;
                        
                    case "wood + stone":
                        reward.addWood(1);
                        reward.addStone(1);
                        break;
                        
                    case "wood + silk":
                        reward.addWood(1);
                        reward.addSilk(1);
                        break;
                        
                    case "stone + silk":
                        reward.addStone(1);
                        reward.addSilk(1);
                        break;
                }
            
        }
        return this.reward;
    }
    
    public Resources deftradershopping(String opt){
        this.cost.addMoney(1);
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
    
    public Resources randforestopt(String opt){
        switch(opt){
            
            case "food":
                reward.addFood(1);
                break;
                
            case "wood":
                reward.addWood(1);
                break;
        }
        return this.reward;
    }
    
    public Resources randfarmopt(String opt){
        switch(opt){
            
            case "food":
                reward.addFood(1);
                break;
                
            case "wood":
                reward.addWood(1);
                break;
        }
        return this.reward;
    }
    
    public Resources randmarket(String opt){
        this.reward.addMoney(4);
        switch(opt){
            
            case "food":
                cost.addFood(1);
                break;
                
            case "wood":
                cost.addWood(1);
                break;
                
            case "stone":
                cost.addStone(1);
                break;
                
            case "silk":
                cost.addSilk(1);
                break;
        }
        return this.cost;
    }

}

