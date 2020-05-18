
public class StudentTester {
public static void main (String args[]) {
	Student s1 = new Student(111, "Taufiq", "1187050062", 4.0);
	System.out.println(s1);
	Student s2 = new Student(111, "Taufiq", "1187050062", 4.0);
	s2.setStudentId(222);
	s2.setName("Marion");
	s2.setSSN("118777777");
	s2.setGPA(3.0);
	System.out.println(s2);
	Student s3 = new Student(111, "Taufiq", "1187050062", 4.0);
	System.out.println(s3);
}
}
