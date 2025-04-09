/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab4-01
 */
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

 class Sampler {

    public Sampler(){}
    public List<String> sampler (int reservoirSize) throws FileNotFoundException, IOException
    {
        String currentLine=null;
        //reservoirList is where our selected lines stored
        List <String> reservoirList= new ArrayList<String>(reservoirSize); 
        // we will use this counter to count the current line number while iterating
        int count=0; 

        Random ra = new Random();
        int randomNumber = 0;
        Scanner sc = new Scanner(new File("D:/function protein pair initial/Vesicular transport.txt")).useDelimiter("\n");
        
        while (sc.hasNext())
        {
            currentLine = sc.next();
            count ++;
            if (count<=reservoirSize)
            {
             
                reservoirList.add(currentLine);
                   
                
               
            }
            else if ((randomNumber = (int) ra.nextInt(count))<reservoirSize)
            {
                
                reservoirList.set(randomNumber, currentLine);
                System.out.println(count);
                
               
            }
        }
        return reservoirList;
    }
}

public class reservoirSampling {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileOutputStream out;
        Sampler mySampler = new Sampler();
        List<String> myList = mySampler.sampler(34);
        for(int index = 0;index<myList.size();index++){
            System.out.println(myList.get(index));
            out = new FileOutputStream("D:/Vesicular transport10.txt",true);
            PrintStream p = new PrintStream(out); 
            p.println(myList.get(index));
        }
  }
}        



 
