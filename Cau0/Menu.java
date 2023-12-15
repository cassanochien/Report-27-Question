package Cau0;

public class Menu {
    public static int getUserChoice() {
        int choice;
        System.out.println("Press 1: Create");
        System.out.println("Press 2: Display");
        System.out.println("Press 3: Remove");
        System.out.println("Press 4: Update");
        System.out.println("Press 5: Exit");
        System.out.println("Enter choice");
        choice = StudentList.scanner.nextInt();
        return choice;
    }
}
