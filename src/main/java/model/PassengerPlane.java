package model;


public class PassengerPlane extends Plane
{
    protected int numberOfSeats;
    public PassengerPlane(FullPlaneName fullNameOfPlane,int ... planeCharacteristics)
    {
        super(fullNameOfPlane,planeCharacteristics[0],planeCharacteristics[1],planeCharacteristics[3]);
        this.numberOfSeats=planeCharacteristics[2];
    }
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }
}