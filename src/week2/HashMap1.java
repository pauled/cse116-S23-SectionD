package week2;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Diggs",14);
        System.out.println("Digg's number: "+bills.get("Diggs"));
        System.out.println(bills);
        for (String keys : bills.keySet()){
            System.out.println(keys+": "+bills.get(keys));
        }
    }
}
