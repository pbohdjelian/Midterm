package com.cisc181.core;

import java.util.UUID;

public class Course {
    private String CourseName;
    private UUID CourseID;
    private int GradePoints;
    private String major;
	public Course(String courseName, UUID courseID, int gradePoints) {
		super();
		CourseName = courseName;
		CourseID = courseID;
		GradePoints = gradePoints;
		}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

}
