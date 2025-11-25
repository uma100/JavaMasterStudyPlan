package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class SubStringSearch {
	
	public static int search(String sentence, String pattern) {

		char [] sentenceChars= sentence.toCharArray();
		char [] patternChars= pattern.toCharArray();
		int j=0;
		int i=0;
		
		while(i<sentenceChars.length){
			if(sentenceChars[i]==patternChars[j]) {
				j++;
				if(j==patternChars.length) {
					return i-j;
				}
			}else if (j>0) {
				j=0;
				i--;
				
			}			
			i++;
			
			
		}
		
		return -1;	
		
	}
	public static void main (String [] args) {
		String sentence= ConsolePrompt.readString("Introduce a sentence");
		String pattern= ConsolePrompt.readString("Introduce the string to search");
		System.out.println(search(sentence, pattern));
		
	}

}