package fileAndURL;
/**
 * @author Charles
 * Make the list of files for FileReader or URLReaker 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MakeReader 
{
	
	public static String [] read() throws IOException
	{
		String s;
		int i = 0;
		String [] a = new String [10];
		String fileList = "C:\\Users\\Charles\\Desktop\\file.txt";

		FileReader fr = new FileReader(new File (fileList));
		BufferedReader br = new BufferedReader(fr);
		while ((s = br.readLine()) != null)
		{
			s = s.toLowerCase();
			if (s.startsWith("h") || s.startsWith("f"))
			{
				a[i] = s;
				i++;
			}
			System.out.println(s);
			System.out.println(a[i]);
		}
		System.out.println(a);
		fr.close();
		br.close();
		return a;

	}
}
