package Student;
import java.util.Scanner;
public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);
		Student note = new Student();
		
		
		System.out.print("Name: ");
		note.setName(sr.nextLine());
		
		System.out.print("Grade 1: ");
		note.setGrade1(sr.nextDouble());
		
		System.out.print("Grade 2: ");
		note.setGrade2(sr.nextDouble());
		
		System.out.print("Grade 3: ");
		note.setGrade3(sr.nextDouble());
		
		
		System.out.printf("FINAL NOTE: %.2f%n", note.finalNote());
		
		if(note.finalNote() < 60 ) {
			System.out.println("FAILED!");
			System.out.printf("MISSIND %.2f POINTS.", note.missingPoints());
		} else {
			System.out.println("PASS!");
		}
		
		sr.close();
	}

}
