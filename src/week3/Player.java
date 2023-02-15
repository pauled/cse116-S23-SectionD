package week3;

public class Player {
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public int getHP(){
        return this.HP;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public void setMaxHP(int val){
        this.maxHP=val;
    }
    public void takeDamage(int damageTaken){
        this.HP-=damageTaken;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="health: "+this.HP+"/";
        out+=this.maxHP;
        return out;
    }


    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(6);
        Player p3=p2;
        int temp=p1.getDamageDealt();
        p2.setMaxHP(9);
        p1.attack(p2);
        p1.attack(p2);
        System.out.println(p2);
    }
}
