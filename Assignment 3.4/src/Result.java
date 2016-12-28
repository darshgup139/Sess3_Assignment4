import java.util.Scanner;

public class Result {
	Scanner inputReader = new Scanner(System.in);
	String name, sub1, sub2, grade1, grade2, overAllGrade;
	int marks1, marks2, rollNo;
	// double sgpa, overAllSgpa;

	public Result(String name, String sub1, String sub2, String grade1, String grade2, String overAllGrade, int marks1,
			int marks2, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.overAllGrade = "E";

	}

	public Result() {
		this.name = null;
		this.rollNo = 0;
		this.sub1 = null;
		this.sub2 = null;
		this.marks1 = 0;
		this.marks2 = 0;
		this.grade1 = "E";
		this.grade2 = "E";
		this.overAllGrade = "E";
		// TODO Auto-generated constructor stub
	}

	void getStudentDetails() {
		System.out.println("------------------------------------------------------");
		System.out.println("Enter Student name and Roll No: ");
		this.name = inputReader.nextLine();
		this.rollNo = inputReader.nextInt();
		inputReader.nextLine();
	}

	public void getSubjectDetails() {
		System.out.println("Enter subject-1 name and marks obtained: ");
		sub1 = inputReader.nextLine();
		marks1 = inputReader.nextInt();
		while (marks1 > 100 || marks1 < 0) {
			System.out.println("Enter valid marks (0-100)");
			marks1 = inputReader.nextInt();
		}
		inputReader.nextLine();
		grade1 = marksToGrade(marks1);

		System.out.println("Enter subject-2 name and marks obtained: ");
		sub2 = inputReader.nextLine();
		marks2 = inputReader.nextInt();
		while (marks2 > 100 || marks2 < 0) {
			System.out.println("Enter valid marks (0-100)");
			marks2 = inputReader.nextInt();
		}
		inputReader.nextLine();
		grade2 = marksToGrade(marks2);
		overAllGrade = calcOverAllGrade(marks1, marks2);
		System.out.println("------------------------------------------------------");

	}

	public String marksToGrade(int marks) {
		String grade = null;
		if (marks < 0) {
			System.out.println("Invalid Marks");
		} else if (marks >= 75)
			grade = "A";
		else if (marks >= 60 && marks <= 74)
			grade = "B";
		else if (marks >= 50 && marks <= 59)
			grade = "C";
		else if (marks >= 40 && marks <= 49)
			grade = "D";
		else
			grade = "E";
		return grade;

	}

	public String calcOverAllGrade(int marks1, int marks2) {
		int totMarks = marks1 + marks2;
		String overAllGrade = null;
		if (totMarks < 0) {
			System.out.println("Invalid Marks");
		} else if (totMarks >= 180)
			overAllGrade = "Extra Ordinary";
		else if (totMarks >= 160 && totMarks <= 179)
			overAllGrade = "Excellent";
		else if (totMarks >= 120 && totMarks <= 159)
			overAllGrade = "Good";
		else if (totMarks >= 80 && totMarks <= 119)
			overAllGrade = "Satisfactory";
		else
			overAllGrade = "Unsatisfactory";
		return overAllGrade;
	}

	public void printResults() {
		System.out.println();
		System.out.println();
		System.out.println("------------------------Result------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("Student Name: " + name + "	Roll no: " + rollNo);
		System.out.println("Subject \tMarks \tGrade");
		System.out.println(sub1 + "" + "\t\t" + marks1 + "\t" + grade1);
		System.out.println(sub2 + "" + "\t\t" + marks2 + "\t" + grade2);
		System.out.println("------------------------------------------------------");
		System.out.println("Total:\t\t" + (marks1 + marks2) + "\t" + overAllGrade);
		System.out.println("------------------------------------------------------");
	}
}
