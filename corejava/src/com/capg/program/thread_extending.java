package com.capg.program;

public class thread_extending extends Thread {
	public void run()
	{
		System.out.println("AR");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new thread_extending();
		t.start();

	}

}
