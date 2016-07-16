package com.flp.ems.domain;
import java.util.ArrayList;
import java.util.List;
public class Role 
{
private int r;
public Role()
{
	List<String> listStrings=new ArrayList<String>();
	listStrings.add("1-software engineer");
	listStrings.add("2-associate consultant");
	listStrings.add("3-consultant");
	listStrings.add("4-senior consultant");
	listStrings.add("5-manager");
	System.out.println(listStrings);
}
public int getRole()
{
	return r;
}
public void setRole(int Role)
{
	r=Role;
}
}
