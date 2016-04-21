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
		System.out.println("------------------------- RESULT -------------------------\n");
		for (int i = 0; i < results.length; i++)
		{
			if (results[i] == null) continue;
			System.out.println("Name                : " + results[i].getName());
			System.out.println("Number of words     : " + results[i].getNumWords());
			System.out.println("Number of lines     : " + results[i].getNumLines());
			System.out.println("Number of letters   : " + results[i].getNumLetters());
			System.out.println("Most popular letter : " + results[i].getMostPopular());
			System.out.println("Letter distribution : Each asterisk represents 1%" +
				"\n\n" + results[i].getHistogram());	
		}
	}
}