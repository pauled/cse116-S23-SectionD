package week4DS1;

public class LinkedListNode<T> {
    private T value;
    private LinkedListNode next;

    public LinkedListNode(T value, LinkedListNode next){
        this.value=value;
        this.next=next;
    }
    public LinkedListNode getNext(){
        return this.next;
    }
    public T getValue(){
        return this.value;
    }
    public void setNext(LinkedListNode<T> next){
        this.next=next;
    }
    public int size(){
        //returns the size of the linked list
        if (this.next==null){
            return 1;
        } else {
            return 1+this.next.size();
        }
    }
    public void append(T value){
        //append a new node with value 2 to the end
        if (this.next==null){
            this.next=new LinkedListNode(value,null);
        } else {
            this.next.append(value);
        }
    }
    public void insert(T value, int loc){
        //puts the value at that point in the linked list pushing every after back
        if (loc==0){
            this.next=new LinkedListNode(this.value,this.next);
            this.value=value;
        } else {
            this.next.insert(value,loc-1);
        }
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
        LinkedListNode<Integer> head=new LinkedListNode(1,null);
        head=new LinkedListNode<Integer>(2,head);
        head=new LinkedListNode<Integer>(3,head);
        String value=head.toString();
        System.out.println(value);
        head.append(4);
        System.out.println(head);
    }

}
