package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class DuplicateLengthEncoding {
	
	public static String replace(String s, int index, int last, String replacement) {
	   return s.substring(0, index)  + replacement + s.substring(last);
	    		
	}
	
	public static String encodeDuplicates (String s) {
		
	StringBuilder sb = new StringBuilder ();
	int i=0;
		while(i<s.length()) {
			int countDuplicates=1;
			char currentChar = s.charAt(i);
			
			while (i+countDuplicates<s.length()&& s.charAt(i)==s.charAt(i+countDuplicates)) {
		
				countDuplicates++;

			}

			if (countDuplicates>1) { 
				sb.append(countDuplicates);
				
			
			}
				
			sb.append(currentChar);
				
			
			i +=countDuplicates;
			
		}
		return sb.toString();
	}
	public static void main (String args []) {
		
		String s = ConsolePrompt.readString("Introduce an string with possible duplicate characters");
		System.out.println(encodeDuplicates(s));
		
				
	}

}
