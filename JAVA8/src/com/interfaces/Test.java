package com.interfaces;

import com.lambda.Compare;

public class Test implements MyInterface {

	@Override
	public double calculate(int a) {
		int b = a+3;
		return b;
	}

	public static void main(String[] args) {
		Test test = new Test();
		double cul = test.calculate(10);
		double  rel = test.sqrt(16);
		System.out.println("cul="+cul+",rel="+rel);
		Compare compare = new Compare();
		compare.ptA();
	}
}
