/*
 * Main to try out things in this package.
 */
package fi.jamk.caylus.buildings;
import fi.jamk.caylus.*;
/**
 *
 * @author Mythe & Omistaja
 */
public class CaylusBuildingTesti {
    
    public static void main (String args[]){
        
      Player player1 = new Player("Hessu");
      
      DefBuild trader = new DefBuild(); // luodaan uusi DefBuild olio trader
      trader.trade("food"); // trader olio käyttää DefBuild luokasta "trade" metodia ja asettaa metodin parametriksi "food", koska siihen vaaditaan joking
                            // string, joka vaihtaa mitä trade metodi tekee Switch casen avulla
      
      player1.addAut(7); // lisätään pelaajalle 7 Authority pistettä hänen resursseihinsa.
     // player1.addMoney(1); // jos otat tämän pois kommenteista, viimeinen kohta (uudelleenkäyttö, rivi 33 atm. muuttuu todeksi, joten maksu voidaan suorittaa.
      
      player1.subGold(5); // vähennetään pelaajalta 5 kulta resurssia.
      
      payment(player1.getResArray(),trader.cost.getResArray()); // Onko pelaajalla varaa traderin käyttöön?
      System.out.println(player1.getMoney() + " pelaajan rahat nyt"); // Tulostaa pelaajan rahat nyt
      System.out.println(player1.subMoney(trader.cost.getMoney()) + " raha jää pelaajalle maksun jälkeen"); // vähennetään DefBuild "trader" olion sisältämästä "cost" nimisen Resource olion raha muuttujan arvo =/= 2
      System.out.println(player1.addFood(trader.reward.getFood()) + " Tämän verran pelaaja saa ruokaa lisää traderilta kun valittiin food traderi");  // lisää 
      System.out.println(player1.addSilk(trader.reward.getSilk()) + " Tämän verran pelaaja saa silkkiä lisää traderilta kun valittiin food traderi");
        
      System.out.println(player1.resourcesInfo());  // tulostaa kaikki pelaajan varat
      
      payment(player1.getResArray(),trader.cost.getResArray()); // Onko pelaajalla varaa uudestaan traderin käytöön?

      /**
       * Run File = Shift + F6
      */
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
