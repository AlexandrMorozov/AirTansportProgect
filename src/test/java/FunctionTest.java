import model.Plane;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class FunctionTest
{
    TestInitializer initializeTest =new TestInitializer();
    @Test
    public void passengerCapacityTest()
    {
        int expectedAnswer=2016;
        int answer= initializeTest.getTestAirline().cuntTotalPossiblePassengers(0);
        Assert.assertEquals(answer,expectedAnswer);
    }
    @Test
    public void cargoCapacityTest()
    {
        int expectedAnswer=390922;
        int answer= initializeTest.getTestAirline().countTotalCargoWeight(0);
        Assert.assertEquals(answer,expectedAnswer);
    }
    @Test
    public void fuelRangeTest()
    {
        List<Plane> expectedAnswer=new ArrayList<Plane>();
        expectedAnswer.add(initializeTest.getTestAirline().getPlanes(0).get(2));
        expectedAnswer.add(initializeTest.getTestAirline().getPlanes(0).get(6));
        List<Plane> actualAnswer= initializeTest.getTestAirline().findByFuelConsumption(11000,12000,0);
        Assert.assertEquals(actualAnswer,expectedAnswer);

    }

}
