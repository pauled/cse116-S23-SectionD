package week13AdvancedAlg;

public class FlightPrice implements Cost<Flight>{
    public double cost(Flight flight){
        return flight.getPrice();
    }
}
