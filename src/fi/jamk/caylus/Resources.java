package fi.jamk.caylus;


/** 
 * 
 * @author Mythe 
 */ 

public class Resources {

    private int money, food, wood, stone, silk, gold, rep, aut;
    private boolean stonePermit = false;
    private boolean woodPermit = false;
    private boolean koasPermit = false;
    private boolean wonderPermit = false;
<<<<<<< HEAD
=======
    private boolean defBuild = false;

>>>>>>> origin/master

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
    
 public void addMoney(int i){
        this.money = money + i;
    }
    public void subMoney(int i){
        this.money = money - i;
    }
    public void addFood(int i){
        this.food = food + i;
    }
    public void subFood(int i){
        this.food = food - i;
    }
    public void addWood(int i){
        this.wood = wood + i;
    }
    public void subWood(int i){
        this.wood = wood - i;
    }
    public void addStone(int i){
        this.stone = stone + i;
    }
    public void subStone(int i){
        this.stone = stone - i;
    }
    public void addSilk(int i){
        this.silk = silk + i;
    }
    public void subSilk (int i){
        this.silk = silk - i;
    }
    public void addGold(int i){
        this.gold = gold + i;
    }
    public void subGold(int i){
        this.gold = gold - i;
    }
    public void addRep(int i){
        this.rep = rep + i;
    }
    public void subRep(int i) {
        this.rep = rep - i;
    }
    public void addAut(int i) {
        this.aut = aut + i;
    }
    public void subAut(int i) {
        this.aut = aut - i;
    }

    public void setStonePermit(boolean stonePermit) {
        this.stonePermit = stonePermit;
    }

    public void setWoodPermit(boolean woodPermit) {
        this.woodPermit = woodPermit;
    }

    public void setKoasPermit(boolean koasPermit) {
        this.koasPermit = koasPermit;
    }

    public void setWonderPermit(boolean wonderPermit) {
        this.wonderPermit = wonderPermit;
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

    public boolean isStonePermit() {
        return stonePermit;
    }

    public void setStonePermit(boolean stonePermit) {
        this.stonePermit = stonePermit;
    }

    public boolean isWoodPermit() {
        return woodPermit;
    }

    public void setWoodPermit(boolean woodPermit) {
        this.woodPermit = woodPermit;
    }

    public boolean isKoasPermit() {
        return koasPermit;
    }

    public void setKoasPermit(boolean koasPermit) {
        this.koasPermit = koasPermit;
    }

    public boolean isWonderPermit() {
        return wonderPermit;
    }

    public void setWonderPermit(boolean wonderPermit) {
        this.wonderPermit = wonderPermit;
    }

    public boolean isDefBuild() {
        return defBuild;
    }

    public void setDefBuild(boolean defBuild) {
        this.defBuild = defBuild;
    }
    
    
    
    public String resourcesInfo(){
        return "Money: " + this.money + "Food: " + this.food + "Wood: " + this.wood + "Stone: " + 
                this.stone + "Silk: " + this.silk + "Gold: " + this.gold + "Reputation: " + this.rep 
                + "Authority: " + this.aut;
    }
    
    }
    
