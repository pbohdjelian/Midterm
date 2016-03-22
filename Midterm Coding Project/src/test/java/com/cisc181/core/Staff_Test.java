package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	public static Date Date(int year, int month, int day) {		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() throws PersonException {
		Staff Bob = new Staff("", "", "", null, "", "", "", "", 5000, 0, null, null);
		Staff Joe = new Staff("", "", "", null, "", "", "", "", 3000, 0, null, null);
		Staff James = new Staff("", "", "", null, "", "", "", "", 3000, 0, null, null);
		Staff John = new Staff("", "", "", null, "", "", "", "", 3000, 0, null, null);
		Staff Peter = new Staff("", "", "", null, "", "", "", "", 3000, 0, null, null);

		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(Bob);
		staff.add(Joe);
		staff.add(James);
		staff.add(John);
		staff.add(Peter);

		assertEquals((Bob.getSalary()) + (Joe.getSalary()) + (James.getSalary()) + (John.getSalary())
				+ (Peter.getSalary()) / 5, 4000, 4000);
	}

	@Test(expected = PersonException.class)
	public void test2() throws PersonException {
	Staff Staffnew = new Staff("", "", "", Date(1800, 1, 1), "", "12-345-6789", "", "", 5000, 0, null, null);

}
}
