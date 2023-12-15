package Cau0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    private List<Student> students = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public StudentList() {
    }
    Student student1 = new Student(1, "Chiến", 9.3);
    Student student2 = new Student(2, "An Lục Văn", 8.0);
    Student student3 = new Student(3, "Lê Ân", 6.7);
    Student student4 = new Student(4, "Nghĩa Văn", 7.2);

    public void create(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println("Create success!");
    }
    public void display(){
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void update(){
        System.out.println("Enter id of student you want to update:");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Enter new name:");
                String name = scanner.next();
                System.out.println("Enter new mark:");
                double mark = scanner.nextDouble();
                student.setName(name);
                student.setMark(mark);
                System.out.println("Update success!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public void remove(){
        System.out.println("Enter id of student you want to remove:");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Remove success!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}