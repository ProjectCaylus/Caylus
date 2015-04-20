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
      
      
        
      
     Building wonderstatue = new Building();
     wonderstatue.cost.addStone(2);
     wonderstatue.cost.addGold(1);
     wonderstatue.cost.addRep(1);
     wonderstatue.cost.addAut(7);
      
      
     Building wonderrestaurant = new Building();
     wonderrestaurant.cost.addFood(3);
     wonderrestaurant.cost.addGold(1);
     wonderrestaurant.cost.addAut(10);
    
     Building wonderhotel = new Building();
     wonderhotel.cost.addWood(3);
     wonderhotel.cost.addGold(1);
     wonderhotel.cost.addAut(10);
     // Turnlist: addMoney(1); ???????
     
     Building wondersweatshop = new Building();
     wondersweatshop.cost.addSilk(3);
     wondersweatshop.cost.addGold(1);
     wondersweatshop.cost.addAut(12);
     
     Building wondertheatre = new Building();
     wondertheatre.cost.addWood(3);
     wondertheatre.cost.addGold(2);
     wondertheatre.cost.addRep(1);
     wondertheatre.cost.addAut(14);
     
     Building wondershrine = new Building();
     wondershrine.cost.addStone(4);
     wondershrine.cost.addGold(2);
     wondershrine.cost.addRep(2);
     wondershrine.cost.addAut(14);
     
     Building wondermonastery = new Building();
     wondermonastery.cost.addStone(3);
     wondermonastery.cost.addGold(2);
     wondermonastery.cost.addRep(1);
     wondermonastery.cost.addAut(14);
     
     Building wonderlibrary = new Building();
     wonderlibrary.cost.addStone(3);
     wonderlibrary.cost.addGold(2);
     wonderlibrary.cost.addAut(16);
     // Turnlist: AddGold(2); ??????

     Building wondercathedral = new Building();
     wondercathedral.cost.addStone(5);
     wondercathedral.cost.addGold(3);
     wondercathedral.cost.addAut(25);
     
     Building stoneforest1 = new Building(); // Owner
     stoneforest1.reward.addFood(1); 
     stoneforest1.reward.addWood(2); 
     stoneforest1.cost.addFood(1);
     stoneforest1.cost.addStone(1);
     stoneforest1.cost.addAut(3);
     stoneforest1.own.addAut(3);
     
     Building stoneforest2 = new Building(); // Guest or other player
     stoneforest2.reward.addFood(1); 
     stoneforest2.reward.addWood(1); 
     stoneforest2.cost.addFood(1);
     stoneforest2.cost.addStone(1);
     stoneforest2.cost.addAut(3);
     stoneforest2.own.addAut(3);
     
     Building stonechurch1 = new Building(); // Joku ero???
     stonechurch1.reward.addMoney(2);
     stonechurch1.reward.addAut(3);
     stonechurch1.cost.addWood(1);
     stonechurch1.cost.addStone(1);
     stonechurch1.cost.addRep(1);
     stonechurch1.cost.addAut(3);
     stonechurch1.own.addAut(3);
     
     Building stonechurch2 = new Building(); // Joku ero ????
     stonechurch2.reward.addMoney(4);
     stonechurch2.reward.addAut(5);
     stonechurch2.cost.addWood(1);
     stonechurch2.cost.addStone(1);
     stonechurch2.cost.addRep(1);
     stonechurch2.cost.addAut(3);
     stonechurch2.own.addAut(3);
     
     Building stonefoodfarm1 = new Building(); // Owner
     stonefoodfarm1.reward.addFood(2);
     stonefoodfarm1.reward.addSilk(1);
     stonefoodfarm1.cost.addFood(1);
     stonefoodfarm1.cost.addStone(1);
     stonefoodfarm1.cost.addAut(3);
     stonefoodfarm1.own.addAut(3);
     
     Building stonefoodfarm2 = new Building(); // Guest vieraileva tähti
     stonefoodfarm2.reward.addFood(1);
     stonefoodfarm2.reward.addSilk(1);
     stonefoodfarm2.cost.addFood(1);
     stonefoodfarm2.cost.addStone(1);
     stonefoodfarm2.cost.addAut(3);
     stonefoodfarm2.own.addAut(3);
     
     Building stonetailor1 = new Building(); // Taas jotain ööö???
     stonetailor1.reward.addSilk(2);
     stonetailor1.reward.addAut(4);
     stonetailor1.cost.addWood(1);
     stonetailor1.cost.addStone(1);
     stonetailor1.cost.addAut(6);
     stonetailor1.own.addAut(6);
     
     Building stonetailor2 = new Building(); // Tai jotain????
     stonetailor2.reward.addSilk(3);
     stonetailor2.reward.addAut(6);
     stonetailor2.cost.addWood(1);
     stonetailor2.cost.addStone(1);
     stonetailor2.cost.addAut(6);
     stonetailor2.own.addAut(6);
     
     Building stonesmith1 = new Building(); // Owner
     stonesmith1.reward.addWood(1);
     stonesmith1.reward.addStone(2);
     stonesmith1.cost.addFood(1);
     stonesmith1.cost.addStone(1);
     stonesmith1.cost.addAut(3);
     stonesmith1.own.addAut(3);
     
     Building stonesmith2 = new Building(); // Guest tai niinku quest
     stonesmith2.reward.addWood(1);
     stonesmith2.reward.addStone(1);
     stonesmith2.cost.addFood(1);
     stonesmith2.cost.addStone(1);
     stonesmith2.cost.addAut(3);
     stonesmith2.own.addAut(3);
  
     Building stonebank1 = new Building(); // Mitä nyt taas??+
     stonebank1.reward.addMoney(2);
     stonebank1.reward.addGold(1);
     stonebank1.cost.addWood(1);
     stonebank1.cost.addStone(1);
     stonebank1.cost.addAut(6);
     stonebank1.own.addAut(6);
     
     Building stonebank2 = new Building(); // Mitä nyt taas??+ V2.0
     stonebank2.reward.addMoney(5);
     stonebank2.reward.addGold(2);
     stonebank2.cost.addWood(1);
     stonebank2.cost.addStone(1);
     stonebank2.cost.addAut(6);
     stonebank2.own.addAut(6);
     
     Building stonealchemist1 = new Building(); // Gold&Food
     stonealchemist1.reward.addGold(1);
     stonealchemist1.reward.addFood(2);
     stonealchemist1.cost.addFood(1);
     stonealchemist1.cost.addStone(1);
     stonealchemist1.cost.addAut(6);
     stonealchemist1.own.addAut(6);
     
     Building stonealchemist2 = new Building(); // Gold&Wood
     stonealchemist2.reward.addGold(1);
     stonealchemist2.reward.addWood(2);
     stonealchemist2.cost.addFood(1);
     stonealchemist2.cost.addStone(1);
     stonealchemist2.cost.addAut(6);
     stonealchemist2.own.addAut(6);
     
     Building stonealchemist3 = new Building(); // Gold&Stone eli black and yellow my native african
     stonealchemist3.reward.addGold(1);
     stonealchemist3.reward.addStone(2);
     stonealchemist3.cost.addFood(1);
     stonealchemist3.cost.addStone(1);
     stonealchemist3.cost.addAut(6);
     stonealchemist3.own.addAut(6);
     
     Building stonealchemist4 = new Building(); // Gold&silk
     stonealchemist4.reward.addGold(1);
     stonealchemist4.reward.addSilk(2);
     stonealchemist4.cost.addFood(1);
     stonealchemist4.cost.addStone(1);
     stonealchemist4.cost.addAut(6);
     stonealchemist4.own.addAut(6);
     
    
     
        
      /**
       * Run File = Shift + F6
      */
    }
}
