
public class ResultProcessingSystem {
	public static void main(String[] args) {
		Result r1, r2, r3;

		System.out.println("Student 1 Result Details");
		r1 = new Result();
		r1.getStudentDetails();
		r1.getSubjectDetails();

		System.out.println();
		System.out.println("Student 2 Result Details");
		r2 = new Result();
		r2.getStudentDetails();
		r2.getSubjectDetails();

		System.out.println();
		System.out.println("Student 3 Result Details");
		r3 = new Result();
		r3.getStudentDetails();
		r3.getSubjectDetails();

		System.out.println();
		System.out.println("All Students Results");
		System.out.println();
		r1.printResults();
		r2.printResults();
		r3.printResults();

	}
}
/*
******************************************************************************
Output:
Student 1 Result Details
------------------------------------------------------
Enter Student name and Roll No: 
Adarsh
1
Enter subject-1 name and marks obtained: 
DSP
90
Enter subject-2 name and marks obtained: 
MCC
80
------------------------------------------------------

Student 2 Result Details
------------------------------------------------------
Enter Student name and Roll No: 
Akshay
2
Enter subject-1 name and marks obtained: 
DSP
74
Enter subject-2 name and marks obtained: 
MCC
62
------------------------------------------------------

Student 3 Result Details
------------------------------------------------------
Enter Student name and Roll No: 
Omkar
3
Enter subject-1 name and marks obtained: 
DSP
64
Enter subject-2 name and marks obtained: 
MCC
54
------------------------------------------------------


All Students Results


------------------------Result------------------------
------------------------------------------------------
Student Name: Adarsh	Roll no: 1
Subject 	Marks 	Grade
DSP			90		A
MCC			80		A
------------------------------------------------------
Total:		170		Excellent
------------------------------------------------------


------------------------Result------------------------
------------------------------------------------------
Student Name: Akshay	Roll no: 2
Subject 	Marks 	Grade
DSP			74		B
MCC			62		B
------------------------------------------------------
Total:		136		Good
------------------------------------------------------


------------------------Result------------------------
------------------------------------------------------
Student Name: Omkar	Roll no: 3
Subject 	Marks 	Grade
DSP			64		B
MCC			54		C
------------------------------------------------------
Total:		118		Satisfactory
------------------------------------------------------

******************************************************************************
*/