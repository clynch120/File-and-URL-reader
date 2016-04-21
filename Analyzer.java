package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * Analyzer will go over array in Driver
 * 
 */
import java.io.IOException;

public class Analyzer
{
	public static final int TOTAL_LETTERS_IN_ALPHABET = 26;

	private Result[] result = null;

	public void determineWordsAndLetters (String[] lines, int totalLines, Result result)
	{
		int words = 0;
		int letters = 0;
		int[] dist = new int[TOTAL_LETTERS_IN_ALPHABET];

		for (int i = 0; i < totalLines; i++)
		{
			String[] tokens = lines[i].split("[^\\w]+");
			for (int k = 0; k < tokens.length; k++)
			{
				String word = tokens[k].trim().toLowerCase();
				if (word.length() > 0)
				{
					words++;
					for (int f = 0; f < word.length(); f++) 
					{
						char ch = word.trim().charAt(f);
						if (Character.isLetter(ch))
						{
							dist[ch - 'a']++;
							letters++;
						}
					}
				}
			}
		}

		result.setNumWords(words);
		result.setNumLetters(letters);
		result.setDistribution(dist);

	}

	public void determineMostPopularLetter (Result result)
	{
		int highest = 0;
		int index = 0;
		if (result.getDistribution() == null) result.setMostPopular(' ');
		for (int i = 0; i < result.getDistribution().length; i++)
		{
			if (result.getDistribution()[i] > highest)
			{
				highest = result.getDistribution()[i];
				index = i;
			}
		}
		result.setMostPopular((char) ('A' + index));
	}

	public void determineLetterDistribution (Result result)
	{
		StringBuffer sb = new StringBuffer ();
		int highest = 0;
		for (int i = 0; i < result.getDistribution().length; i++)
			if (result.getDistribution()[i] > highest) highest = result.getDistribution()[i];
		for (int i = 0; i < TOTAL_LETTERS_IN_ALPHABET; i++)
		{
			sb.append((char) ('A' + i));
			sb.append("|");
			int numStars = result.getDistribution()[i] * 100 / result.getNumLetters();
			for (int k = 0; k < numStars; k++) sb.append("*");;
			if (numStars > 0) sb.append(" " + numStars + "%");
			sb.append("\n");
		}
		result.setHistogram(sb.toString());
	}

	public Analyzer (Reader[] readers) throws IOException
	{
		result = new Result[readers.length];
		for (int i = 0; i < readers.length; i++)
		{
			if (readers[i] == null) continue; 
			System.out.println ("Processing " + readers[i].getName ());
			result[i] = new Result (readers[i].getName());
			String[] rawLines = readers[i].getLines();
			result[i].setNumLines(readers[i].getNumberOfLines());

			determineWordsAndLetters (rawLines, readers[i].getNumberOfLines(), result[i]);
			determineMostPopularLetter (result[i]);
			determineLetterDistribution (result[i]);
		}	
	}

	public Result[] getResult ()
	{
		return result;
	}
}