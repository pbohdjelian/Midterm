package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Student_Test {
	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	Course Cisc106 = new Course("Cisc106", UUID.randomUUID(), 3);
	Course Calc242 = new Course("Calc242", UUID.randomUUID(), 4);
	Course Chem104 = new Course("Chem104", UUID.randomUUID(), 4);
	ArrayList<Course> Courses = new ArrayList<Course>(Arrays.asList(Cisc106, Calc242, Chem104));

	Semester Fall = new Semester(UUID.randomUUID(), Date(2015, 9, 1), Date(2015, 12, 17));
	Semester Spring = new Semester(UUID.randomUUID(), Date(2016, 2, 8), Date(2016, 5, 26));
	ArrayList<Semester> Semesters = new ArrayList<Semester>(Arrays.asList(Fall,Spring));

	Cisc106011=new Section(new Course(Cisc106.getCourseID(), Cisc106.getCourseName(), 3, eMajor.COMPSCI, Fall.getSemesterID(), UUID.randomUUID(), 101);
	Cisc106012=new Section(Cisc106.getCourseID(), Cisc106.getCourseName(), 3, eMajor.COMPSCI, Fall.getSemesterID(), UUID.randomUUID(), 101);
	Calc242011=new Section(Calc242.getCourseID(), Calc242.getCourseName(), 3, eMajor.COMPSCI, Fall.getSemesterID(), UUID.randomUUID(), 103);
	Calc242012=new Section(Calc242.getCourseID(), Calc242.getCourseName(), 3, eMajor.COMPSCI, Fall.getSemesterID(), UUID.randomUUID(), 103);
	Chem104011=new Section(Chem104.getCourseID(), Chem104.getCourseName(), 3, eMajor.CHEM, Fall.getSemesterID(), UUID.randomUUID(), 105);
	Chem104012=new Section(Chem104.getCourseID(), Chem104.getCourseName(), 3, eMajor.CHEM, Fall.getSemesterID(), UUID.randomUUID(), 105);
	ArrayList<Section> Sections=new ArrayList<Section>();
	Sections.add(Cisc106011);
	Sections.add(Cisc106012);
	Sections.add(Calc242011);
	Sections.add(Calc242012);
	Sections.add(Chem104011);
	Sections.add(Chem104012);
	

	Student Peter = new Student("Peter", "Aram", "Bohdjelian", Date(1996, 10, 26), eMajor.COMPSCI,
			"1224 Hazelwood Drive Fort Washington, PA", "215-285-5713", "pboh@udel.edu");
	Student Sam = new Student("Sam", null, "Bradford", Date(1987, 11, 8), eMajor.COMPSCI, "123 Main Street Newark, DE",
			"123-456-7890", "pboh@udel.edu");
	Student Chip = new Student("Chip", null, "Kelly", Date(1963, 11, 25), eMajor.COMPSCI, "123 Main Street Newark, DE",
			"123-456-7890", "pboh@udel.edu");
	Student Johnny = new Student("Johnny", null, "Manziel", Date(1992, 12, 6), eMajor.COMPSCI,
			"123 Main Street Newark, DE", "123-456-7890", "pboh@udel.edu");
	Student Marcus = new Student("Marcus", null, "Mariota", Date(1993, 10, 30), eMajor.COMPSCI,
			"123 Main Street Newark, DE", "123-456-7890", "pboh@udel.edu");
	Student Peyton = new Student("Peyton", null, "Manning", Date(1976, 3, 24), eMajor.COMPSCI,
			"123 Main Street Newark, DE", "123-456-7890", "pboh@udel.edu");
	Student Cam = new Student("Cam", null, "Newton", Date(1989, 5, 11), eMajor.COMPSCI, "123 Main Street Newark, DE",
			"123-456-7890", "pboh@udel.edu");
	Student Tom = new Student("Tom", null, "Brady", Date(1977, 8, 3), eMajor.COMPSCI, "123 Main Street Newark, DE",
			"123-456-7890", "pboh@udel.edu");
	Student Aaron = new Student("Aaron", null, "Rodgers", Date(1983, 12, 2), eMajor.COMPSCI,
			"123 Main Street Newark, DE", "123-456-7890", "pboh@udel.edu");
	Student Russell = new Student("Russell", null, "Wilson", Date(1988, 11, 29), eMajor.COMPSCI,
			"123 Main Street Newark, DE", "123-456-7890", "pboh@udel.edu");
	ArrayList<Student> Students = new ArrayList<Student>(
			Arrays.asList(Peter, Sam, Chip, Johnny, Marcus, Peyton, Cam, Tom, Aaron, Russell));

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() throws PersonException {
		Enrollment Peter = new Enrollment(Cisc106011.getSectionID(), Peter.getStudentID());
		Enrollment Sam = new Enrollment(Cisc106011.getSectionID(), Sam.getStudentID());
		Enrollment Chip = new Enrollment(Cisc106012.getSectionID(), Chip.getStudentID());
		Enrollment Johnny = new Enrollment(Cisc106012.getSectionID(), Johnny.getStudentID());
		Enrollment Marcus = new Enrollment(Calc242011.getSectionID(), Marcus.getStudentID());
		Enrollment Peyton = new Enrollment(Calc242011.getSectionID(), Peyton.getStudentID());
		Enrollment Cam = new Enrollment(Calc242012.getSectionID(), Cam.getStudentID());
		Enrollment Tom = new Enrollment(Calc242012.getSectionID(), Tom.getStudentID());
		Enrollment Aaron = new Enrollment(Chem104011.getSectionID(), Aaron.getStudentID());
		Enrollment Russell = new Enrollment(Chem104012.getSectionID(), Russell.getStudentID());
		ArrayList<Enrollment> Enrollments = new ArrayList<Enrollment>();
		Enrollments.add(Peter);
		Enrollments.add(Sam);
		Enrollments.add(Chip);
		Enrollments.add(Johnny);
		Enrollments.add(Marcus);
		Enrollments.add(Peyton);
		Enrollments.add(Cam);
		Enrollments.add(Tom);
		Enrollments.add(Aaron);
		Enrollments.add(Russell);

		Peter.setGrade(100);
		Sam.setGrade(100);
		Chip.setGrade(100);
		Johnny.setGrade(100);
		Marcus.setGrade(100);
		Peyton.setGrade(100);
		Cam.setGrade(100);
		Tom.setGrade(100);
		Aaron.setGrade(100);
		Russell.setGrade(100);
		
		assertEquals(Peter.getGrade()+Sam.getGrade()/2,100,100);
		assertEquals(Chip.getGrade()+Johnny.getGrade()/2,100,100);
		assertEquals(Marcus.getGrade()+Peyton.getGrade()/2,100,100);
		assertEquals(Cam.getGrade()+Tom.getGrade()/2,100,100);
		assertEquals(Aaron.getGrade()+Russell.getGrade()/2,100,100);
		
		setMajor(eMajor.PHYSICS);
		assertEquals(getMajor(),eMajor.PHYSICS);
	}

	private Object getMajor() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setMajor(eMajor physics) {
		// TODO Auto-generated method stub
		
	}
}