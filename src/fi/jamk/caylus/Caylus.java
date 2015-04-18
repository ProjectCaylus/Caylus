package fi.jamk.caylus;
import fi.jamk.caylus.buildings.*;
/* 

MORO REISCA WITTU
OSMO... OSMO HEI! NO WITTU! WITTUSAATANA
*/

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


/** 
 * 
 * @author Mythe 
 */ 

public class Caylus extends Canvas {
  
    public static final int WIDTH = 1920, HEIGHT = 1080;
    
    private boolean running = false;
    private Thread thread;
    private Board board;
     
    public Caylus(){
       //CaylusWindow game = new CaylusWindow();
       Window game = new Window(this);
       board = new Board();
       game.add(board);
       
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
    
    public void render(){
        
        BufferStrategy bs = this.getBufferStrategy();
        
        if(bs == null){
            
            this.createBufferStrategy(2);
            return;
             }
        
        Graphics g = bs.getDrawGraphics();
        // Drawing starts
        
       g.setColor(Color.black);
       g.fillRect(0, 0, getWidth(), getHeight());
       
        // Drawing ends
        
        g.dispose();
        bs.show();
     
        
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
