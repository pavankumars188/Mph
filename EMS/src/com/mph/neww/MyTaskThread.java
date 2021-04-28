package com.mph.neww;

public class MyTaskThread implements Runnable {

	@Override
	public void run() {
		Task t = new Task();
		t.print();

	}

}