package week2;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestGrade {
    @Test
    public void testLetter(){
        String l1=Grade.letter(98);
        assertTrue("98 The letter should be A but got: "+l1,l1.equals("A"));
        String l2=Grade.letter(74);
        assertTrue("74 The letter should be C but got: "+l2,l2.equals("C"));
        String l3=Grade.letter(5);
        assertTrue("5 The letter should be F but got: "+l3,l3.equals("F"));
        String l4=Grade.letter(61);
        assertTrue("61 The letter should be D but got: "+l4,l4.equals("D"));
    }
    @Test
    public void testPluMinus(){
        String l1=Grade.plusMinus(95);
        assertTrue("95 the plus minus should have been  but was:"+l1,l1.equals(""));
        String l2=Grade.plusMinus(78);
        assertTrue("78 the plus minus should have been + but was:"+l2,l2.equals("+"));
        String l3=Grade.plusMinus(62);
        assertTrue("62 the plus minus should have been - but was:"+l3,l3.equals("-"));
        String l4=Grade.plusMinus(100);
        assertTrue("100 the plus minus should have been + but was:"+l4,l4.equals("+"));
        String l5=Grade.plusMinus(2);
        assertTrue("2 the plus minus should have been  but was:"+l5,l5.equals(""));
    }
}
