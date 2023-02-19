package com.jarvis.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService execServ = Executors.newFixedThreadPool(2);

		List<CallableTask> taskList = List.of(new CallableTask("Jarvis"), new CallableTask("Iron Man"));
//		Future<String> retStr = execServ.submit(new CallableTask("Jarvis"));

		List<Future<String>> invokeallSTR = execServ.invokeAll(taskList);

		for (Future<String> inv : invokeallSTR) {
			System.out.println(inv.get());
		}

	}

}
