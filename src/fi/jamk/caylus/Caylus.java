package fi.jamk.caylus;
import java.awt.CardLayout;
/* 

MORO REISCA WITTU
OSMO... OSMO HEI! NO WITTU! WITTUSAATANA
*/


/** 
 * 
 * @author Mythe 
 */ 

public class Caylus {
  
    public final int WIDTH = 1920, HEIGHT = 1080;
    
    static enum GameState {
        MENU, PLAY
    }
    
    public GameState state = GameState.MENU;
    
    public void setState(GameState sd) {
        this.state = sd;
    }
    
    public GameState getState(){
        return state;
    }
    
    private boolean running = false;
    private Thread thread;
    private Board board;
    private Menu menu;
    private Window game;
    
     
    public Caylus(){
       //CaylusWindow game = new CaylusWindow();
       board = new Board();
       menu = new Menu();

        
       game = new Window(this);
       
       game.add(menu);
       game.setSize(1920,1080);
       game.setLocationRelativeTo(null);
       game.setResizable(false);
       game.setVisible(true);
       
    }
    
    
    public synchronized void start(){
        if(running)
            return;
        
        running = true;
        thread = new Thread() {
        @Override
        public void run(){
        gameLoop();
    }
    };
        thread.start();
        
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                looping();
            }
        };
        thread2.start();
    }
    
    public synchronized void stop(){
        try {
             thread.join(); // Adds all threads together and waits for them to die
             running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    // Game loop starts here
    // Made so fps is max 60
    
    private void gameLoop(){
        tickFps();

    }
    
    private void looping(){
        while(state == GameState.MENU){
            menu.setVisible(true);
                if(menu.isDone() == true){
                     menu.setVisible(false);
                    setState(GameState.PLAY);
                    game.remove(menu);
                    game.add(board);
                    game.revalidate();
                   
                    
                }
            }
        while(state == GameState.PLAY){
                board.setVisible(true);
            }
    }
    
    private void tickFps(){ 
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();
        
            while(running){
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;
                if(delta >= 1){
                    tick();
                    updates++;
                    delta--;
                }
               // render();
                frames++;
                
                
                if(System.currentTimeMillis() - timer > 1000){
                    timer += 1000;
                    System.out.println(updates + " Ticks, fps " + frames);
                    updates = 0; // resetting updates value so ticks dont gain infinitely
                    frames = 0; // resetting frames value so fps doesnt gain infinitely
                    
                }
            }
        stop();
    }
    
    public void tick(){
    }
    
    public static void main (String args[]){
        Caylus caylus = new Caylus();
      
    }
    public static void payment(int[] playerFunds, int[] buildingCost) { // TO-DO: return
        boolean b = false;
        
        for ( int i = 0; i < buildingCost.length; i++) {                // for loop to check all Array positions
            if(buildingCost[i] != 0){                                   // checks if buildings cost position is something else than 0
                if(buildingCost[i] > playerFunds[i]) {                      // if so -> Checks if buildingCost array position [i] is > playerFunds position [i] 
                b = false;                                                  // if Cost > Funds = payment can't be done = returns false
                }
            else if(playerFunds[i] == buildingCost[i]) {                    //if Funds = Cost then return = true              
               b = true;  
            }else{ b = true;                                                //else (means if playerFunds are in every position higher than the cost) 
            }                                                               //return will be true.
            }
        }
         System.out.println(b);                                         // !! Returning not implemented yet !!
                                                                         // TO-DO: return

}
    

}
