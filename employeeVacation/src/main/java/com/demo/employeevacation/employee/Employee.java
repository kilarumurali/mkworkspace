package com.demo.employeevacation.employee;

public abstract class Employee {

	static float maxWorkDays = 260;

	abstract void work(int daysWorked);

	abstract void takeVacation(float takeVacation);

}
