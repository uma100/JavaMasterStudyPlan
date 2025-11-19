package com.example.javamasterclass.strings;

import java.util.Scanner;

public class PalindromeChecker {
	
	public static boolean check (String s) {
		if (s==null) {
			return false;
		}

		int i=0;
		int j=s.length()-1;
		char [] charArr = s.toCharArray();
		
		while (i<j) {
			if(Character.toLowerCase(charArr[i])!=Character.toLowerCase(charArr[j])) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the word to check ");
			String word = scanner.nextLine(); // Read a line of text
			System.out.println(word + " is " + 
					    (check(word) ? "palindrome" : "not a palindrome")
					);
		  }
		  		        
	    }

}
