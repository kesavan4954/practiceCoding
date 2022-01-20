package stringHandling;

import java.io.*;

public class StringVowels {

	public static void main(String[] args) 
	       throws IOException
	{
		 String str = "AjithKesavan";
		  
         str = str.toLowerCase();

     // toCharArray() is used to convert 
     // string to char array
     char[] chars = str.toCharArray();

     int count = 0;

     for (int i = 0; i < str.length(); i++)
     {
         // check if char[i] is vowel
         if (str.charAt(i) == 'a' || str.charAt(i) == 'h'
             || str.charAt(i) == 'j'
             || str.charAt(i) == 'i'
             || str.charAt(i) == 't')
         {
             // count increments if there is vowel in
             // char[i]
             count++;
         }
     }

     // display total count of vowels in string
     System.out.println("Total no of vowels in string are: " + count);
 }
}