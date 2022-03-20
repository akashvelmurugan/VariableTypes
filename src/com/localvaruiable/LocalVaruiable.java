package com.localvaruiable;

public class LocalVaruiable {

	public int addition(int i,int j) {
		int firstNumber=i ;
		int secondNumber= j;
		int sum;
		sum=firstNumber+secondNumber;
		return sum;
	}
	public void multiplication(int a,int b,int c) {
		c=a+b;
	}

	public static void main(String[] args) {
		LocalVaruiable localVaruiable = new LocalVaruiable();

		System.out.println(localVaruiable.addition(5, 5));

	}
}
