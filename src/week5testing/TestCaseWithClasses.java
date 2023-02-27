package week5testing;

import org.junit.Test;
import week2.FirstRecursion;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCaseWithClasses {

    @Test
    public void testAddition(){
        ArrayList<TestCase> testCases=new ArrayList<>();
        testCases.add(new TestCase(2,2,4));
        testCases.add(new TestCase(-5,2,-3));
        testCases.add(new TestCase(10,-10,0));

        for (TestCase testCase : testCases){
            int expected=testCase.getExpectedOutput();
            int computed= FirstRecursion.add(testCase.getInput1(),testCase.getInput2());
            assertEquals("case in1:"+testCase.getInput1()+" "+
                    "in2: "+testCase.getInput2(),expected,computed);
        }
    }
}
