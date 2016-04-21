package fileAndURL;
/**
 * 
 * @author Charles
 * 
 * Result has path, lines, number of lines, and letters
 * 
 */

public class Result
{
	private String name;
	private int numLines = 0;
	private int numWords = 0;
	private int numLetters = 0;
	private char mostPopular = '?';
	private int[] distribution = null;
	private String histogram;

	public Result (String name)
	{
		setName (name);
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getNumLines() {return numLines;}
	public void setNumLines(int numLines) {this.numLines = numLines;}
	public int getNumWords() {return numWords;}
	public void setNumWords(int numWords) {this.numWords = numWords;}
	public int getNumLetters() {return numLetters;}
	public void setNumLetters(int numLetters) {this.numLetters = numLetters;}
	public char getMostPopular() {return mostPopular;}
	public void setMostPopular(char mostPopular) {this.mostPopular = mostPopular;}
	public int[] getDistribution() {return distribution;}
	public void setDistribution(int[] distribution) {this.distribution = distribution;}
	public String getHistogram() {return histogram;}
	public void setHistogram(String histogram) {this.histogram = histogram;}	
}