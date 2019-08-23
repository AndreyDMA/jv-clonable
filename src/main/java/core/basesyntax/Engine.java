package core.basesyntax;

public class Engine {
    private String fuelType;
    private double volume;
    private double fuelCons;
    private int numberOfCyl;
    private int maxTorque;

    public Engine () {

    }

    public Engine(String fuelType, double volume, double fuelCons, int numberOfCyl, int maxTorque) {
        this.fuelType = fuelType;
        this.volume = volume;
        this.fuelCons = fuelCons;
        this.numberOfCyl = numberOfCyl;
        this.maxTorque = maxTorque;

    }

    protected void installEngine() {
        System.out.println("Engine is installed");
    }
}
