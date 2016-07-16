package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;

public class Project 
{
	private int p;
	public Project()
	{
		List<String> listStrings=new ArrayList<String>();
		listStrings.add("1-JAVA");
		listStrings.add("2-SERVLETS");
		listStrings.add("3-SPRING");
		listStrings.add("4-SAP");
		System.out.println(listStrings);
	}
	public int getProject()
	{
		return p;
	}
	public void setRole(int Project)
	{
		p=Project;
	}
	}

