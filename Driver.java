package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * Driver class to use other classes
 * 
 */

import java.io.IOException;
import java.util.Scanner;

public class Driver 
{
	public static void showWelcome ()
	{
		System.out.println("Welcome to the letter and word counter / frequency chart");
		System.out.println("Copyright © 2016 Charles Lynch");
		System.out.println();
	}

	public static String getInput (String message, String defaultValue)
	{
		Scanner scanner = new Scanner (System.in); 
		System.out.print(message + " (default " + defaultValue + "): ");
		String input = scanner.nextLine();
		scanner.close();
		if (input.trim().length() == 0) return (defaultValue);
		else return input.trim();
	}

	public static void main (String[] args) throws IOException
	{
		showWelcome ();
		String fileContainingList = getInput ("Enter filename containing list", "C:\\list.txt");
		try
		{
			MakeReader readerMaker = new MakeReader (fileContainingList);
			Analyzer analyzer = new Analyzer (readerMaker.readers);
			new PrintResult (analyzer.getResult ());    
			System.out.println("Done");
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}