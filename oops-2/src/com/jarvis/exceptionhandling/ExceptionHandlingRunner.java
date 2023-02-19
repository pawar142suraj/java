package com.jarvis.exceptionhandling;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDonotMatchException {

		if (!this.currency.equals(that.currency)) {

			// System.out.println("Currencies donot match\n");
			throw new CurrenciesDonotMatchException("Currencies donot match\n");
		}

		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDonotMatchException extends Exception {

	public CurrenciesDonotMatchException(String msg) {
		super(msg);
	}

}

public class ExceptionHandlingRunner {

	public static void main(String[] args) throws CurrenciesDonotMatchException {

		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 10);

		amount1.add(amount2);
		System.out.println(amount1);

	}

}
