package com.flp.ems.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class UserInteraction 
{
	Employee o2=new Employee();
	EmployeeServiceImpl o4=new EmployeeServiceImpl();
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee = new HashMap<>();
	private int eid=0;
	private String Doj;
	private String Dob;
	private String Phn;
	private String Name;
	private String Add;
	private String Email;
	public void AddEmployee()
	{
		eid++;
		UserInteraction ob=new UserInteraction();
		System.out.println("enter name");
		Name=sc.next();
		System.out.println("enter phone number");
		Phn=sc.next();
		System.out.println("enter address");
		Add=sc.next();
		System.out.println("enter emailid");
		Email=sc.next();
		System.out.println("enter date of joining");
		Doj=sc.next();
		System.out.println("enter date of birth");
		Dob=sc.next();
		boolean flag1=Validate.validateLetters(o2.getName()); 
		boolean flag2=Validate.Phonenumber(o2.getPhn());
		boolean flag3=Validate.validate(o2.getEmail());
		boolean flag4=Validate.isValid(o2.getDoj());
		boolean flag5=Validate.isValid(o2.getDob());
		if(flag1 && flag2 && flag3 && flag4 && flag5){
			employee.put(1, Name);
			employee.put(2, Phn);
			employee.put(3, Add);
			employee.put(4, Email);
			employee.put(5, Doj);
			employee.put(6, Dob);
			o4.AddEmployee(employee);
		}
	}
	public void ModifyEmployee()
	{
//		System.out.println("enter employee details with id:"+eid);
//		for(java.util.Map.Entry<Integer, String> e:employee.entrySet())
//		{
//			System.out.println(e.getKey()+":"+e.getValue());
//		}
//		
	}
	public void RemoveEmployee()
	{
	}
	public void SearchEmployee()
	{
		
	}
	public void getAllEmployee()
	{
		o4.getAllEmployee();
	}
}
