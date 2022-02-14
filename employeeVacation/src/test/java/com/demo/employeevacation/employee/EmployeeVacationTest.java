package com.demo.employeevacation.employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeVacationTest {

	@Test
	void hourlyEmployeeTest() {

		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		hourlyEmployee.work(52);
		Assertions.assertEquals(2, hourlyEmployee.getVacationDays());
	}

	@Test
	void salariedEmployeeTest() {

		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.work(52);
		Assertions.assertEquals(3, salariedEmployee.getVacationDays());
	}

	@Test
	void managerEmployeeTest() {

		ManagerEmployee managerEmployee = new ManagerEmployee();
		managerEmployee.work(52);
		Assertions.assertEquals(6, managerEmployee.getVacationDays());
	}

}
