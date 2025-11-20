package com.example.javamasterclass.strings.utilities;

import java.util.Scanner;

public class ConsolePrompt {
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static String readString (String prompt) {
		
		System.out.print(prompt + ": ");
		return  SCANNER.nextLine(); // Read a line of text
			
	}

}
