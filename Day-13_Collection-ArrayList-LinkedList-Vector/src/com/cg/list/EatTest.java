package com.cg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Fruit
{
	public String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
}
public class EatTest {

	public static void main(String[] args) {
		List<Fruit>obj=new ArrayList<Fruit>();
		Fruit f=new Fruit("Apple");
		obj.add(f);
		obj.add(new Fruit("Banana"));
		obj.add(new Fruit("Mango"));
	    Iterator<Fruit>i=obj.iterator();
	    while(i.hasNext())
	    {
	    	Fruit f1=i.next();
	    	System.out.println(f1.name);
	    }
		

	}

}
