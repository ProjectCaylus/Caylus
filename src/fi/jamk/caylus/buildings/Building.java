package fi.jamk.caylus.buildings;
import fi.jamk.caylus.Resources;

/** 
 * 
 * @author Mythe 
 */ 

public class Building {
    
    Resources reward, cost, own;
    
    public Building(){
        reward = new Resources(0,0,0,0,0,0,0,0);
        cost = new Resources(0,0,0,0,0,0,0,0);
        own = new Resources(0,0,0,0,0,0,0,0);
        
    }
 
}
