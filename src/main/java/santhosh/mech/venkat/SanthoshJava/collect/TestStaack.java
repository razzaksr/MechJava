package santhosh.mech.venkat.SanthoshJava.collect;

import java.util.Iterator;
import java.util.Stack;

/*
 * Last in first out:
 * push, pop, peek, search, clear
 */

public class TestStaack 
{
	public static void main(String[] args) 
	{
		Stack stk1=new Stack();
		stk1.push(9.8);stk1.push(12);stk1.push("Venkat");stk1.push('R');
		stk1.push(true);System.out.println(stk1);
		System.out.println(stk1.peek());
		System.out.println(stk1.search("venkat"));
		System.out.println(stk1.isEmpty());
		System.out.println(stk1.pop());
		stk1.push('R');
		//for(Object o:stk1) {System.out.println(o);}
		System.out.println("Listing via iterator: ");
		Iterator yet=stk1.iterator();
		while(yet.hasNext())
		{
			System.out.println(yet.next());
		}
	}
}
