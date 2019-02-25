package charStreamsEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class LineNumbering {

	  public static void main(String[] args) throws IOException {
		  Scanner console = new Scanner(System.in);
		  System.out.println("Input file: ");
		  String inputFileName = console.next();
		  console.close();
		  
		  try (FileReader reader = new FileReader(inputFileName); Scanner in = new Scanner(reader)){
			  int lineNumber = 1;
			  
			  while (in.hasNextLine()) {
				  String line = in.nextLine();
				  System.out.println("/* " + lineNumber + " */ " + line);
				  lineNumber++;
				  }
		  }
		  System.out.print("Done!");
	  }
}
