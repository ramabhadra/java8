package com.bhadra.interfacedemo;

public interface IVehicle {

	default void manufacture() {
		System.out.println("Vehicel manufacturing -----");
	}
}
