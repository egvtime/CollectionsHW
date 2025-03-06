package Savarjisho2_3_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String lastName;
    private final HashMap<String, ArrayList<Integer>> StudentGrades = new HashMap<>();
    private final ArrayList<String> StudentLessons = new ArrayList<>();

    public Student(String lastName, String name, String id) {
        this.lastName = lastName;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void AddGrade(String Lesson, ArrayList<Integer> Grade){
        StudentLessons.add(Lesson);
        StudentGrades.put(Lesson, Grade);
    }

    public void ReplaceGrade(String Lesson, ArrayList<Integer> Grade){
        StudentLessons.add(Lesson);
        StudentGrades.replace(Lesson, Grade);
    }

    public void RemoveGrade(String Lesson, ArrayList<Integer> Grade){
        StudentLessons.add(Lesson);
        StudentGrades.remove(Lesson, Grade);
    }

    public HashMap<String, ArrayList<Integer>> getStudentGrades() {
        return StudentGrades;
    }

    public int getAverageGrade(){
        int AverageGrade = 0;
        int AmountOfGrades = 0;
        for(String lesson : StudentLessons){
            for(int Grade : StudentGrades.get(lesson)) {
                AverageGrade += Grade;
                AmountOfGrades++;
            }
        }
        return AverageGrade/AmountOfGrades;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getAverageGrade(), o.getAverageGrade());
    }

    public static void main(String[] args) {
        Student student = new Student("Demuria","Andria", "20060028");

        ArrayList<Integer> GeorgianGrades = new ArrayList<Integer>();

        GeorgianGrades.add(2);
        GeorgianGrades.add(4);
        GeorgianGrades.add(3);
        student.AddGrade("Georgian", GeorgianGrades);

        ArrayList<Integer> MathGrades = new ArrayList<Integer>();
        MathGrades.add(10);
        MathGrades.add(10);
        MathGrades.add(2);
        student.AddGrade("Math", MathGrades);

        System.out.println(student.getAverageGrade());
    }
}
