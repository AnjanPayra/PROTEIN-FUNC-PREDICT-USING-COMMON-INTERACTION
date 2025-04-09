
import java.io.*;

public class StringSplit

{

    static FileWriter fwr;

public static void main(String[] args) {

    try{

  FileInputStream fstream = new FileInputStream("D:/Random 10/Vesicular transport10.txt");

  DataInputStream in = new DataInputStream(fstream);

  BufferedReader br = new BufferedReader(new InputStreamReader(in));

  String inputString;//=br.readLine();

 FileOutputStream out; // declare a file output object

PrintStream p; // declare a print stream object

//Create a new file output stream

out = new FileOutputStream("D:/random 10 after splitting/Vesicular transport10 after splitting.txt",true);

// Connect print stream to the output stream

p = new PrintStream(out); 

  while ((inputString = br.readLine()) != null)

  {

//System.out.println("Splitting...");

String[] tokens = inputString.split("\\|");

int numTokens = tokens.length;

//p.println("Number of token " + numTokens);

for (int i = 0; i < numTokens; i++) {

try {
p.println(tokens[i]);
} catch (Exception e) {

System.err.println("Error writing to file");

}

}
  }

    p.close();

  }catch (Exception e){//Catch exception if any

  System.err.println("Error: " + e.getMessage());

  }

}

}

