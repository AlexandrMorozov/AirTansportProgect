package control;

import model.Airline;
import model.Plane;
import model.PlaneTypeStorage;

import java.util.ArrayList;
import java.util.List;

public class Airport
{
    private PlaneTypeStorage typesOfPlanes=new PlaneTypeStorage();
    private ArrayList<Airline> allAirlines=new ArrayList<Airline>();

    public void addAirline(String name)
    {
        allAirlines.add(new Airline(name));
    }
    public void addPlanes(int companyIndex,int modelIndex,int numberOfPlanes)
    {
        allAirlines.get(companyIndex).createPlanes(typesOfPlanes.getListOfPlaneTypes().get(modelIndex),numberOfPlanes);
    }
    public int countTotalCargoWeight(int companyIndex)
    {
        return allAirlines.get(companyIndex).getTotalCargoWeight();
    }
    public int cuntTotalPossiblePassengers(int companyIndex)
    {
        return allAirlines.get(companyIndex).getTotalPassengerSeats();
    }
    public List<Plane> findByFuelConsumption(int lowBorder,int highBorder,int companyIndex)
    {
        return allAirlines.get(companyIndex).getPlanesByFuelConsumption(lowBorder,highBorder);
    }
    public void sortByFlightRange(int companyIndex)
    {
        allAirlines.get(companyIndex).sortByFlightRange();
    }
    public List<Plane> getPlanes(int companyIndex)
    {
        return allAirlines.get(companyIndex).getListOfPlanes();
    }
    public String getAirlineName(int companyIndex)
    {
        return allAirlines.get(companyIndex).getCompanyName();
    }

}
