package practiceCoding;
import java.util.Scanner;

public class PascalTraingle {

	public static void main(String[] args) {
		int row , r , c ;
		// creating object
		Scanner sc=new Scanner(System.in);
		// entering no.of rows
		System.out.print("Enter Row : ");
		row=sc.nextInt();
		for (r=0; r<= row -1; r++)
		{ //printing stars
			for (c=0; c<=r; c++)
				System.out.print("* ");
			//taking the new line
			System.out.println("");
		}
		
		for (r=row-1; r>=0; r--)
		{
			//printing stars
			for (c=0; c <= r-1;c++)
				System.out.print("* ");
			// taking to the new line
			System.out.println("");
		}
	}
				
		}		
