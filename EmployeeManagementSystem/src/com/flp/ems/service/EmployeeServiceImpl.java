package com.flp.ems.service;
import java.util.Map;
import java.util.Map.Entry;
import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;


public class EmployeeServiceImpl implements IEmployeeService
{
	private int Eid;
	private int Doj;
	private int Dob;
	private int Phn;
	private int Name;
	private int Add;
	private int Email;
	Employee o3=new Employee;
	@Override
	public void AddEmployee (Map E) 
	{
		Map<Integer,String>serv=E;
		Name=serv.get(1);
		Add=serv.get(2);
		Phn=serv.get(3);
		Doj=serv.get(4);
		Dob=serv.get(5);
		o3.setName(Name);
		o3.setAdd(Add);
		o3.setDoj(Doj);
		o3.setDob(Dob);
		EmployeeDaoImplForList E1=new EmployeeDaoImplForList;
		E1=AddEmployee(o3);
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
