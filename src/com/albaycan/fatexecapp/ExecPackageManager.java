package com.albaycan.fatexecapp;

public class ExecPackageManager {

	public static void main(String[] args) {
		// creating an instance with arguments
		BasicMath bm = new BasicMath(10, 4);
		
		// basic calculation
		System.out.printf("%d + %d = %d",bm.getX() ,bm.getY(),bm.add()).println();
		System.out.printf("%d - %d = %d", bm.getX(), bm.getY(), bm.subtract()).println();
		System.out.printf("%d * %d = %d", bm.getX(), bm.getY(), bm.multiply()).println();
		System.out.printf("%d / %d = %f", bm.getX(), bm.getY(), bm.divide()).println();

		// advanced calculation
		AdvancedMath am = new AdvancedMath(3, 6);
		System.out.printf("Σ(2x-3) where x>=%d and x<=%d equals to %d", am.getA(), am.getB(), am.calcSigma()).println();
		System.out.printf("Combination of %d by %d is %d", am.getB(), am.getA(), am.calcCombination()).println();
	}

}
