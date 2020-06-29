package santhosh.mech.venkat.SanthoshJava.collect;

import java.util.LinkedList;

/*
 * LinkedList: bidirectional
 * add/addLast,addFirst,add(pos,data)
 * set(pos,data)
 * get(pos), getFirst(), getLast()
 * remove/ removeFirst, removeLast, remove(pos), remove(data)
 * indexOf(data)
 * 
 */

public class TestLink 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> link1=new LinkedList<Integer>();
		link1.add(12);link1.add(90);link1.addFirst(97);
		link1.addLast(34);link1.add(1,(int)'R');
		System.out.println(link1);
		System.out.println(link1.indexOf(90));
		System.out.println(link1.getLast());
		link1.remove();//link1.removeFirst()
		System.out.println(link1.getFirst());
		link1.remove(new Integer(82));link1.remove(1);
		System.out.println(link1);
		System.out.println(link1.get(1));
	}
}