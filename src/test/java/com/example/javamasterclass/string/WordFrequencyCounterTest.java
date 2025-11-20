package com.example.javamasterclass.string;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.example.javamasterclass.strings.WordFrequencyCounter;

public class WordFrequencyCounterTest {
	
	@Test
	public void countWordsBasic () {
		
		String []actualResult = WordFrequencyCounter.wordFrequencyCount("hello java hello");
		
		String [] expectedResult= {"hello appears 2 times.", 
								"java appears 1 times.",
								null};
		
		assertArrayEquals(actualResult, expectedResult);

	}
	
	@Test
	public void countWordsWithCaseAndPunctuationWithoutRepetitions(){
		String []actualResult = WordFrequencyCounter.wordFrequencyCount("Hello, my name is Almudena!");
		
		String [] expectedResult= {"hello appears 1 times.", 
								"my appears 1 times.",
								"name appears 1 times.", 
								"is appears 1 times.", 
								"almudena appears 1 times."};
		
		assertArrayEquals(actualResult, expectedResult);

        
	}
	
	@Test
	public void countWordsWithCaseAndPunctuationWithRepetitions(){
		String []actualResult = WordFrequencyCounter.wordFrequencyCount("Hello, my name is Almudena, almudena, hello!");
		
		String [] expectedResult= {"hello appears 2 times.", 
								"my appears 1 times.",
								"name appears 1 times.", 
								"is appears 1 times.", 
								"almudena appears 2 times.",null,null};
		
		assertArrayEquals(actualResult, expectedResult);

        
	}
	
}
