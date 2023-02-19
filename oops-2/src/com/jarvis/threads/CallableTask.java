package com.jarvis.threads;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	private String number;

	public CallableTask(String number) {
		this.number = number;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hey  " + this.number;
	}

}
