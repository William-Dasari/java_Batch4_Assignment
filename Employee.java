/*Day2 and  Day3 Assignment:
Define a class "Employee" with the following members:

int eid
String name
float salary
inputDetails()
showDetails()

The data members should be private and you should use inputDetails()
and showDetails() to set the details and to print the details respectively.
Define a driver class "EmployeeDetails" which will drive the entire program
i.e. it will contain the main method.*/
package com.foremp;

import java.util.Scanner;

public class Employee 
{
	Scanner scanner=new Scanner(System.in);
	int eid;
	String name;
	float salary;
	
/*The below method Takes the input values*/
	
	public void inputDetails() 
	{
		
		
		System.out.println("Enter Employee Id : ");
		eid = scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		name = scanner.next();
		System.out.println("Enter Employee Salary : ");
		salary = scanner.nextFloat();
		
	}
	
//The below method displays the values of the employee
	
	public void showDetails() 
	{
		System.out.println("The Details of the Employee");
		System.out.println("Employee ID  : "+eid);
		System.out.println("Employee Name  : "+name);
		System.out.println("Employee Salary : "+salary);
		
	}

}
