package com.jarvis.oops;

public class MotoBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");

		MotoBike ducati = new MotoBike(10);
		MotoBike honda = new MotoBike(20);
		MotoBike lol = new MotoBike();
		System.out.println(lol.getBike_speed());
		ducati.start();
		honda.start();
		System.out.println(ducati.getBike_speed());
		ducati.setBike_speed(100);
		System.out.println(ducati.getBike_speed());
		honda.setBike_speed(101);

	}

}
