package Cau0;

public class Main {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        int choice;
        while (true) {
            choice = Menu.getUserChoice();
            switch (choice) {
                case 1:
                    students.create();
                    break;
                case 2:
                    students.display();
                    break;
                case 3:
                    students.display();
                    students.remove();
                    break;
                case 4:
                    students.update();
                    break;
                case 5:
                    System.out.println("STOP!!!!");
                    return;
                default:
                    break;
            }
        }
    }
}
