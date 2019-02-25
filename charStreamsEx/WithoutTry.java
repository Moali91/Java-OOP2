package charStreamsEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class WithoutTry {

	  public static void main(String[] args) throws IOException {
		  Scanner console = new Scanner(System.in);
		  System.out.println("Input file: ");
		  String inputFileName = console.next();
		  System.out.println("Output file: ");
		  String outputFileName = console.next();
		  console.close();
		  
		  PrintWriter writer = new PrintWriter(outputFileName);

		  FileReader reader = new FileReader(inputFileName);
		  Scanner in = new Scanner(reader);
		  int lineNumber = 1;
			  
			  while (in.hasNextLine()) {
				  String line = in.nextLine();
				  System.out.println("/* " + lineNumber + " */ " + line);
				  writer.println("/* " + lineNumber + " */ " + line);
				  lineNumber++;
				  }
		  
		  writer.close();
		  System.out.print("Done!");
	  }
}
