package com.company;

import java.util.Scanner;
public class PigLatin {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = scan.nextLine();
		
		String[] tokens = line.split(" +");
		
		//get rid of trailing.
		int words = tokens.length;
		int letters = tokens[words-1].length();
		if (tokens[words-1].substring(letters-1).equals(".")) {
			tokens[words-1] = tokens[words-1].substring(0, letters-1);
		}
		
		//loop over all words
		boolean loop = true;
		int pointer = 0;
		
		for (int i = 0; i < tokens.length; i++) {
			
			pointer=0;
			loop = true;
			
			//loop over letters to find first vowel
			while(loop){	  
				
				switch (tokens[i].substring(pointer,  pointer+1)){
					
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
				case "A":
				case "E":
				case "I":
				case "O":
				case "U":   {
					
					String tail = tokens[i].substring(0,  pointer);
					String head = tokens[i].substring(pointer);
					tokens[i] = head + tail + "ay";
					tokens[i] = tokens[i].toLowerCase();
					loop = false;
					break;
				}
				
				default:  
					//what about words like "my"
					if (pointer >= tokens[i].length() - 1 ){
						
						tokens[i] = tokens[i] + "ay";
						loop = false;
					}
						else
							pointer++;
				}//switch
				
			
			}//while
			
		}//for
		
		String pigLine = "";
		
		for (int i=0; i<tokens.length;i++){
			pigLine = pigLine + tokens[i] + " ";
		}
		
		System.out.println(pigLine);
	}
	
	

}
