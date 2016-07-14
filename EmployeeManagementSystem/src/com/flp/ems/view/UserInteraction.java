package com.flp.ems.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.flp.ems.domain.Employee;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class UserInteraction 
{
	Employee o2=new Employee();
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee = new HashMap<>();
	private int eid=1000;
	public void AddEmployee()
	{
		eid++;
		UserInteraction ob=new UserInteraction();
		o2.setName("dikshya");
		o2.setPhn("8895084584");
		o2.setAdd("plot no-3");
		o2.setDoj("4-5-16");
		o2.setDob("1-3-1994");
		employee.put(new Integer(1), o2.getName());
		employee.put(new Integer(2), o2.getPhn());
		employee.put(new Integer(3), o2.getAdd());
		employee.put(new Integer(4), o2.getDoj());
		employee.put(new Integer(5), o2.getDob());
	}
	public void ModifyEmployee()
	{
		System.out.println("enter employee details with id:"+eid);
		for(Entry<Integer,String>) e:employee.entrySet()
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	public void RemoveEmployee()
	{
	}
	public void SearchEmployee()
	{
		
	}
	public void getAllEmployee()
	{
	}
}
