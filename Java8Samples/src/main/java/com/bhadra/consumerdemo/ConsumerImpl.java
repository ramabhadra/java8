package com.bhadra.consumerdemo;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Inside Consumer imppl " + t);
	}

}
