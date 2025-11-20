package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

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
		
		String word = ConsolePrompt.readString("Please enter the word to check");
		System.out.println(word + " is " +  (check(word) ? "palindrome" : "not a palindrome"));
		
	  }
}
