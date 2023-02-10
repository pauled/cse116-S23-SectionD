package week2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestFirstRecursion {
    @Test
    public void testAdd(){
        int sum=FirstRecursion.add(4,3);
        assertTrue("expected 7 got: "+sum,7==sum);
        sum=FirstRecursion.add(-7,8);
        assertTrue("expected 1 got: "+sum,1==sum);
        sum=FirstRecursion.add(5,-3);
        assertTrue("expected 2 got: "+sum,2==sum);
        sum=FirstRecursion.add(-6,-2);
        assertTrue("expected -8 got: "+sum,-8==sum);
        sum=FirstRecursion.add(4,0);
        assertTrue("expected 4 got: "+sum,4==sum);
        sum=FirstRecursion.add(0,3);
        assertTrue("expected 3 got: "+sum,3==sum);
        sum=FirstRecursion.add(0,0);
        assertTrue("expected 0 got: "+sum,0==sum);
        sum=FirstRecursion.add(-4,0);
        assertTrue("expected -4 got: "+sum,-4==sum);
        sum=FirstRecursion.add(0,-3);
        assertTrue("expected -3 got: "+sum,-3==sum);
    }
}
