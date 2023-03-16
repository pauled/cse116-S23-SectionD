package week7DS2;

import week6OOP2.Comparator;
import week6OOP2.IntDecreasing;

public class BST <A>{
    private BinaryTreeNode<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.root=null;
        this.comparator=comparator;
    }
    public void insert(A value){
        if (this.root==null){
            this.root=new BinaryTreeNode<>(value,null,null);
        } else {
            this.insertHelper(this.root,value);
        }
    }
    public void insertHelper(BinaryTreeNode<A> node, A toInsert){
        if (this.comparator.compare(toInsert, node.value)){
            if (node.left==null){
                node.left=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                insertHelper(node.left,toInsert);
            }
        } else {
            if (node.right==null){
                node.right=new BinaryTreeNode<>(toInsert,null,null);
            } else {
                insertHelper(node.right,toInsert);
            }
        }
    }
    public String toString(){
        return this.root.inOrderTraversal(this.root);
    }

    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntDecreasing());

        bst.insert(2);
        bst.insert(5);
        bst.insert(-10);
        bst.insert(4);
        bst.insert(20);
        bst.insert(0);
        bst.insert(3);

        System.out.println(bst);
    }
}
