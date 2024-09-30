package com.bptn.course._0_coding_challenges;
import java.util.Scanner;
public class Pluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		// ask for number
        System.out.print("Enter a non-negative integer: ");
        int amt = scanner.nextInt();
        scanner.nextLine();
        // ask for noun
        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();
        // Determine the plural form of the word based on the quantity
        if(amt==1) {
        	System.out.println(amt + word);
        	return;
        }
        
        // Get the last two characters in the word
        int lastChar = word.length() - 1;
    	int secondLast = lastChar - 1;
    	String wordEnd = "" + word.charAt(secondLast) + word.charAt(lastChar);// has 2 chars
    	String plural = "";
    	
        switch(wordEnd) {	
        	// word ends with fe
        	case "fe":
        		// Replace fe with ves
        		plural = word.substring(0, secondLast) + "ves";
        		System.out.println(amt + " " + plural);
        		break;
        	// word ends with sh/ch
        	case "sh":
        	case "ch":
        		// Add es after sh/ch
        		plural = word + "es";
        		System.out.println(amt + " " + plural);
        		break;
        	// word ends with us
        	case "us":
        		// Replace us with i
        		plural = word.substring(0, secondLast) + "i";
        		System.out.println(amt + " " + plural);
        		break;
            // word ends with ay/oy/ey/uy
        	case "ay":
        	case "oy":
        	case "ey":
        	case "uy":
        		// add s to the end
        		plural = word + "s";
        		System.out.println(amt + " " + plural);
        		break;
        		// word ends with y
        	//case "y":
        		// replace y with ies
        		//break;
            // every other case (= default)
        	default:
        		// word ends with y
        		if (word.charAt(lastChar) == 'y') {
        			// replace y with ies
        			plural = word.substring(0, lastChar) + "ies";
        			System.out.println(amt + " " + plural);
        		} else {
        			System.out.println(amt + " " + word + "s" + "; wordEnd: " + wordEnd);
        		}
        }
        scanner.close();
	}

}
