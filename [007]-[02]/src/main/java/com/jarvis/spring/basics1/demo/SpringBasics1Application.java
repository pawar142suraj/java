package com.jarvis.spring.basics1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasics1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBasics1Application.class, args);

		BinarySearchImpl bean = run.getBean(BinarySearchImpl.class);

		System.out.println(bean.binarySearch(new int[] { 1, 2, 3 }, 1));

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// BubbleSortAlgorithm());
		// System.out.println(binarySearch.binarySearch(new int[] { 1, 2, 3 }, 3));
	}

}
