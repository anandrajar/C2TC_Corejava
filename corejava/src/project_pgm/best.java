package project_pgm;

interface best {
	  public void method1();
	  public void method2();
	}

	class Myinterface implements best{
		public void method1()
		{
			System.out.println("implement of method 1");
		}
		public void method2()
		{
			System.out.println("implement of method 2");
		}
			public static void main(String arg[])
			{
			MyInterface1 obj = new Demo();
			obj.method1();
			}

}
