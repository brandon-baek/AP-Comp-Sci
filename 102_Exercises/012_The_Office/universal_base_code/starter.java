/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee andy = new Employee(4200, "Andy", "Bernard", 4416.66);
		
		dwight.raiseSalary(50);
		jim.raiseSalary(51);
		pam.raiseSalary(30);
		andy.raiseSalary(10);
		
		System.out.println("Annual Salary: " + dwight.getAnnualSalary());
		dwight.employeeToString();
		
		System.out.println("Annual Salary: " + jim.getAnnualSalary());
		jim.employeeToString();
		
		System.out.println("Annual Salary: " + pam.getAnnualSalary());
		pam.employeeToString();
		
		System.out.println("Annual Salary: " + andy.getAnnualSalary());
		andy.employeeToString();
	}
}
