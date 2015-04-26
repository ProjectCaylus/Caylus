package fi.jamk.caylus;

/** 
 * 
 * @author Mythe 
 */ 

public class PlayerResources extends Resources{

   private int workers;
   
    public PlayerResources(){
        super(3,2,1,0,0,0,0,0);
        workers = 6;
    }

    public void useWorker(){
        this.workers = workers - 1;
    }
    
    public void returnAllWorkers(){
        this.workers = 6;
    }

    public int getWorkers() {
        return workers;
    }

    
    
    
    
}
    



