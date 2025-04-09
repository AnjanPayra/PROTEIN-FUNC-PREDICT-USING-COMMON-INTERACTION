
import java.io.*;
import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab4-02
 */
public class level111 {
    
    public static void main(String[] args) throws IOException
     {
         int z=0;
         
         String inputString1,inputString2;
         
         FileInputStream fstream1 = new FileInputStream("D:/random 10 after splitting/Lipid metabolism10 after splitting.txt");
 
         Scanner scanner1 = new Scanner(fstream1);
         
         
         
         while (scanner1.hasNextLine())
         {
             //scanner1 = new Scanner(fstream2);
             //count++;
             
             inputString1=scanner1.nextLine();
             if(inputString1!=null){
             //System.out.println(inputString1);
             
             //String[] tokens1 = inputString1.split("\\|");
             
             //System.out.println(tokens1);
             
              //int numTokens1 = tokens1.length;
              
             //z++;
              
              //scanner2 = new Scanner(fstream2);
              
              //for(int i=0;i<count;i++)
             // {
                   //scanner2 = new Scanner(fstream2);
             
                                
                  FileOutputStream out=new FileOutputStream("D:/level 1 of unknown protein pair/Lipid metabolism/"+inputString1+"file"+z+".txt",true);  
                  z++;
                         //System.out.println(z);
                  PrintStream p=new PrintStream(out);
               
                  //br2 = new BufferedReader(new InputStreamReader(in2));
                  FileInputStream fstream2 = new FileInputStream("D:/original dataset.txt");
 
               Scanner scanner2= new Scanner(fstream2);
                  
               while (scanner2.hasNextLine())
                  {
                   
                   inputString2=scanner2.nextLine();  
                      
                  String[] tokens2 = inputString2.split("\\|");
             
                   //System.out.println(tokens2);
             
                    int numTokens2 = tokens2.length;
  
                   //System.out.println(numTokens1);
                 
                    for(int j=0;j<numTokens2;j++)
                    {
                     
                     //System.out.println(numTokens2);
                 
                     if((inputString1).equals(tokens2[j]))
                      {               
                         //System.out.println("Writing file"+z); 
                         p.println(tokens2[0] + "|" + tokens2[2]+ "|" + tokens2[4]);                        
                      }
                    }  
                 
                 }
             
              scanner2.close();
             fstream2.close();
             }  
                     //br2.close();
                //   p.close();    
                  // out.close();
             // z++;
         }   
              
         }
         //fstream2.close();
}  //fstream1.close();
     
    

