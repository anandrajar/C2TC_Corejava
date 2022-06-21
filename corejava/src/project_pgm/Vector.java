package project_pgm;

import java.util.*;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack <String>Stack=new Stack<String>();
	      Stack.push("raj");
	      Stack.push("ar");
	      Stack.push("rs");
	      Stack.push("mj");
	      System.out.println(Stack);
	      
	      System.out.println(Stack.peek());
	      System.out.println(Stack);
	      
	      System.out.println(Stack.empty());
	      System.out.println(Stack);
	      
	      System.out.println(Stack.pop());
	      System.out.println(Stack);
	      
	      Iterator<String>itr=Stack.iterator();
	      while(itr.hasNext()) 
	      {
	    	  System.out.println(itr.next());
	      }
	      System.out.println(Stack.search("rs"));
	      System.out.println(Stack);

	}

}
