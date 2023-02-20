package week4DS1;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value,LinkedListNode next){
        this.value=value;
        this.next=next;
    }
    public LinkedListNode getNext(){
        return this.next;
    }
    public int getValue(){
        return this.value;
    }
    public String toString2(){
        String out="";
        out+=this.value+" ";
        LinkedListNode nextNext=this.next;
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
        LinkedListNode head=new LinkedListNode(1,null);
        head=new LinkedListNode(2,head);
        head=new LinkedListNode(3,head);
        String value=head.toString();
        System.out.println(value);
    }
}
