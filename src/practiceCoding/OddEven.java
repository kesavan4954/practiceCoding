package practiceCoding;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number, remainder;
		System.out.println("Plz Enter the Number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		remainder = number % 2;
		
	if (remainder == 0)
		System.out.println(number + " is an Even number");
	else
		System.out.println(number + " is an Odd number");
		
		

	}

}
