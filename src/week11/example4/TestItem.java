package week11.example4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestItem {
    ArrayList<String> expectedDescriptions;
    ArrayList<Double> expectedPrices;
    ArrayList<Item> items;

    public void initialize(){
        this.expectedDescriptions=new ArrayList<>();
        this.expectedPrices=new ArrayList<>();
        this.items=new ArrayList<>();

        this.expectedDescriptions.add("widget");
        this.expectedPrices.add(10.99);
        this.expectedDescriptions.add("thing-a-ma-bob");
        this.expectedPrices.add(24.13);
        for (int i=0;i<expectedPrices.size();i++){
            this.items.add(new Item(this.expectedDescriptions.get(i),
                                    this.expectedPrices.get(i)));
        }
    }
    @Test
    public void testConstructorGet(){
        TestItem item=new TestItem();
        item.initialize();

        for (int i=0;i<this.expectedPrices.size();i++){
            assertEquals(this.expectedDescriptions.get(i),this.items.get(i).getDescription());
        }
    }
}
