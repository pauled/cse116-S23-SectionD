package week12statePattern.hulkState;

public interface State {
    public void makeAngry();
    public void calmDown();
    public void useCar(Car car);
    public void fight();
}
