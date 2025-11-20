package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;

public class WordFrequencyCounter {
	
	public static String[] wordFrequencyCount (String s) {
		
	     s = s.toLowerCase().replaceAll("[^a-z0-9\\s]", ""); //ignore case and punctuation symbols
		String [] stringArr= s.split("\\s+");// one or more spaces
		String wordsCounted="";
		String [] result = new String [stringArr.length]; //We store it in result for the method to be more reusable, testeable outside this method.
		
		
		for (int i=0; i<stringArr.length;i++) {
		
			int count=0;
			if(wordsCounted.contains("|" + stringArr[i] +"|")){
				continue;
			}
			for(int j=0;j<stringArr.length;j++) {
				if(stringArr[i].equals(stringArr[j])) {
					count++;
				}
			}
			
			wordsCounted +="|" + stringArr[i] +"|";
			result[i] = stringArr[i] + " appears " + count + " times.";
			
		}
		return result;
		
	}
	public static void main (String args []) {
		String s= ConsolePrompt.readString("Introduce a sentence whose words will be counted");
		String [] result = wordFrequencyCount(s);
		for(int i=0; i<result.length; i++) {
			if(result[i]!=null) {
				System.out.println(result[i]);
			}
		}
		
	}

}
