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

	public String name;
	public int numLines;
	public String[] buffer = new String[1000000];
	
	
	@Override
	public String[] getLines() throws IOException 
	{
		
		URL url = new URL(name);
		InputStreamReader isr = new InputStreamReader (url.openStream());
		BufferedReader br = new BufferedReader (isr);
		String line;
		numLines = 0;
		while ((line = br.readLine()) != null)
		{
			buffer[numLines++] = line;
		}
		br.close();
		isr.close();
		return (buffer);
	}

	@Override
	public int getNumberOfLines() throws IOException 
	{
		return numLines;
	}

	@Override
	public String getName() 
	{
		return name;
	}

	public URLReader (String webSite) throws IOException
	{
		name = webSite;
	}
}