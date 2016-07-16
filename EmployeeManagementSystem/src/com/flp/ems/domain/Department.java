package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private int d;
	public Department()
	{
		List<String> listStrings=new ArrayList<String>();
		listStrings.add("1-adm clouds");
		listStrings.add("2-adm devops");
		listStrings.add("3-mainframe");
		listStrings.add("4-as400");
		listStrings.add("5-cm");
		System.out.println(listStrings);
	}
	public int getDepartment()
	{
		return d;
	}
	public void setDepartment(int Department)
	{
		d=Department;
	}
	}
