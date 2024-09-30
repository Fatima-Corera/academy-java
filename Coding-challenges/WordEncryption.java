package com.bptn.course._0_coding_challenges;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		//Ask user to input word and store in variable
		System.out.println("enter a word to encrypt: ");
    	String word = scanner.nextLine();
    	
        // create a char array  to hold the encrypted result with the same length as word.
    	char[] encryptedword= new char [word.length()];
    	
    	//iterate through each character in word;
		for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            char temp = current;
            //System.out.print("current before change: " + current);
            
 
            if (current>= 'a' && current <='z') {
            	
            	if (current < 'z') {//  a - y
            	    //shift each letter of the word by one position in the alphabet
            		char encryption = ++temp; 
            		encryptedword[i] = encryption;
            	} else {  // if letter is z loops back to a
            		encryptedword[i] = 'a';
            	}
            	
            } else if (current >= 'A' && current <='Z') {
            	
            	if (current < 'Z') {// A - Y
            		char encryption = ++temp;
            		//System.out.println("current: " + current + ", encrypted: " + encryptedword[i]);
            		encryptedword[i] = encryption;
            	} else { // if letter is Z loops back to A
            		encryptedword[i] = 'A';
            	}
            } else { // Non-alphabetic Characters stays the same 
            	encryptedword[i] = current;
            }
//            System.out.println("current: " + current + ", encrypted: " + encryptedword[i]);
		}
		System.out.println( new String(encryptedword));
		scanner.close();
	}
	
}
