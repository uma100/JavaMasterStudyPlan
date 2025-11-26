package com.example.javamasterclass.string;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.javamasterclass.strings.LongestCommonPrefix;

public class LongestCommonPrefixTest {
	
	@Test
	public void longestCommonPrefixReturns_whenCommonPrefix_returnCommonPrefix(){
		String strArr []= {"strsHola", "strsque", "strsTal"};
		assertEquals ("strs", LongestCommonPrefix.longestCommonPrefix(strArr));
		
	}
	
	@Test
	public void longestCommonPrefix_whenNoCommonPrefix_returnEmpty() {
		String strArr []= {"Hola", "que", "tal"};
		assertEquals("", LongestCommonPrefix.longestCommonPrefix(strArr));
	}
	
	@Test
	public void longestCommonPrefix_whenCommonPrefix_returnLongestCommonPrefix() {
		String strArr []= {"InterStellar", "InterSpatial", "InterState"};
		assertEquals("InterS", LongestCommonPrefix.longestCommonPrefix(strArr));
	}
	
	@Test
	public void longestCommonPrefix_whenOnlyOneElement_returnTheWholeWord() {
		String strArr []= {"Hola"};
		assertEquals("Hola", LongestCommonPrefix.longestCommonPrefix(strArr));
	}
	
	@Test
	public void longestCommonPrefix_whenEmptyElement_returnEmptyString() {
		String strArr []= {""};
		assertEquals("", LongestCommonPrefix.longestCommonPrefix(strArr));
	}
	

	@Test
	public void longestCommonPrefix_whenAllMatch_returnWholeWord() {
		String strArr []= {"Hola", "Hola", "Hola"};
		assertEquals("Hola", LongestCommonPrefix.longestCommonPrefix(strArr));
	}
	

}
