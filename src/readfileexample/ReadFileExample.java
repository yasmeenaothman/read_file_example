
package readfileexample;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class ReadFileExample {
     
//    // defalut value just with global variables 
//   static String myString;

    public static void main(String[] args) throws FileNotFoundException  {

      //String myString;
      //System.out.println(myString); // prints null
//********************************************************



File myFile = new File("yasmeen.txt"); 

Scanner myReader = new Scanner(myFile); 
       while (myReader.hasNextLine()) { 
              String data = myReader.nextLine(); 
              System.out.println(data); 
       }
 
       myReader.close(); 

// another way 
//try {
//        // code that may throw a FileNotFoundException
//File myFile = new File("yasmeen.txt"); 
//
//Scanner myReader = new Scanner(myFile); 
//       while (myReader.hasNextLine()) { 
//              String data = myReader.nextLine(); 
//              System.out.println(data); 
//       }
// 
//       myReader.close(); 
//
//    } catch (FileNotFoundException e) {
//        // code to handle the exception
//System.out.println("File not found");
//
//    }
//    
       

//********************************************************
// Generate random numbers
//        Random random = new Random();
//
//        // Generate a random integer between 0 and 9
//        int randomNumber = random.nextInt(10);
//
//        System.out.println("Random number: " + randomNumber);
//
//    Rectangle box = new Rectangle(5, 10, 20, 30);
//
//    // Move the rectangle 
//     box.translate(15, 25);
//
//    // Print information about the moved rectangle 
//     System.out.print("x: ");
//      System.out.println(box.getX());
//      System.out.println("Expected: 20");



    
    }



    
}
