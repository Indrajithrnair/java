import java.util.Scanner;

class Student{

    private String name;
    private int marks;

    public Student(){
        this.name = "unknown";
        this.marks = 0;
    }

    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade(){
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public void displayResult(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Mark: " + this.marks);
        System.out.println("Student Grade: " + this.calculateGrade());
    }

    }

public class StudentRanker {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        Student s1 = new Student(name, marks);
        s1.displayResult();

    }
}
