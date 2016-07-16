package com.flp.ems.service;
import java.util.Map;
import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;


public class EmployeeServiceImpl implements IEmployeeService
{
	private String Doj;
	private String Dob;
	private String Phn;
	private String Name;
	private String Add;
	EmployeeDaoImplForList o5=new EmployeeDaoImplForList();
	@Override
	public void AddEmployee(Map E) 
	{
		Employee o3=new Employee();
		Map<Integer,String>s=E;
		Name=s.get(1);
		Add=s.get(2);
		Phn=s.get(3);
		Doj=s.get(4);
		Dob=s.get(5);
		o3.setName(Name);
		o3.setName(Phn);
		o3.setAdd(Add);
		o3.setDoj(Doj);
		o3.setDob(Dob);
		EmployeeDaoImplForList E1=new EmployeeDaoImplForList();
		E1.AddEmployee(o3);
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
	public void getAllEmployee()
	{
		o5.getAllEmployee();
	}

}
