import control.Airport;

public class TestInitializer
{
    Airport testAirport=new Airport();
    public TestInitializer()
    {
        testAirport.addAirline("Some company");
        testAirport.addPlanes(0,0,2);
        testAirport.addPlanes(0,1,1);
        testAirport.addPlanes(0,2,3);
        testAirport.addPlanes(0,5,1);
        testAirport.addPlanes(0,6,1);
    }
    public Airport getTestAirline()
    {
        return testAirport;
    }



}
