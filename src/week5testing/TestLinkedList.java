package week5testing;

import org.junit.Test;
import week4DS1.LinkedListNode;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    public LinkedListNode<Integer> firstNSquares(int n){
        //System.out.println("in firstNSquares");
        if (n<=0){
            return null;
        } else {
            return firstNSquaresHelper(n,null);
        }
    }
    private LinkedListNode<Integer> firstNSquaresHelper(int n,
                                                        LinkedListNode<Integer> list){
        /*if (list!=null) {
            System.out.println("in firstNSquaresHelper n:" + n + " list:" + list.toString());
        } else {
            System.out.println("in firstNSquaresHelper n:" + n + " list: null");
        }*/
        if (n==1){
            return new LinkedListNode<>(1,list);
        } else {
            int temp=n*n;
            return firstNSquaresHelper(n,new LinkedListNode<>(temp,list));
        }
    }
    public <T> void compareLinkedLists(LinkedListNode<T> l1,
                                       LinkedListNode<T> l2){
        if (!((l1==null) && (l2==null))){
            assertTrue("l1 ",l1!=null);
            assertTrue("l2 ",l2!=null);
            assertEquals("node values nnot equal",
                    l1.getValue(),l2.getValue());
            compareLinkedLists(l1.getNext(),l2.getNext());
        }
    }
    @Test
    public void testLinkedList(){
        LinkedListNode<Integer> computed=firstNSquares(3);
        LinkedListNode<Integer> expected=new LinkedListNode<>(9,null);
        expected=new LinkedListNode<>(4,expected);
        expected=new LinkedListNode<>(1,expected);
        compareLinkedLists(expected,computed);
    }
    @Test
    public void testLinkedListSizeDifference(){
        LinkedListNode<Integer> computed=firstNSquares(3);
        LinkedListNode<Integer> expected=new LinkedListNode<>(9,null);
        expected=new LinkedListNode<>(4,expected);
        expected=new LinkedListNode<>(1,expected);
        compareLinkedLists(expected,computed);
    }
}
