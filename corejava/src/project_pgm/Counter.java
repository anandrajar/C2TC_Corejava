package project_pgm;
//static keyword example
public class Counter {
static int count = 0;
	
	Counter()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating objects
				Counter c1 = new Counter();
				Counter c2 = new Counter();
				Counter c3 = new Counter();

	}

}
