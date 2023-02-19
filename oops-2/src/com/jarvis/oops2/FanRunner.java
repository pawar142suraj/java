package com.jarvis.oops2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Man1", 33.4, "Red");

		fan.switchOn();
		System.out.println(fan.getColor());
		System.out.println(fan.getSpeed());
		fan.setSpeed((byte) 4);
		System.out.println(fan.getSpeed());
		fan.switchOff();
		System.out.println(fan.getSpeed());
	}
}
