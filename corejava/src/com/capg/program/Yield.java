package com.capg.program;

public class Yield implements Runnable {
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield a = new Yield();
		Thread t1=new Thread (a);
		
		Yield b = new Yield();
		Thread t2=new Thread (b);
		
		t1.start();
		t2.start();

	}

}
