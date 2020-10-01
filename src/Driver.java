import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		int numLines = 0;
		while(input.hasNext())
		{
			numLines++;
			input.nextLine();
		}
		input.close();
		BibleBook[] books = new BibleBook[numLines];
		input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		int pos = 0;
		while(input.hasNext())
		{
			books[pos] = new BibleBook(input.nextLine());
			pos++;
		}
		for(BibleBook s : books)
		{
			s.display();
		}
	}
}