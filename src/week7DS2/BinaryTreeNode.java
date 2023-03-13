package week7DS2;

public class BinaryTreeNode<A> {
    //these should be private but aren't so we can trace easier
    public A value;
    public BinaryTreeNode<A> left;
    public BinaryTreeNode<A> right;

    public BinaryTreeNode(A value,BinaryTreeNode<A> left,
                          BinaryTreeNode<A> right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    public String inOrderTraversal(BinaryTreeNode node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=inOrderTraversal(node.left);
            out+=node.value.toString()+" ";
            out+=inOrderTraversal(node.right);
            return out;
        }
    }
    public String preOrderTraversal(BinaryTreeNode node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=node.value.toString()+" ";
            out+=preOrderTraversal(node.left);
            out+=preOrderTraversal(node.right);
            return out;
        }
    }
    public String postOrderTraversal(BinaryTreeNode node){
        if (node==null){
            return "";
        } else {
            String out="";
            out+=postOrderTraversal(node.left);
            out+=postOrderTraversal(node.right);
            out+=node.value.toString()+" ";
            return out;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(5,null,null);
        root.left=new BinaryTreeNode<>(2,null,null);
        root.right=new BinaryTreeNode<>(8,null,null);
        root.left.left=new BinaryTreeNode<>(-3,null,null);
        root.left.right=new BinaryTreeNode<>(4,null,null);
        root.right.left=new BinaryTreeNode<>(7,null,null);
        root.right.right=new BinaryTreeNode<>(14,null,null);
        System.out.println("in order: "+root.inOrderTraversal(root));
        System.out.println("pre order: "+root.preOrderTraversal(root));
        System.out.println("post order: " +root.postOrderTraversal(root));
    }
}
