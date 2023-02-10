package week2;

public class FirstRecursion {
    //write a function that returns the nth digit inn the fibinnaci sequence
    // 0 1 1 2 3 5 8 13 21 34...
    public static int fib(int n){
        if (n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            int temp= fib(n-1)+fib(n-2);
            return temp;
        }
    }

    public static int add(int a,int b){
        if (b==0){//base case
            return a;
        } else if (b>0){//recursive case
            int temp=add(a+1,b-1);
            return temp;
        } else {
            int temp=add(a-1,b+1);
            return temp;
        }
    }

    public static void main(String[] args) {
        int out=add(3,3);
        System.out.println(out);
    }
}
