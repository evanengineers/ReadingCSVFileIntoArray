package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\I524355\\Downloads\\Sacramentorealestatetransactions.csv";
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader(path));  //using a buffered reader here as it is more faster than scanner.
        //Buffered reader class and file reader class implemented.  Also need to import IO.fileNotFound Exception as an exception should be thrown if an error occurs.
        //The buffered reader constructor also needs a reader object as a parameter which is why we constructed a new File reader there.
        //the filereader also needs a parameter so that it knows what to read. Hence the path parameter.

//        while ((line = reader.readLine()) != null) {  //This says, "while there is another line of data to be read, print it out"
//                                                        //Also the readline() could throw an IO exception hence we had to import the IOException pkg
//            System.out.println(line);
//        }

        while ((line = reader.readLine()) != null) {  //This says, "while there is another line of data to be read,add it to the array after splitting the values at the commas
            String[] values = line.split(",");  //My csv has 12 columns which will be split into 12 values and added to the array on each loop.
            System.out.println("Address: " + values[0] +" \n Zip: "+ values[2] + " \n Price: "+ values[9]);   //this prints out the address, zip and price sold for.
        }
    }
}
