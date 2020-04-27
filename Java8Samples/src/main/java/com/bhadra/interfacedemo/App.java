package com.bhadra.interfacedemo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		IVehicle car = new Car();
		car.manufacture();
		
		IVehicle bus = new Bus();
		bus.manufacture();
	}
}
