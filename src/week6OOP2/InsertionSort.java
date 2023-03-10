package week6OOP2;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort <T>{
    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> input){
        this.comparator=input;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();

        for (T valueToInsert : input){
            int loc=0;
            for (T valueToCompare : output){
                if (comparator.compare(valueToCompare,valueToInsert)){
                    loc++;
                }
            }
            output.add(loc,valueToInsert);
        }
        return output;
    }

    public static void main(String[] args) {
        IntDecreasing temp=new IntDecreasing();
        InsertionSort<Integer> sorter=new InsertionSort<>(temp);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);
    }
}
