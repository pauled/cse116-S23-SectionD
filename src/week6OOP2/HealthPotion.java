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
}
