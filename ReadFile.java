package fileAndURL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements Reader
{
	public int numLines;
	public String name;
	public String[] buffer = new String[1000000];
	
	@Override
	public String[] getLines() throws IOException {

		FileReader fr = new FileReader (new File (name));
		BufferedReader br = new BufferedReader (fr);
		String line;
		numLines = 0;
		while ((line = br.readLine()) != null)
		{
			buffer[numLines++] = line;
		}
		br.close();
		fr.close();
		return (buffer);
	}

	@Override
	public int getNumberOfLines() throws IOException {
		return numLines;
	}

	@Override
	public String getName() {
		return name;
	}

	public ReadFile(String fileName)
	{
		name = fileName;
	}
}