/*
 * count.java
 *
 * Created on July 18, 2011, 12:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.io.*;

class count {
    
     
//static FileWriter fwr;
     
//static int counter=0;

public static void main(String[] args) {
    
    //int counter=0;
   
 try{
 
 System.out.println("enter some string:");
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
 String str=br.readLine();
 
 FileInputStream fstream = new FileInputStream("D:/original dataset.txt");
 
 DataInputStream in = new DataInputStream(fstream);
  
 BufferedReader brl = new BufferedReader(new InputStreamReader(in));
  
 String inputString=brl.readLine();
  
FileOutputStream out; // declare a file output object
  
PrintStream p; // declare a print stream object
  
//Create a new file output stream
 
 out = new FileOutputStream("D:/Cell cycle control.txt",true);

 // Connect print stream to the output stream
  
p = new PrintStream(out); 
  
while ((inputString = brl.readLine()) != null)

  {

  String[] tokens = inputString.split("\\|");

  int numTokens = tokens.length;

  for (int i = 0; i < numTokens; i++) {

  try {
          if(tokens[i].equals(str))
          {
            p.println(tokens[0] + "|" + tokens[2]);
            //counter++;
          }
            
  } catch (Exception e) {

  System.err.println("Error");

  }
  
  //System.out.println("time"+counter);

  }

  }

    p.close();

  }catch (Exception e){//Catch exception if any

  System.err.println("Error: " + e.getMessage());

  }
}

}