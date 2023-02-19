package com.jarvis.interfaces;

public class FlyRunner {

	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeeroplane() };

		for (Flyable obj : flyingObjects) {
			obj.fly();
		}

	}
}
