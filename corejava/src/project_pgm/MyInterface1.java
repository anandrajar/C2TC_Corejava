package project_pgm;

interface MyInterface1 {
	public void method1();
	public void method2();
	}
	class Demo implements MyInterface1
	{
	public void method1()
	{
	System.out.println("implementation of method1");
	}
	public void method2()
	{
	System.out.println("implementation of method2");
	}
	public static void main(String arg[])
	{
	MyInterface1 obj = new Demo();
	obj.method1();
	}

}
