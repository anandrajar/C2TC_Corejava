package project_pgm;

import java.util.*;

public class Thread_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obb=Thread.currentThread();
		System.out.println("Current thread is"+" "+obb);
		System.out.println("Name of thread is"+" " +obb.getName());
		obb.setName("Anand Raj");
		System.out.println("Name after changing is"+" "+obb);
		System.out.println("thread can be used inside main only");

	}

}
