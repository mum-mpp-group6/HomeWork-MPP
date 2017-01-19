package prob2A_external_constructorsetter;

// One Constructor and one setter method to create 1:1 relationship ->StudentAndReport Object

/** Typical use: Loading data from database into class model */
public class StudentGradeReportFactory {
	
	public static StudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name, g);
		g.setStudent(st);
		return new StudentAndReport(st, g);
	}
}
