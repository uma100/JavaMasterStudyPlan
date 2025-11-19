package com.example.javamasterclass.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.javamasterclass.strings.PalindromeChecker;

public class PalindromeTest {
	@Test
	public void simplePalindromes () {
		assertTrue(PalindromeChecker.check("a"));
		assertTrue(PalindromeChecker.check(""));
		assertTrue(PalindromeChecker.check("ana"));
		assertTrue(PalindromeChecker.check("level"));
		assertTrue(PalindromeChecker.check("AmanaplanaCanalpanama"));
		assertTrue(PalindromeChecker.check("    "));
		
	}
	
	@Test
	public void notPalindromes () {
		assertFalse(PalindromeChecker.check("an"));
		assertFalse(PalindromeChecker.check("tom"));
		assertFalse(PalindromeChecker.check("hello"));
		
	}
	
	
}
