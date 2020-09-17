import java.io.*;
import java.util.*;

public class importer {

  public static String importFile(String fileName) {

    String rawData = "";

    // Open the created file and read from it
    try {
      // Connect to the file
      FileReader fr = new FileReader(fileName);
      // Attach a buffer to the file
      BufferedReader br = new BufferedReader(fr);

      // Read a line of data from the file
      String line = br.readLine();
      // Loop until no more lines are in the file
      while (line != null) {
        // Print out the line you read in (just to
        // show that it's working)
        rawData += (line + ",");
        // Get the next line
        line = br.readLine();
      }
      // Close the buffer and file; if you don't do
      // this, they will be "locked" and other code
      // won't be able to use the file correctly
      br.close();
      fr.close();
    } catch (Exception ex) {
      // If an error occurs, this code will run
      System.out.println(ex.getMessage());
    }

    return rawData;

  }

  static void dataSplitter(String rawData){
    
    String[] splitData = rawData.split("\",\"");
    //Remove last quote
    splitData[splitData.length - 1] = splitData[splitData.length - 1].substring(0,splitData[splitData.length - 1].length()-2);
    


    //Import data into array list
    ArrayList<infection> infected = new ArrayList(1600);
    for(int i = 7; i < splitData.length; i = i+7){
        infection temp = new infection(Integer.parseInt(splitData[i]),splitData[i+1],splitData[i+2],splitData[i+3],splitData[i+4],splitData[i+5],splitData[i+6]);
        infected.add(temp);
    }
    
  }
}