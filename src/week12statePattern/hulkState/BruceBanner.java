package week12statePattern.hulkState;

public class BruceBanner {
    private State state=new DrBanner(this);

    public void setState(State state){
        this.state=state;
    }
    public void makeAngry(){
        this.state.makeAngry();
    }
    public void calmDown(){
        this.state.calmDown();
    }
    public void useCar(Car car){
        this.state.useCar(car);
    }
    public void fight(){
        this.state.fight();
    }
    public void learnControl(){
        this.state=new ProfessorHulk(this);
    }

    public static void main(String[] args) {
        Car car=new Car();
        BruceBanner bruce=new BruceBanner();
        bruce.fight();
        bruce.makeAngry();
        bruce.fight();

        bruce.useCar(car);
        bruce.makeAngry();
        bruce.useCar(car);
        bruce.learnControl();
        bruce.fight();
    }
}
