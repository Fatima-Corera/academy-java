package com.bptn.course._0_coding_challenges;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check for palindrome: ");
	// Declare variable to receive input
	        String input = scanner.nextLine();
	        String reverseInput = "";
	// reverse input string 
	        for (int i = input.length() - 1; i >= 0; i--) {
	            // store  the reverse input in another variable 
	            reverseInput += input.charAt(i);
	        }
	// Compare both
	        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
	            // if variables are the same print 'input string is a palindrome'
	            System.out.println("String is a palindrome");
	        } else {
	            // is variables are different print 'input string is not a palindrome'
	            System.out.println("String is not a palindrome");
	        }
	   scanner.close();
	    }
		{
		}

	}
