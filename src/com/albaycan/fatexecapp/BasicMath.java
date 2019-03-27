package com.albaycan.fatexecapp;

public class BasicMath {

	// creating variables
	private int x;
	private int y;

	// creating the constructer with arguments
	public BasicMath(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// creating getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// calculation methods
	public int add() {
		return x + y;
	}

	public int subtract() {
		return x - y;
	}

	public int multiply() {
		return x * y;
	}

	public float divide() {
		return (float) x / (float) y;
	}

}
