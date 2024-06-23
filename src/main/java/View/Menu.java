package View;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private final Console console = new Console();

    public void displayMenu() {
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать документы");
            System.out.println("2. Отобразить документ");
            System.out.println("3. Обновить документы");
            System.out.println("4. Отобразить все документы");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    console.create();
                    break;
                case 2:
                    System.out.print("Введите ID документа для отображения: ");
                    int displayId = scanner.nextInt();
                    scanner.nextLine();  // consume the newline
                    console.displayDocument(displayId);
                    break;
                case 3:
                    console.updateDocuments();
                    break;
                case 4:
                    console.displayAllDocuments();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
}
