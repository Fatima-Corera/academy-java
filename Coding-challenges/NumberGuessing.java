package com.bptn.course._0_coding_challenges;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//Ask user to input number
		System.out.println("Please enter a number between 1 and 100: ");
		int guess = scanner.nextInt();
		int targetNumber=23; 
		if( guess < targetNumber) {
			System.out.println("“Too low! Try again.”");
		}
		else if (guess > targetNumber) {
			System.out.println(" “Too high! Try again.”");
		}
		else { 
			System.out.println("“Congratulations! You guessed the number correctly!”");
		}
		scanner.close();
    }
    
	

}
