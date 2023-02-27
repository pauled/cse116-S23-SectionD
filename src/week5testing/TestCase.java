package week5testing;

public class TestCase {
    private int input1;
    private int input2;
    private int expectedOutput;

    public TestCase(int in1,int in2, int ex){
        this.input1=in1;
        this.input2=in2;
        this.expectedOutput=ex;
    }
    public int getInput1(){
        return this.input1;
    }
    public int getInput2(){
        return this.input2;
    }
    public int getExpectedOutput(){
        return this.expectedOutput;
    }
}
