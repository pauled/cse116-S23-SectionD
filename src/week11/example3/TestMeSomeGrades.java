package week11.example3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMeSomeGrades {
    @Test
    public void testGrades() {
        HashMap<Integer, String> expected=new HashMap<>();
        expected.put(100,"A+");
        expected.put(97,"A+");
        expected.put(96,"A");
        expected.put(93,"A");
        expected.put(92,"A-");
        expected.put(90,"A-");
        expected.put(89,"B+");
        expected.put(87,"B+");
        expected.put(86,"B");
        expected.put(83,"B");
        expected.put(82,"B-");
        expected.put(80,"B-");
        expected.put(79,"C+");
        expected.put(77,"C+");
        expected.put(76,"C");
        expected.put(73,"C");
        expected.put(72,"C-");
        expected.put(70,"C-");
        expected.put(69,"D+");
        expected.put(67,"D+");
        expected.put(66,"D");
        expected.put(63,"D");
        expected.put(62,"D-");
        expected.put(60,"D-");
        expected.put(59,"F");
        expected.put(52,"F");
        expected.put(24,"F");
        expected.put(0,"F");
        expected.put(-1,"Invalid Grade");
        expected.put(-5,"Invalid Grade");
        expected.put(101,"Invalid Grade");
        expected.put(1000,"Invalid Grade");

        for (Integer score: expected.keySet()){
            String actual=ComputingGrades.computeGrade(score);
            assertEquals("score: "+score,expected.get(score),actual);
        }
    }
}
