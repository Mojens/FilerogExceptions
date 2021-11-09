package FileFunReading;// Importing input output classes
import java.io.*;
import java.util.Scanner;

public class FileFunReading {

  // Main
  public static void main(String[] args)
      throws IOException {//laver en throws IOExpection i selve metoden
FileFunReading ffr = new FileFunReading(); //Her laver jeg et objekt af klassen
ffr.run(); //Her kalder jeg på metoden i klassen
  }
  //run metode
  public void run()
      throws IOException {
    File fr = new File("text.txt"); //Siger der er en File der hedder fr som er "Text.txt"
    Scanner sc = new Scanner(fr); //Her laver jeg en scanner med filen som parmeter
    while(sc.hasNextLine()){ //Her laver jeg en while, der siger at hvis der indeholder linjer i filen
      String lines = sc.nextLine(); //så siger jeg de skal være i String
      System.out.println(lines); //Her printer jeg indeholdet af teksten ud i Strings
    }
  }
}