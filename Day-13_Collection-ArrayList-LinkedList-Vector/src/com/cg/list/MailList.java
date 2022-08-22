package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int plotNo;
	private String Street;
	private String Area;
	private String City;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, Area=%s, City=%s, State=%s]", plotNo, Street, Area, City,
				State);
	}
	
}
public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		
		//add elemets in linked list
		obj.add(new Address(102,"HA no2","Mangaon","Raigad","Maharashtra"));
		obj.add(new Address(234,"HA no2","Borivali","Thane","Maharashtra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
	    while(i.hasNext())
	    {
	    	Object elem=i.next();
	    	System.out.println(elem+"\n");
	    }
	    System.out.println();
	}

}
