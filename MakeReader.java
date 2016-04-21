package fileAndURL;
/**
 * @author Charles
 * 
 * Make the list of files for FileReader or URLReaker 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MakeReader 
{
	
	public Reader[] readers = new Reader[100];
	public int total = 0;
	
	public MakeReader(String fileToUse) throws IOException
	{
		String s;
		FileReader fr = new FileReader(new File (fileToUse));
		BufferedReader br = new BufferedReader(fr);
		
		while ((s = br.readLine()) != null)
		{
			s = s.toLowerCase();
			if (s.startsWith("#")) continue;
			if (s.startsWith("http"))
			{
				readers[total++] = new URLReader(s);
				//System.out.println(s);
			}
			else if (s.startsWith("c:"))
			{
				readers[total++] = new ReadFile(s);
				System.out.println(s);
			}
		}
		fr.close();
		br.close();
	}
}
