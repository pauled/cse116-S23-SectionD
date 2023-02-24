package week4DS1;

public class Stack<T> {
    private LinkedListNode<T> top;

    public Stack(){
        this.top=null;
    }
    public void push(T value){
        this.top=new LinkedListNode<>(value,this.top);
    }
    public T pop(){
        if (this.top==null){
            return null;
        } else {
            T temp=this.top.getValue();
            this.top=this.top.getNext();
            return temp;
        }
    }public String toString(){
        return this.top.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
