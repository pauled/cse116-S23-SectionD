package week9classes3;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<GameItem> inventory;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getHP(){
        return this.HP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void setHP(int val){
        this.HP=val;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="Health: "+this.HP;
        out+="/"+this.maxHP+" damage: ";
        out+=this.damageDealt+super.toString();
        return out;
    }
    public void pickUp(GameItem item){
        this.inventory.add(item);
    }
    public void useInventoryItem(int location){
        if (location<this.inventory.size()){
            this.inventory.get(location).use(this);
        }
    }

    public static void main(String[] args) {
        Weapon w1=new Weapon(0,0,15);
        GameItem w2=new Weapon(1,1,10);
        GameItem w3=w1;
        Player p1=new Player(50);
        //Player p2=new Player(20)
        //HealthPotion h1=new HealthPotion(0,0,10);


        //p1.pickUp(h1);
        p1.pickUp(w1);
        //w1.attack(p2);
        //System.out.println(p2);
        //GameItem w2=w1;
        //w2.attack(p2);
        //System.out.println(p2);
    }
}
