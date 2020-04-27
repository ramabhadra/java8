package com.bhadra.consumerdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Application {

	public static void main(String[] args) {

		List<Integer> intLt = Arrays.asList(1, 2, 3, 4);

		Consumer<Integer> c = new ConsumerImpl();

		intLt.forEach(c);

		Consumer<Integer> c1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("Anonymous Impl :" + t);
			}
		};

		intLt.forEach(c1);

		Consumer<Integer> c2 = (Integer i) -> {
			System.out.println("Inside Lambda " + i);
		};
		intLt.forEach(c2);

		intLt.forEach((Integer i) -> {
			System.out.println("Inside Lambda foreach " + i);
		});

		intLt.forEach(i -> System.out.println(i));
	}

}
