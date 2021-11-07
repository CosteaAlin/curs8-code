package ro.fasttractit.curs8.homework.student;

public class Student {
    private int grade;
    private String name;
    private static int SUM_OF_GRADES = 0;
    private static int NR_OF_STUDENTS = 0;

    public Student(String name, int grade) {
        this.name = name;
        if (checkGrade(grade)) {
            this.grade = grade;
            SUM_OF_GRADES += grade;
            NR_OF_STUDENTS++;
        } else {
            System.out.println("The grade must be between 0 and 100");
        }
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public static double getAverageGrades() {
        return SUM_OF_GRADES / NR_OF_STUDENTS;
    }

    private boolean checkGrade(int grade) {
        return grade > 0 && grade <= 100;
    }
}
