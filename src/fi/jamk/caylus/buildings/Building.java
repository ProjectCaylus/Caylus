package fi.jamk.caylus.buildings;
import fi.jamk.caylus.*;

/** 
 * 
 * @author Mythe 
 */ 

public class Building extends Resources {

    public Building() {
    }

    public Building(int money, int food, int wood, int stone, int silk, int gold, int rep, int aut) {
        super(money, food, wood, stone, silk, gold, rep, aut);
    }

    public Building getReward() {
        return reward;
    }

    public void setReward(Building reward) {
        this.reward = reward;
    }

    public Building getCost() {
        return cost;
    }

    public void setCost(Building cost) {
        this.cost = cost;
    }

    public Building getOwn() {
        return own;
    }

    public void setOwn(Building own) {
        this.own = own;
    }
    
    

    Building reward = new Building(0,0,0,0,0,0,0,0);
    Building cost = new Building(0,0,0,0,0,0,0,0);
    Building own = new Building(0,0,0,0,0,0,0,0);
}
