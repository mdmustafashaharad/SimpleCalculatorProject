package jspiders;
import java.util.Scanner;

/**
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * created Scanner class for taking input from user 
 * created CalculatorImpl class in this class for using logic of functions
 * while loop is helps for repeated option for user untill he is close
 * using switch condition for taking choice of user
 */
public class Solution {
	static Scanner scan = new Scanner(System.in);
	static int a,b;
	static void  acceptInput() {
		System.out.println("Enter 1st element");
		a = scan.nextInt();
		System.out.println("Enter 2nd element");
		b= scan.nextInt();
	}
	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		while(true) {
			System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division\n5:Exit\nEnter Choice");
			int choice = scan.nextInt();
			if (choice>=1 && choice <=4) {
				acceptInput();
			}
			switch(choice) {
			case 1 : System.out.println(calc.add(a, b)); break;
			case 2 : System.out.println(calc.sub(a, b)); break;
			case 3 : System.out.println(calc.mul(a,b)); break;
			case 4 : System.out.println(calc.div(a,b)); break;
			case 5 : System.out.println("Thank you!"); System.exit(0);
			default : System.out.println(calc.displayErrorMessage());
			}
			System.out.println("__________________________________");	
		}
	}
}
