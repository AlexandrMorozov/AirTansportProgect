import model.PlaneTypeStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReceivedDataTest extends Assert
{
    PlaneTypeStorage receivedData =new PlaneTypeStorage();
    @Test
    public void presenceOfArrayTest()
    {
        int answer= receivedData.getListOfPlaneTypes().size();
        Assert.assertNotEquals(answer,0);
    }
    @Test
    public void splitCorrectnessTest()
    {
        boolean flag=true;
        for(int i = 0; i< receivedData.getListOfPlaneTypes().size(); i++)
        {
            if(receivedData.getListOfPlaneTypes().get(i).length<7)
            {
                flag=false;
            }
            Assert.assertTrue(flag);
        }
    }
    @Test
    public void dataCorrectnessTest()
    {
        boolean flag=true;
        for(int i = 0; i< receivedData.getListOfPlaneTypes().size(); i++)
        {
            if(receivedData.getListOfPlaneTypes().get(i)[0].equals("T")==false && receivedData.getListOfPlaneTypes().get(i)[0].equals("P")==false)
            {
                flag=false;
                Assert.assertTrue(flag);
            }
        }
    }

}
