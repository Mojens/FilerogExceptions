package FileWriter;

import java.io.IOException;
import java.io.*;
public class FileWriter {
  public static void main(String[] args)
      throws IOException {//laver en throws IOExpection i selve metoden
    new FileWriter().run();//Her laver jeg et objekt af klassen og kalder på metoden i klassen
  }
  public void run()
      throws IOException{//laver en throws IOExpection i selve metoden
    File file = new File("Kasper.txt"); //Laver en file objekt med navnet file hvor filen har navnet Kasper
    PrintStream fileOutput = new PrintStream(file);//Så laver jeg en PrintStream objekt med navnet fileOutPut
    //Det den gør er at jeg senere hen kan bruge denne printstream til at indtaste ting ind i min fil
    fileOutput.println("there is one line"); //Her kalder jeg på printstreamen af filen og laver en print hvor jeg
    //Indtaster det der skal være ind i filen.
    fileOutput.println("And here is the other.\n\nHere is the final line");
  }
}
