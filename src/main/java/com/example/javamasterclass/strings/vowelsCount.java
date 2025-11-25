package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class vowelsCount {
	
	
	
	public static int[]  countVowels (String s1) {
		
		int vowelCounts [] = new int[5];
	 
		for (int i=0; i<s1.length(); i++) {
			switch (Character.toLowerCase(s1.charAt(i))) {
		    	case 'a' -> vowelCounts[0]++;
		    	case 'e' -> vowelCounts[1]++;
		    	case 'i' -> vowelCounts[2]++;
		    	case 'o' -> vowelCounts[3]++;
		    	case 'u' -> vowelCounts[4]++;
	    
			}
		 }

		return vowelCounts;
	}
	public static void main (String args[ ]) {
		
		String s= ConsolePrompt.readString ("Introduce a string to evaluate");
		
		int [] totalVowels= countVowels (s);
		int i =1; 
		
		for (int vc: totalVowels) {
			switch (i) {
				case 1 -> System.out.println( "a: " + vc);
				case 2 -> System.out.println( "e: " + vc);
				case 3 -> System.out.println( "i: " + vc);
				case 4 -> System.out.println( "o: " + vc);
				case 5 -> System.out.println( "u: " + vc);
			}
			i++;
		}
	
	}

}
