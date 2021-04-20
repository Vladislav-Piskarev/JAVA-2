package Java_2.Lesson_3.HomeWork_3;

public class HomeWork_3_2 {

    public static void main(String[] args) {

        System.out.println("Создание справочника");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "8 888-111-11-11");
        phoneBook.add("Соколов", "8 888-222-22-22");
        phoneBook.add("Петров", "8 888-333-33-33");
        phoneBook.add("Иванов", "8 888-111-11-11");
        phoneBook.add("Сахаров", "8 888-444-11-11");
        phoneBook.add("Соколов", "8 888-555-55-55");

        System.out.println("\nПолучаем номера");
        System.out.println("Иванов");
        System.out.println(phoneBook.get("Иванов"));
        System.out.println("Соколов");
        System.out.println(phoneBook.get("Соколов"));
        System.out.println("Петров");
        System.out.println(phoneBook.get("Петров"));
        System.out.println("Сахаров");
        System.out.println(phoneBook.get("Сахаров"));

        System.out.println("\nОтсутствие записи");
        System.out.println("Попов");
        System.out.println(phoneBook.get("Попов"));

        System.out.println("\nСуществующий номер");
        phoneBook.add("Иванов", "8 888-111-11-11");
        System.out.println("Иванов");
        System.out.println(phoneBook.get("Иванов"));
    }
}
