package com.bhadra.lambdademo;

/**
 * if the interface is having only on unimplemented method then we call it as
 * functional interface (or) if the class is having @FunctionalInterface then we
 * it as Functional Interface
 */
@FunctionalInterface
public interface IVehicle {
	void manufacture();
}
