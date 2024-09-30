package com.bptn.course._0_coding_challenges;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				
//		Define variable
		Scanner scanner= new Scanner(System.in);
		int input;
 do {
		System.out.println("(/*................Calculator Menu................*/");
		System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
      
        //Ask user to input their selection
        input= scanner.nextInt();
        scanner.nextLine();
        
  switch(input) {
    
    case 1:
        // ask user to enter first and second numbers
        System.out.println("Enter the first number:");
        // store it in the a variable
        double a= scanner.nextDouble();
        // ask user to enter first and second numbers
        System.out.println("Enter the second number:");
       // store it in the b variable
        double b= scanner.nextDouble();
        // display result to user
        System.out.println(" The sum of " + a + " and " + b + " is  " + (a+b));
        break;
     case 2:
           System.out.println("Enter the first number: ");
           double c= scanner.nextDouble();
           System.out.println("Enter the second number: ");
           double d= scanner.nextDouble();
           System.out.println(" The difference of " + c + " and " + d + " is " + (c-d));
           break;
      case 3:
            System.out.println("Enter the first number: ");
            double e= scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double f= scanner.nextDouble();
            System.out.println(" The product of " + e + " and " + f + " is: " + (e*f));
            break;
     case 4:
            System.out.println("Enter the first number: ");
            double g= scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double h= scanner.nextDouble();
            System.out.println(" The quotient of " + g + " and" + h + " is: " + (g/h));
            break;
     case 5:
            System.out.println("Enter a number: ");
            double i= scanner.nextDouble();
            System.out.println(i + " squared is :" + (i*i));
            break;
     case 6:
            System.out.println("Enter a number: ");
            double j= scanner.nextDouble();
            System.out.println( "The quare root of " + " is :" + (Math.sqrt(j)));
            break;
     case 7:
             System.out.println("Enter a number: ");
             double k= scanner.nextDouble();
             System.out.println(" The reciprocal of " + k + " is: "+ (1/k));
             break;
        default: System.out.println("invalid input");
    		}
  
    	}while (input<=7);
 
 	scanner.close();
 	
	}
	
        }
      
