package com.jarvis.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleInterestCalculator calc = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalVal = calc.calculateTotalValue(5);
		System.out.println(totalVal);

	}

}
