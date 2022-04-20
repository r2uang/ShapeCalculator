package Main;

import Controller.Manager;
import Controller.Validation;

public class Main {
    public static void main(String[] args) {
        Validation val = new Validation();
        Manager manager = new Manager();
        while (true) {
            Menu();
            int choice = val.getInt("Enter your choice: ", "Option[0-4]", 0, 4);
            switch (choice) {
                case 1:
                    manager.calCircle();
                    break;
                case 2:
                    manager.calRectangle();
                    break;
                case 3:
                    manager.calTriangle();
                    break;
                case 4:
                    manager.calSquare();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    static void Menu() {
        System.out.println("---------------");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("0 . Exit");
        System.out.println("---------------");
    }
}
