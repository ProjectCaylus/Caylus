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
}
