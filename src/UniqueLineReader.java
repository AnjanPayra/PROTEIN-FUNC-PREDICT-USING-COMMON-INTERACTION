
import java.io.*;

import java.util.HashSet;

import java.util.Set;


public class UniqueLineReader extends BufferedReader {

    Set<String> lines = new HashSet<String>();

     static FileWriter fwr;


    public UniqueLineReader(Reader arg0) {

        super(arg0);
    }


    @Override

    public String readLine() throws IOException {

        String uniqueLine;

        if (lines.add(uniqueLine = super.readLine()))

            return uniqueLine;

        return "";

    }

  //for testing.. 


    public static void main(String args[]) {
        
        //int counter=0;

        try {

            // Open the file that is the first

            // command line parameter

            FileInputStream fstream = new FileInputStream("D:/Cell cycle control.txt");

            // Get the object of DataInputStream

            DataInputStream in = new DataInputStream(fstream);

            UniqueLineReader br = new UniqueLineReader(new InputStreamReader(in));

            String strLine;

            FileOutputStream out; // declare a file output object

            PrintStream p; // declare a print stream object

            //Create a new file output stream

            out = new FileOutputStream("D:/Cell cycle control after rmnvg slf rplctn.txt",true);

            // Connect print stream to the output stream

            p = new PrintStream(out); 

            // Read File Line By Line

            while ((strLine = br.readLine()) != null) {

                // Print the content on the console

                if (strLine != "")

                    p.println(strLine);
                
                //counter++;

            }
            
            //System.out.println("time"+counter);

            // Close the input stream

            in.close();

            p.close();

        } catch (Exception e) {// Catch exception if any

            System.err.println("Error: " + e.getMessage());

        }

    }


}
