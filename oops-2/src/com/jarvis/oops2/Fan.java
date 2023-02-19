package com.jarvis.oops2;

public class Fan {

	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {

		this.make = make;
		this.radius = radius;
		this.color = color;

	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public byte getSpeed() {
		return speed;
	}

	public void switchOn() {

		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {

		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;

	}
}
