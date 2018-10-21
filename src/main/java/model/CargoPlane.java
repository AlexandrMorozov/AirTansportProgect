package model;

public class CargoPlane extends Plane
{
    public CargoPlane(FullPlaneName fullNameOfPlane,int ...planeCharacteristics)
    {
        super(fullNameOfPlane,planeCharacteristics[0],planeCharacteristics[1],planeCharacteristics[2]);
    }
}
