package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * URL Reader reads all strings from a valid URL
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader implements Reader
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
	
	public static void readURL () throws IOException
	{
		MakeReader mr = new MakeReader();
		//String ifURL = mr.);
		//if (ifURL == "http")
		{
			
		}
	}
	
}
