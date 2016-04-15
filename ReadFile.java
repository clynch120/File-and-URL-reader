package fileAndURL;
/**
 * 
 * @author Charles	
 * 
 * File Reader reads all strings from a file
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements Reader
{

	@Override
	public String[] getLines() throws IOException 
	{
		return null;
	}

	@Override
	public int getNumberOfLines() throws IOException 
	{
		return 0;
	}

	@Override
	public String getName() 
	{
		return null;
	}
	
	public static void readFile () throws IOException
	{
		
	}
	
}
