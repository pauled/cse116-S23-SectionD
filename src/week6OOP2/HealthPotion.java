package week6OOP2;

public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(int x, int y, int increase){
        super(x,y);
        this.increase=increase;
    }
    public void use(Player player){
        player.takeDamage(-this.increase);
    }
    public String toString(){
        String out="Healthpotion increase: "+this.increase;
        out+=super.toString();
        return out;
    }

    public static void main(String[] args) {
        HealthPotion h1=new HealthPotion(0,0,10);
        h1.move(2,3);
        String out=h1.toString();
    }
}
