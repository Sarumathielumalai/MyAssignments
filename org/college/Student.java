package org.college;

public class Student extends Department{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Sarumathi");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
        System.out.println("CSE");
	}
	public void studentId() {
		// TODO Auto-generated method stub
       System.out.println("123");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student obj= new Student();
       obj.collegeName();
       obj.collegeCode();
       obj.collegeRank();
       obj.collegeRank();
       obj.studentName();
       obj.studentDept();
       obj.studentId();
	}

}
