package week4DS1;

public class LinkedListOfDoubles {
    private LinkedListNode<Double> numbers;

    public LinkedListOfDoubles(){
        this.numbers=null;
    }
    public void addDouble(double d){
        if (this.numbers==null){
            this.numbers=new LinkedListNode<>(d,null);
        } else {
            this.numbers.append(d);
        }
    }
}
