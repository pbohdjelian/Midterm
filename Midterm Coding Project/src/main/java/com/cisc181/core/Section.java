package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Section extends Course {
	private String courseName;
	private UUID CourseID;
    private UUID SemesterID;
    private UUID SectionID;
    private int RoomID;
    public Section(String courseName, UUID courseID, int gradePoints, UUID semesterID, UUID sectionID,
			int roomID) {
    	super(courseName, courseID, gradePoints);
	}
	public Section(String courseName, UUID courseID, int gradePoints) {
		super(courseName, courseID, gradePoints);
		// TODO Auto-generated constructor stub
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	}



