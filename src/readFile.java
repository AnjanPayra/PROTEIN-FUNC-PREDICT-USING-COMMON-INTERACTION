

import java.io.*;

class readFile {
    

     static FileWriter fwr;

     static int counter=0;

public static void main(String[] args) {

    try{


  FileInputStream fstream = new FileInputStream("D:/function protein pair initial/Vesicular transport.txt");

  DataInputStream in = new DataInputStream(fstream);

  BufferedReader brl = new BufferedReader(new InputStreamReader(in));

  String inputString;

  FileOutputStream out; // declare a file output object

  PrintStream p; // declare a print stream object

  //Create a new file output stream

  out = new FileOutputStream("D:/no of proteins in functnl grp.txt",true);

  // Connect print stream to the output stream

  p = new PrintStream(out); 

  while ((inputString = brl.readLine()) != null)

  {
        counter++;
         
  }

    p.println("No of protein pair of Vesicular transport:" + " " + counter);

    p.close();

  }catch (Exception e){//Catch exception if any

  System.err.println("Error: " + e.getMessage());

  }

}

}
