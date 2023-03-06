package jspiders;
/**
 * 
 * @author Mohammad Mustafa
 * @since 2023
 * 
 * using interface functions for generating abstraction for hiding
 * implementation of logics
 * 
 * created multiple some useful abstract methods
 *
 */ 
public interface Calculator {
	String add(int a, int b);
	String sub(int a,int b);
	String mul(int a,int b);
	String div(int a,int b);
	String displayErrorMessage();
}
// public abstract String add(int a,int b);
