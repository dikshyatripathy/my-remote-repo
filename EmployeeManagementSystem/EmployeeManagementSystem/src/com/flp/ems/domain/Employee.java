package com.flp.ems.domain;

public class Employee 
{
	private int eid=0;
	private String Doj;
	private String Dob;
	private String Phn;
	private String Name;
	private String Add;
	private String Email;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		this.Name=name;
	}
	public String getPhn()
	{
		return Phn;
	}
	public void setPhn(String l)
	{
		Phn=l;
	}
	public void setAdd(String add)
	{
		this.Add=add;
	}
	public String getAdd()
	{
		return Add;
	}
	public String getDoj()
	{
		return Doj;
	}
	public void setDoj(String Doj)
	{
		this.Doj=Doj;
	}
	public void setDob(String Dob)
	{
		this.Dob=Dob;
	}
	public String getDob()
	{
		return Dob;
	}
	public void getEmail()
	{
		this.Email=Email;
	}
	public String setEmail(String Email)
	{
		return Email;
	}
	
}
