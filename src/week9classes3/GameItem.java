package week9classes3;

public class GameItem {
    protected double xLoc;
    protected double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void use(Player player){}
    public String toString(){
        String out=" xLoc:"+this.xLoc;
        out+=" yLoc:"+this.yLoc;
        return out;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
    public void moveTo(double dx,double dy){
        this.xLoc=dx;
        this.yLoc=dy;
    }
}
