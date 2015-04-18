/*
 * Main to try out things in this package.
 */
package fi.jamk.caylus.buildings;
import fi.jamk.caylus.*;
import fi.jamk.caylus.buildings.WoodBuild;
/**
 *
 * @author Mythe & Omistaja
 */
public class CaylusBuildingTesti {
    
    public static void main(String args[]){
        
           
      Player player1 = new Player("Hessu");
      
      
      DefBuild trader = new DefBuild();
      trader.trade("food");
      
      player1.addAut(7);
      
      player1.subGold(5); 
        
      System.out.println(player1.getMoney()); // Rahat nyt
      System.out.println(player1.subMoney(trader.cost.getMoney())); // vähennetään DefBuild "trader" olion sisältämästä "cost" nimisen Resource olion raha muuttujan arvo =/= 2
        System.out.println(player1.addFood(trader.reward.getFood()));
        System.out.println(player1.addSilk(trader.reward.getSilk()));
        
      System.out.println(player1.resourcesInfo()); 
      

      /**
       * Run File = Shift + F6
      */
    }
}
