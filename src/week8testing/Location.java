package week8testing;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude,double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }
    public double getLatitude(){
        return this.latitude;
    }
    public double getLongitude(){
        return this.longitude;
    }
}
