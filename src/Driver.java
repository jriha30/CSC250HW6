import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		BibleBook[] ar = new BibleBook[27];
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		for(int i = 0; i < ar.length; i++)
		{
			while(input.hasNext())
			{
				BibleBook a = new BibleBook(input.nextLine());
				ar[i] = a;
				break;
			}
		}
		for(BibleBook s : ar)
		{
			s.display();
		}
	}
}