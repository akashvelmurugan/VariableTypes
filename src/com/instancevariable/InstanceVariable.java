package com.instancevariable;

public class InstanceVariable {

	public int methodInstanceVariable(int a,int b){
		int c=a+b;
		return c;
	} 
	public static void main(String[] args) {
		InstanceVariable instanceVariable= new InstanceVariable();
		System.out.println("sum"+instanceVariable.methodInstanceVariable(10, 20));
	}
}
