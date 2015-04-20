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
        DefBuild goldmine = new DefBuild();
      goldmine.reward.addGold(1);
    }
   
}