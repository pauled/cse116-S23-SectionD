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
    public double min(){
        if (this.numbers==null){
            return -1;
        } else {
            return minHelper(this.numbers,Integer.MAX_VALUE);
        }
    }
    public double minHelper(LinkedListNode<Double> node,double min){
        if (node==null){
            return min;
        } else {
            if (node.getValue()<min){
                return minHelper(node.getNext(),node.getValue());
            } else {
                return minHelper(node.getNext(),min);
            }
        }
    }
    public String toString(){
        return this.numbers.toString();
    }

    public static void main(String[] args) {
        LinkedListOfDoubles list=new LinkedListOfDoubles();
        list.addDouble(1.0);
        list.addDouble(-1.0);
        list.addDouble(3.0);
        double small=list.min();
    }
}
