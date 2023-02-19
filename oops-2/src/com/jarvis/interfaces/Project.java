package com.jarvis.interfaces;

public class Project {

	public static void main(String[] args) {
//		ComplexAlgorithm alg = new DummyAlgorithm();

		ComplexAlgorithm alg = new RealAlgorithm();

		System.out.println(alg.complexalgo(1, 20));
	}

}
