package project_pgm;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread anand = Thread.currentThread();
		System.out.println("Current Thread is:"+anand);
		System.out.println("Name of Current Thread is "+anand.getName());
		
		anand.setName("AR ANAND");
		anand.setPriority(5);
		
		
		System.out.println("After Changing name "+anand);
		
		System.out.println(anand.getName());

	}

}
