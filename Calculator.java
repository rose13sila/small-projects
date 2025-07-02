package project;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();
		 
		System.out.println("Enter an operator");
		char operator = input.next().charAt(0);
		
		 double result;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			if(num2 != 0) {
			 result = num1 / num2;
			} else {
				System.out.println("ERROR");
				return;
			}
		}else {
			System.out.println("Invalid Operator");
			return;
		}
		System.out.println("Result " + result);
		input.close();
		}
	    
			
//			
//	
		
		
			
		
		
		
		
		
		
		
}

