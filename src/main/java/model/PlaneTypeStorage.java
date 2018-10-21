package model;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class PlaneTypeStorage
{
    private static final Logger LOG=Logger.getLogger(PlaneTypeStorage.class);
    ArrayList<String[]> listOfPlaneTypes=new ArrayList<String[]>();
    public PlaneTypeStorage()
    {
        try
        {
            //ReceivePlaneTypes();
            parser( ReceivePlaneTypes());
            //LOG.info("343454657");
        }
        catch (Exception e)
        {
            LOG.error("Wrong file address");
        }

    }
    private /*void */ArrayList<String> ReceivePlaneTypes() throws Exception
    {
        ArrayList<String> bufferList=new ArrayList<String>();
        File typeFile=new File("src/main/resources/Planes.txt");
        FileReader readFile=new FileReader(typeFile);
        Scanner scan=new Scanner(readFile);
        while (scan.hasNextLine())
        {
            bufferList.add(scan.nextLine());
            //listOfPlaneTypes.add(ParseString(scan.nextLine()));
        }
        readFile.close();
        return bufferList;
    }
    private void parser(ArrayList<String> bufferList)
    {
        for(int i=0;i<bufferList.size();i++)
        {
            listOfPlaneTypes.add(ParseString(bufferList.get(i)));
        }
    }

    private String[] ParseString(String string)
    {
        return string.split(" ");
    }

    public ArrayList<String[]> getListOfPlaneTypes()
    {
        return listOfPlaneTypes;
    }
}
