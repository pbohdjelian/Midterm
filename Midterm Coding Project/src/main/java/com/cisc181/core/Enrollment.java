package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
    private UUID SectionID;
    private UUID StudentID;
    private UUID EnrollmentID;
    private double grade;
   
    private Enrollment() {
 

}
    public Enrollment(UUID StudentID, UUID SectionID) {
    	this.StudentID=StudentID;
    	this.SectionID=SectionID;
    	UUID EnrollmentID= UUID.randomUUID();
    }

    public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade){
    	this.grade=grade;
    }
    }
