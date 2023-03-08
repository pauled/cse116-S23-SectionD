package week6OOP2;

public class Teleporter extends GameItem{
    private int dx;
    private int dy;

    public Teleporter(int x, int y){
        super(x,y);
        this.dy=0;
        this.dx=0;
    }
    public void setMovement(int x,int y){
        this.dx=x;
        this.dy=y;
    }
    public void use(Player player){
        player.move(this.dx,this.dy);
        this.dx=0;
        this.dy=0;
    }
}
