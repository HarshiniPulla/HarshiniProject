package javaproject;
import java.io.File;
import java.util.Scanner;

public class stud_tt {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\Users\\harsh\\Desktop\\CSD.csv"));
		sc.useDelimiter(","); // sets the delimiter pattern
		while (sc.hasNext()) // returns a boolean value
		{
			System.out.print(sc.next()+" "); // find and returns the next complete token from this scanner
		}
		sc.close(); // closes the scanner

	}

}
