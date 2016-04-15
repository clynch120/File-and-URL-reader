package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * Driver class to use other classes
 * 
 */
import java.io.IOException;


public class Driver 
{

	public static void main(String[] args) throws IOException 
	{
		MakeReader a = new MakeReader();
		a.read();
	}

}
