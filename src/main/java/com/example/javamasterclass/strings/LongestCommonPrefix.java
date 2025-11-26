package com.example.javamasterclass.strings;

public class LongestCommonPrefix {

	public static String longestCommonPrefix (String [] sArray) {
		
//strsHola strsQue strsTal


		
		//int [] pattern = new int [sArray[0].length()];
		StringBuilder sb = new StringBuilder();
		int maxArrayElements = sArray.length;
		//int i=0;
		char [] comp1= sArray[0].toCharArray();
		//el primero compara con el segundo con el tercero con el cuarto nn....compara su j
		
	
			
		for(int j=0; j<comp1.length; j++) {
				int x=0;
				int indexElementToCompare= 1;
			
							
					
				while(indexElementToCompare<maxArrayElements && j<comp1.length && j<sArray[x+1].toCharArray().length && comp1[j]==sArray[x+1].toCharArray()[j]){	
						
					System.out.println("index Element To compare " + x);		
					x++;
					indexElementToCompare ++;
					
					
					
				}
				if (x==maxArrayElements-1) {				
					sb.append(comp1[j]);
				}	else {
					break;
				}
				
			}
			
		return sb.toString();
		
	}
	public static void main (String args[]) {
		//You want the maximum number of starting characters that are identical across all words in order.
		System.out.println(longestCommonPrefix(new String[]{"Hola"}));
	}
}
