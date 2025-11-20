package com.example.javamasterclass.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.javamasterclass.strings.StringReverser;

public class StringReverserTest {
	
	@Test
	public void reverseSimpleTest (){
		
		assertEquals (StringReverser.reverse("Una frase invertida"), "aditrevni esarf anU");
		
	}

}
