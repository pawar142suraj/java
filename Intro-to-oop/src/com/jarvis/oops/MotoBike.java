package com.jarvis.oops;

public class MotoBike {

	private int bike_speed;

	MotoBike() {
		this(5);
	}

	MotoBike(int bike_speed) {
		this.bike_speed = bike_speed;
	}

	void start() {
		System.out.println("Bike started");
	}

	public int getBike_speed() {
		return bike_speed;
	}

	public void setBike_speed(int bike_speed) {
		if (bike_speed > 0) {
			this.bike_speed = bike_speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setBike_speed(this.bike_speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setBike_speed(this.bike_speed - howMuch);
	}

}
