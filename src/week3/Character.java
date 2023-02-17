package week3;

public class Character {
    private int battlesWon;//state
    private int expPts;

    //behavior
    public Character(){
        this.battlesWon=0;
        this.expPts=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.expPts+=xp;
    }
    public String toString(){
        String out="Battles won: "+this.battlesWon;
        out+=" Experience Pts: "+this.expPts;
        return out;
    }
}
