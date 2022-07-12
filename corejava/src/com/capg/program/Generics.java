package com.capg.program;
import java.util.*;
class GenericClass<T>
{
	GenericClass()
	{
		System.out.println("This is generic class");
	}
	public void methodgeneric(T obj)
	{
		System.out.println("The type of object is"+obj.getClass().getSimpleName());
	}
}

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer>A=new GenericClass<>();
		Integer B=6;
		A.methodgeneric(B);

		GenericClass<String>C=new GenericClass<>();
		String Y="Anand raj A";
		C.methodgeneric(Y);

	}

}
