package com.flp.ems.dao;
import com.flp.ems.domain.Employee;
public interface IEmployeeDao 
{
	public void AddEmployee(Employee emp);
	public void ModifyEmployee();
	public void RemoveEmployee();
	public void SearchEmployee();
	public void getAllEmployee();
}
