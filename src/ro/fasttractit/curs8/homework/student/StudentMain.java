package ro.fasttractit.curs8.homework.student;

public class StudentMain {
    public static void main(String[] args) {
        Student first=new Student("Pop", 85);
        Student second= new Student("Ana",92);
        Student third=new Student("Adrian", 48);

        System.out.println(Student.getAverageGrades());
    }
}
