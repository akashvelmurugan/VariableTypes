package com.staticvariable;

public class StaticVariables {

	static public int methodInstanceVariable(int a,int b){
		int c=a+b;
		return c;
	} 
	public static void main(String[] args) {
	System.out.println(methodInstanceVariable(5, 10));
		
	}
	
}
