package week9classes3;

public class HealthPotion extends GameItem {
    private int increase;

    public HealthPotion(double x,double y,int increase){
        super(x,y);
        this.increase=increase;
    }
    public void use(Player player){
        player.takeDamage(-this.increase);
    }
    public String toString(){
        String out="Health inc:"+this.increase;
        out+=super.toString();
        return out;
        //return "Health inc:"+this.increase+super.toString();
    }
    public static void main(String[] args) {
        HealthPotion h1=new HealthPotion(1,1,5);
        h1.move(2,2);
        String out=h1.toString();
        System.out.println(out);
    }
}
