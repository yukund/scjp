package group.scjp.guide.chapter2;/*** exam objective: 1.2 develop code that implement an interface * 1. Provide implementations for all methods from the interface* 2. Follow all the rules for legal e overrides * 3. Declare not checked exceptions on concentrate methods * 4. ??*/public class CalculatorImp implements ICalculator {	public int divideBy2(int input) {		return 3;	}	static int[] half() {		int[] myInts = {1, 2, 3};		return myInts;	}	public static void main(String... args){		System.out.println(half());	}}