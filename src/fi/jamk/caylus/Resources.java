
package fi.jamk.caylus;

/** 
 * 
 * @author Mythe 
 */ 

public class Resources {

    private int money, food, wood, stone, silk, gold, rep, aut;
    private boolean stonepermit = false, woodpermit = false, wonderpermit = false, koaspermit = false;
    
    public Resources (){ // empty Constructor
        
    }

    public Resources(int money, int food, int wood, int stone, int silk, int gold, int rep, int aut){
        this.money = money;
        this.food = food;
        this.wood = wood;
        this.stone = stone;
        this.silk = silk;
        this.gold = gold;
        this.rep = rep;
        this.aut = aut;
    }
    
 public int addMoney(int i){
        this.money = money + i;
        return money;
    }
    public int subMoney(int i){
        this.money = money - i;
        return money;
    }
    public int addFood(int i){
        food = food + i;
        return food;
    }
    public int subFood(int i){
        this.food = food - i;
        return food;
    }
    public int addWood(int i){
        this.wood = wood + i;
        return wood;
    }
    public int subWood(int i){
        this.wood = wood - i;
        return wood;
    }
    public int addStone(int i){
        this.stone = stone + i;
        return stone;
    }
    public int subStone(int i){
        this.stone = stone - i;
        return stone;
    }
    public int addSilk(int i){
        this.silk = silk + i;
        return silk;
    }
    public int subSilk (int i){
        this.silk = silk - i;
        return silk;
    }
    public int addGold(int i){
        this.gold = gold + i;
        return gold;
    }
    public int subGold(int i){
        this.gold = gold - i;
        return gold;
    }
    public int addRep(int i){
        this.rep = rep + i;
        return rep;
    }
    public int subRep(int i) {
        this.rep = rep - i;
        return rep;
    }
    public int addAut(int i) {
        this.aut = aut + i;
        return aut;
    }
    public int subAut(int i) {
        this.aut = aut - i;
        return aut;
    }
    
    public int getMoney() {
        return money;
    }

    public int getFood() {
        return food;
    }

    public int getWood() {
        return wood;
    }

    public int getStone() {
        return stone;
    }

    public int getSilk() {
        return silk;
    }

    public int getRep() {
        return rep;
    }

    public int getAut() {
        return aut;
    }

    public int getGold(){
        return gold;
    }
    
    public String goldInfo(){
        return "" + this.gold;
    }
    public String resourcesInfo(){
        return "\n\nMoney: " + this.money + "\nFood: " + this.food + "\nWood: " + this.wood + "\nStone: " + 
                this.stone + "\nSilk: " + this.silk + "\nGold: " + this.gold + "\nReputation: " + this.rep 
                + "\nAuthority: " + this.aut;
    }

    public boolean isStonepermit() {
        return stonepermit;
    }

    public void setStonepermit(boolean stonepermit) {
        this.stonepermit = stonepermit;
    }

    public boolean isWoodpermit() {
        return woodpermit;
    }

    public void setWoodpermit(boolean woodpermit) {
        this.woodpermit = woodpermit;
    }

    public boolean isWonderpermit() {
        return wonderpermit;
    }

    public void setWonderpermit(boolean wonderpermit) {
        this.wonderpermit = wonderpermit;
    }

    public boolean isKoaspermit() {
        return koaspermit;
    }

    public void setKoaspermit(boolean koaspermit) {
        this.koaspermit = koaspermit;
    }
    
    
    
    }
    
