package week6OOP2;

public class GameItem {
    protected int xLoc;
    protected int yLoc;

    public GameItem(int x,int y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void use(Player player){}
    public String toString(){
        String out=" xLoc:"+this.xLoc;
        out+="  yLoc:"+this.yLoc;
        return out;
    }
}
