package jspiders;
/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * creating a implementation class for writing some logics in methods
 */
public class CalculatorImpl implements Calculator {
	@Override
	public String add(int a,int b) {
		int sum=a+b;
		return "sum of "+a+" & "+b+" is "+sum;
	}
	@Override
	public String sub(int a,int b) {
		int sub=a - b;
		return "Difference of "+a+" & "+b+" is "+sub;
	}
	@Override
	public String mul(int a,int b) {
		return "Product of "+a+" & "+b+" is "+(a*b);
	}
	@Override
	public String div(int a,int b) {
		if(b!=0) {
		return "Division of "+a+" & "+b+" is "+(a/b);
		} else {
			return "Invalid Denominator!";
		}
	}
	@Override
	public String displayErrorMessage() {
		return "Invalid Choice, please Enter Valid Choice!!!";
	}
}
