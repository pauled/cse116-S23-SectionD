package week12statePattern.studentState;

public class Chillin extends MentalState{
    public Chillin(Student student){
        super(student);
    }
    public void study(){
        System.out.println("I am such a good student I still study after passing");
    }
    public void getCloserToExam(){
        System.out.println("I don't need to take the exam, I've already passed");
    }
    public void expressFeelings(){
        System.out.println("I am done");
    }
}
