package week4DS1;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int value, LinkedListNodeInt next){
        this.value=value;
        this.next=next;
    }
    public LinkedListNodeInt getNext(){
        return this.next;
    }
    public int getValue(){
        return this.value;
    }
    public String toString2(){
        String out="";
        out+=this.value+" ";
        LinkedListNodeInt nextNext=this.next;
        while (nextNext != null){
            out+=nextNext.getValue()+" ";
            nextNext=nextNext.getNext();
        }
        return out;
    }
    public String toString(){
        if (this.next==null){
            return this.value+"";
        } else {
            String out=this.value+" ";
            out+=this.next.toString();
            return out;
        }
    }

    public static void main(String[] args) {
        LinkedListNodeInt head=new LinkedListNodeInt(1,null);
        head=new LinkedListNodeInt(2,head);
        head=new LinkedListNodeInt(3,head);
        String value=head.toString();
        System.out.println(value);
    }
}
