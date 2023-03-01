package com.jarvis.spring.basics1.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public void sort(int[] numbers) {
		// TODO Auto-generated method stub

		System.out.println("In QuickSort");

	}

}
