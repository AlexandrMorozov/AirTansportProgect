package model;
import org.apache.log4j.Logger;
import java.util.*;


public class Airline
{
    private static final Logger logging = Logger.getLogger(Airline.class);

    private String companyName;
    private List<Plane> listOfPlanes;
    public Airline(String companyName)
    {
        this.companyName=companyName;
        listOfPlanes =new ArrayList<Plane>();
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public int getTotalCargoWeight()
    {
        int cargoCapacitySum=0;
        for(int i = 0; i< listOfPlanes.size(); i++)
        {
            cargoCapacitySum=cargoCapacitySum+ listOfPlanes.get(i).getCargoCompartmentVolume();
        }
        return  cargoCapacitySum;
    }
    public int getTotalPassengerSeats()
    {
        int passengerCapacitySum = 0;
        for (int i = 0; i < listOfPlanes.size(); i++)
        {
            if (listOfPlanes.get(i) instanceof PassengerPlane)
            {
                PassengerPlane dup = (PassengerPlane) listOfPlanes.get(i);
                passengerCapacitySum = passengerCapacitySum + dup.getNumberOfSeats();
            }
        }
        return passengerCapacitySum;
    }
    public List<Plane> getPlanesByFuelConsumption(int lowBorder, int highBorder)
    {
        List<Plane> planesInRangeOfFuelConsumption=new ArrayList<Plane>();
        for(int i = 0; i < listOfPlanes.size(); i++)
        {
            if(listOfPlanes.get(i).averageFuelConsumption>=lowBorder && listOfPlanes.get(i).averageFuelConsumption<=highBorder)
            {
                planesInRangeOfFuelConsumption.add(listOfPlanes.get(i));
            }
        }
        return planesInRangeOfFuelConsumption;
    }
    public List<Plane> sortByFlightRange()
    {
        Collections.sort(listOfPlanes);
        return listOfPlanes;
    }

    public void createPlanes(String[] typeOfPlane, int numberOfPlanes)
    {
        for(int i=0;i<numberOfPlanes;i++)
        {
            int[] convertedValues=convertValues(typeOfPlane);
            try
            {
                FullPlaneName fullNameOfPlane=new FullPlaneName(typeOfPlane[0],typeOfPlane[1],typeOfPlane[2]);

                if(typeOfPlane[0].equals("P")==true)
                {
                    listOfPlanes.add(new PassengerPlane(fullNameOfPlane,convertedValues[0],convertedValues[1],convertedValues[2],convertedValues[3]));
                }
                else if(typeOfPlane[0].equals("T")==true)
                {
                    listOfPlanes.add(new CargoPlane(fullNameOfPlane,convertedValues[0],convertedValues[1],convertedValues[2]));
                }
            }
            catch (IllegalArgumentException e)
            {
                logging.error("Illegal number of arguments in planesGenerator");
            }

        }

    }
    private int[] convertValues(String[] modelOfPlane)
    {
        int[] convertedValues=new int[modelOfPlane.length-4];
        int counter=0;
        for(int u=4;u<modelOfPlane.length;u++)
        {
            try
            {
                convertedValues[counter]=Integer.valueOf(modelOfPlane[u]);
                counter++;
            }
            catch (Exception e)
            {
                logging.error("Conversion of values has failed");
            }
        }
        return convertedValues;
    }
    public List<Plane> getListOfPlanes()
    {
        return listOfPlanes;
    }

}

