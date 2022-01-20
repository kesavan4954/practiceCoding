package stringHandling;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String originalString = sc.nextLine();
		
		//convert string to character array
		char ch[]=originalString.toCharArray();
		
		// reversing the string
		String reverseString="";
		for(int i=ch.length-1;i>=0;i--) {
		 reverseString+=ch[i];
	}
	
	//checking palindrome
	if(originalString.equals(reverseString)) {
		System.out.println("\n"+originalString+" is a Palindrome String ");
	}else {
		System.out.println(""+originalString+" is Not a Palindrome String ");
	}

	}

}
