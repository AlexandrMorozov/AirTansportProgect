package model;


public abstract class Plane implements Comparable<Plane>
{
    protected int averageFuelConsumption;
    protected int rangeOfFlight;
    protected int cargoCompartmentVolume;
    protected FullPlaneName fullNameOfPlane;
    public Plane(FullPlaneName fullNameOfPlane,int ... planeCharacteristics)
    {
        this.fullNameOfPlane=fullNameOfPlane;
        this.averageFuelConsumption=planeCharacteristics[0];
        this.rangeOfFlight = planeCharacteristics[1];
        this.cargoCompartmentVolume=planeCharacteristics[2];
    }
    public int compareTo(Plane plane)
    {
        return this.rangeOfFlight-plane.rangeOfFlight;
    }
    public int getCargoCompartmentVolume()
    {
        return cargoCompartmentVolume;
    }

}