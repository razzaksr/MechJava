package santhosh.mech.venkat.SanthoshJava.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/*
 * Vector>> synchronized, 10,15,../ ArrayList>> asynchronized,10,20,30..:
 * add, add(pos,data)
 * set(pos,data)
 * get(pos)
 * indexOf()
 * remove(pos),remove(data)
 * removeAll
 * retatinAll
 * contains
 * Collections:
 * sort
 * reverse
 * replaceAll
 */
public class TestList 
{
	public static void main(String[] args) 
	{
		Vector<Double> list1=new Vector<Double>();
		ArrayList<Double> list2=new ArrayList<Double>();
		list1.add(8.9);list1.add(12.5);list1.add(7.8);list1.add(12.6);
		list1.add(11.9);list1.add(2,6.9);list1.add(8.9);list1.add(8.1);
		System.out.println("Vector:\n"+list1);
		list2.addAll(list1);System.out.println("ArrayList:\n"+list2);
		Collections.sort(list1);System.out.println("Vector:\n"+list1);
		Collections.reverse(list2);System.out.println("ArrayList:\n"+list2);
		Collections.replaceAll(list2, 8.9, 7.8);
		System.out.println("ArrayList:\n"+list2);
		list1.retainAll(list2);System.out.println("Vector:\n"+list1);
		list2.set(1, 0.1);
		list2.removeAll(list1);System.out.println("ArrayList:\n"+list2);
	}
}
