package week11.example1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IncreasingCheck {

    /**
     * Checks if the input ArrayList contains ints in strictly increasing order
     */
    public static boolean isIncreasing(ArrayList<Integer> numbers) {
        for (int i = 1; i < numbers.size() ; i++) {
            int first = numbers.get(i - 1);
            int second = numbers.get(i);
            if (first > second) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1=new ArrayList<>(Arrays.asList(-4,0,1,4,6,10));
        System.out.println(test1+" should be true: "+isIncreasing(test1));

        ArrayList<Integer> test2=new ArrayList<>(Arrays.asList(-4,0,1,1,4,6,10));
        System.out.println(test2+" should be true: "+isIncreasing(test2));

        ArrayList<Integer> test3=new ArrayList<>(Arrays.asList(-4,0,4,1,6,10));
        System.out.println(test3+" should be false: "+isIncreasing(test3));

        ArrayList<Integer> test4=new ArrayList<>(Arrays.asList(4,0,1,4,6,10));
        System.out.println(test4+" should be false: "+isIncreasing(test4));

        ArrayList<Integer> test5=new ArrayList<>(Arrays.asList(-4,0,1,4,6,-10));
        System.out.println(test5+" should be false: "+isIncreasing(test5));
    }

}
