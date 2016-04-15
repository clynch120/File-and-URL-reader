package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * Prints the results from files and web pages
 */
public class PrintResult 
{
	public PrintResult (Result[] results)
	{
		System.out.println();
		System.out.println("------------------------RESULT------------------------");
		for (int i = 0; i < results.length; i++)
		{
			System.out.println("Name " + results[i].name);
			System.out.println("Number of words " + results[i].numWords);
			System.out.println("Number of lines " + results[i].numLines);
			System.out.println("Number of letters " + results[i].numLetters);
			System.out.println("Most popular letter " + results[i].mostPop);
			System.out.println("Letter distribution : Each asterisk represents 1 % \n\n" + results[i].histogram);
		}
	}
}
