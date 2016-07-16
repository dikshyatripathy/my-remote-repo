package com.flp.ems.view;
import java.util.Scanner;
public class BootClass 
{
	
public static void main(String args[])
	{
		BootClass B=new BootClass();
		B.menuSelection();
	}
	public void menuSelection()
	{
		UserInteraction o1=new UserInteraction();
		System.out.println("1 for AddEmployee");
		System.out.println("2 for ModifyEmployee");
		System.out.println("3 for RemoveEmployee");
		System.out.println("4 for SearchEmployee");
		System.out.println("5 for getAllEmployee");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:
			o1.AddEmployee();
		case 2:
			o1.ModifyEmployee();
		case 3:
			o1.RemoveEmployee();
	    case 4:
			o1.SearchEmployee();
		case 5:
			o1.getAllEmployee();
			
		}
	}
}
