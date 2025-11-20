package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class StringReverser {
	
	public static String reverse (String s) {
		
		char [] charArray = s.toCharArray(); 
		int left=0;
		int right=s.length()-1;
		
		while (left<right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]= temp;
			left++;
			right--;
		}
		return new String(charArray);
	}
	public static void main(String [] args) {
		
		//although you can use StringBuilder(s).reverse().  I preferred to use the manual one. 
		
		String s= ConsolePrompt.readString("Introduce the String to reverse");
		System.out.println(reverse(s));
	}

}
