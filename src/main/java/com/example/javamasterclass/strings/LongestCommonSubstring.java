package com.example.javamasterclass.strings;

import com.example.javamasterclass.strings.utilities.ConsolePrompt;


public class LongestCommonSubstring {

	public static String getLongestCommonString (String s1, String s2) {
		
		//we can do the same exercise but with dynamic programming, using a bidimensional table
		
		char [] smallCharArray;
		char [] bigCharArray;
		if(s1.length()>=s2.length()) {
			bigCharArray=s1.toCharArray();
			smallCharArray=s2.toCharArray();
		}else {
			bigCharArray=s2.toCharArray();
			smallCharArray=s1.toCharArray();
		}
		
		
	
		int maxCount=0;
		String longestString="";


		for (int i=0; i<smallCharArray.length; i++) {
			for (int j=0; j<bigCharArray.length; j++) {
				StringBuilder commonString=new StringBuilder("");
				int count =0;
				
				while(i+count < smallCharArray.length && j+count< bigCharArray.length && smallCharArray[i+count]==bigCharArray[j+count]) {					
					commonString.append( smallCharArray[i+count]); 
					count ++;
					
				}
				if (count>maxCount) {
					maxCount=count;
					longestString =commonString.toString();
				}
			}
		}
		return longestString;
	}
	public static void main (String args[]) {
		String s1 =ConsolePrompt.readString("Introduce String 1");
		String s2 =ConsolePrompt.readString("Introduce String 2");
		System.out.println(getLongestCommonString(s1, s2));
	}
}
