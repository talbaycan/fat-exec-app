package com.albaycan.fatexecapp;

public class AdvancedMath {

	// creating variables
	private int a;
	private int b;

	// creating the constructer with arguments
	public AdvancedMath(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// creating getters
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	// calculation methods
	public int calcSigma() {
		int sum = 0;
		for (int x = a; x <= b; x++) {
			sum = sum + (2 * x - 3);
		}
		return sum;
	}

	public int factorial(int fac) {
		int total = 1;
		for (int c = 2; c <= fac; c++) {
			total = total * c;
		}
		return total;
	}

	public int calcCombination() {
		return factorial(b) / (factorial(a) * factorial(b - a));
	}
}
