package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.List;
import com.flp.ems.domain.Employee;
public class EmployeeDaoImplForList implements IEmployeeDao
{
	@Override
	public void AddEmployee(Employee emp)
	{
		List<E> arr=new ArrayList();
		arr.add(1, emp.getName());
		arr.add(2, emp.getPhn());
		arr.add(3, emp.getAdd());
		arr.add(4, emp.getDoj());
		arr.add(5, emp.getDob());
		System.out.println(arr);
	}

	@Override
	public void ModifyEmployee() 
	{
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
