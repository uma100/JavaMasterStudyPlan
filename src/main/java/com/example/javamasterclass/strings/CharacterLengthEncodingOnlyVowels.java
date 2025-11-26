package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class CharacterLengthEncodingOnlyVowels {
	
	public static String characterLengthEncodeVowels (String s) {
		
		int i=0;
		StringBuilder sb= new StringBuilder ("");
		
		//using a charArray will have better performance than charAt. 
		while (i<s.length()) {
			int count=0;
		
			while (i+count<s.length() && isAVowel(s.charAt(i)) && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(i+count))) {
				count ++;
			}
			if(count>1) {
				sb.append(count).append(s.charAt(i));
				i=i+count;
			}else {
				sb.append(s.charAt(i));
				i++;
			}
		}		
		
		return sb.toString();
	}
	
	private static boolean isAVowel (char c) {
		
		//for a performance improvement you can use a lookup table or chars with 255 elements. using the ascii code like char['a'] || char ('A') and the value would be true.
		//no need to use regex expression although we could do it that way too. 
		return switch (Character.toLowerCase(c)) {
	    case 'a', 'e', 'i', 'o', 'u' -> true;
	    default -> false;
		};
	}
	
	public static void main (String args []) {
	
		String s = ConsolePrompt.readString("Introduce a string to encode: ");	
		System.out.println(characterLengthEncodeVowels (s));
		
	}

}
