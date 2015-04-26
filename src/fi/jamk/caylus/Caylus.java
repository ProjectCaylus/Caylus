package fi.jamk.caylus;
import java.util.ArrayList;
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
    private ArrayList<Player> players = new ArrayList<Player>();

    public ArrayList<Player> getPlayers() {
        return players;
    }
    
     
    
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
        tickFps();
    }
    };
        thread.start();
        
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                menuLoop();
                creatingPlayers();
                gameLoop();
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
        while(state == GameState.PLAY){
            createPlayerResInfo(players.size());
            board.createPlayerInfos(players.size());
            }

    }
    
    private void phaseOne(){
        for(int i = 0; i < players.size(); i++){
            while(players.get(i).getMoney() > board.getRequiredMoney()) {
                
            
        
            }
        }
    }
    
    
    // Creating new players according to the choice of the player
   private void creatingPlayers(){ 
     for(int i = 0; i < menu.getPlayerAmount(); i++) {
            Player p = new Player();
            players.add(i, p);
        }
    }
   
       public void createPlayerResInfo(int i){
        
        switch(i){
            case 1:
            case 2:
                board.setPlayer1Res(players.get(0).resourcesInfo());
                board.setPlayer2Res(players.get(1).resourcesInfo());
           break;
            case 3:
                board.setPlayer1Res(players.get(0).resourcesInfo());
                board.setPlayer2Res(players.get(1).resourcesInfo());
                board.setPlayer3Res(players.get(2).resourcesInfo());                
                break;
            case 4:
                board.setPlayer1Res(players.get(0).resourcesInfo());
                board.setPlayer2Res(players.get(1).resourcesInfo());
                board.setPlayer3Res(players.get(2).resourcesInfo());
                board.setPlayer4Res(players.get(3).resourcesInfo());                
                break;
            case 5:
                board.setPlayer1Res(players.get(0).resourcesInfo());
                board.setPlayer2Res(players.get(1).resourcesInfo());
                board.setPlayer3Res(players.get(2).resourcesInfo());
                board.setPlayer4Res(players.get(3).resourcesInfo());
                board.setPlayer5Res(players.get(4).resourcesInfo());
                break;
            }
        
    }
    
    private void menuLoop(){
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
