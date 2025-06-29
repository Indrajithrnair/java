import java.util.Scanner;

public class GradeCalculator
{

    public static String gradeCheck(int mark)
    {

        String grade = (mark >= 70) ? "A" : (mark >= 60 && mark < 70) ? "B" : "C";

        return grade;

    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");

        int marks = sc.nextInt();

        String grade = gradeCheck(marks);

        System.out.println("Grade is: " + grade);

    }
}