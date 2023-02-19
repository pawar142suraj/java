package com.jarvis.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);

	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		return this.principal.add(this.principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
	}

}
