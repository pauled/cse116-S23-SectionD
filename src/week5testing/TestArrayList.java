package week5testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    public void compareArrayLists(ArrayList<Integer> expected,
                                  ArrayList<Integer> computed){
        assertEquals(expected.size(),computed.size());
        for (int i=0; i<expected.size(); i++){
            assertEquals("Values are different at: "+i,
                    expected.get(i),
                    computed.get(i));
        }
    }
    @Test
    public void testArrayList(){
        ArrayList<Integer> expected=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> computed=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> computed2=new ArrayList<>(Arrays.asList(1,2,4));
        ArrayList<Integer> computed3=new ArrayList<>(Arrays.asList(3,2,1));
        compareArrayLists(expected,computed);
        compareArrayLists(expected,computed2);
        compareArrayLists(expected,computed3);
    }
}
