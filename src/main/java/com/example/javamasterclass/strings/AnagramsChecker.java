package com.example.javamasterclass.strings;

import java.util.Arrays;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class AnagramsChecker {
	
	public static boolean checkAnagrams (String s1, String s2) {

		boolean result=false;
		if(s1==null || s2==null) {
			return result;
		}
		if(s1.length()!=s2.length()) {
			return result;
		}
		
		char [] charArray1= s1.toCharArray(); 
		char [] charArray2= s2.toCharArray();
	
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1,charArray2)){
			result=true;
		}
				
		return result;	
	
	}
	
	public static void main (String [] args){
		
		String s1 = ConsolePrompt.readString("Introduce String 1");
		String s2 = ConsolePrompt.readString("Introduce String 2");
		
		System.out.println(checkAnagrams(s1, s2));
		
	}

}
