package fileAndURL;

import java.io.IOException;
/**
 * 
 * @author Charles
 * 
 * Reader interface that outlines all 
 * Implements of Reader
 * 
 */
public interface Reader 
{
	public String [] getLines() throws IOException;
	public int getNumberOfLines() throws IOException;
	public String getName();
}