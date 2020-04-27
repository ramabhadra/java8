package com.bhadra.lambdademo;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Integer> intLt = Arrays.asList(1, 2, 3, 4, 5);

		for (int i = 0; i < intLt.size(); i++) {
			System.out.println("inside for loop : " + intLt.get(i));
		}

		for (int i : intLt) {
			System.out.println("inside for-each loop : " + i);
		}

		intLt.forEach(i -> System.out.println("Inside list for each :" + i));

		IVehicle veh = new IVehicle() {
			public void manufacture() {
				System.out.println("Anonymous Implematation");
			};
		};
		veh.manufacture();

		IVehicle veh1 = () -> {
			System.out.println("lambda implemtation");
		};
		veh1.manufacture();

		IMath math = (int i) -> {
			System.out.println("math display " + i);
		};
		math.display(0);

		IMath math1 = (int i) -> {
			System.out.println("math display " + i);
		};
		math1.display(1);

		IMath math2 = (i) -> System.out.println("math display " + i);
		math2.display(2);

		IMath math3 = i -> System.out.println("math display " + i);
		math3.display(3);
	}

}
