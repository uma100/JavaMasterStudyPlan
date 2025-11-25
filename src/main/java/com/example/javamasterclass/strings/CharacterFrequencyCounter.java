package com.example.javamasterclass.strings;

import java.util.Arrays;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;


public class CharacterFrequencyCounter {
	
	public static int[] count (String s) {
		
		int [] freq = new int[256];
		char [] charArray = s.toCharArray();
		if (charArray.length>0) {
			for(char c: charArray) {
				freq[Character.toLowerCase(c)]++;
			}
		}
		
		return freq;
		
	}

	public static void main (String [] args) {
		String s = ConsolePrompt.readString("Inroduce a string so we can count character frequency");
		int [] freq = count(s);
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>0) {
				System.out.println((char) i + " -> " + freq[i]); 
			}
		}
	}
}
