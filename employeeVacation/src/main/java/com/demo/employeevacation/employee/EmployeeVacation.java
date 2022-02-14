package com.demo.employeevacation.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeVacation {

	private List<HourlyEmployee> hourlyEmployees = new ArrayList<HourlyEmployee>();

	private List<SalariedEmployee> salariedEmployees = new ArrayList<SalariedEmployee>();

	private List<ManagerEmployee> managerEmployees = new ArrayList<ManagerEmployee>();

	@Bean
	public void createMultipleInstances() {

		for (int i = 0; i < 10; i++) {
			hourlyEmployees.add(new HourlyEmployee());
			salariedEmployees.add(new SalariedEmployee());
			managerEmployees.add(new ManagerEmployee());
		}

		System.out.println(hourlyEmployees.size());
		System.out.println(salariedEmployees.size());
		System.out.println(managerEmployees.size());
	}
}
