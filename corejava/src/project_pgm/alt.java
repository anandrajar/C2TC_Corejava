package project_pgm;

public class alt {
	alt()
	{
		System.out.println("def constructor");
	}
	alt(int a,int b)
	{
		System.out.println("constructor with two parameters      lq9"+a+"   "+b);
	}

	alt(int a,int b,int c)
	{
		System.out.println("constructor with 3 para       "+a+"   "+b+"   "+c);
	}

	alt(int i,String name)
	{
		System.out.println("constructor with string and int      "+i+"   "+name);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alt obj1= new alt();
		alt obj2= new alt(2,4);
		alt obj3= new alt(4,5,2);
		alt obj4= new alt(1,"new");


	}

}
