package com.demo.employeevacation.employee;

import org.springframework.stereotype.Component;

@Component
public class HourlyEmployee extends Employee {

	private static float maxVacationDays = 10;

	private float vacationDays = 0;

	private static float numberOfWorkdaysPerVacationDay = maxWorkDays / maxVacationDays;

	@Override
	void work(int daysWorked) {
		if (daysWorked <= 0 || daysWorked > maxWorkDays) {
			return;
		}
		setVacationDays(daysWorked / numberOfWorkdaysPerVacationDay);

	}

	@Override
	void takeVacation(float takeVacation) {

		float vacationLeft = getVacationDays() - takeVacation;
		if (vacationLeft < 0) {
			return;
		}

		setVacationDays(getVacationDays() - takeVacation);

	}

	public float getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(float vacationDays) {
		this.vacationDays = vacationDays;
	}

}
