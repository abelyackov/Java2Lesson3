package Task2;

public class Task2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", 000000);
        phonebook.add("Иванов", 111111);
        phonebook.add("Петров", 22222);
        phonebook.add("Сидоров", 333333);
        phonebook.add("Иванов", 444444);
        phonebook.add("Иванов", 555555);
        phonebook.add("Смирнов", 666666);
        phonebook.add("Смирнов", 777777);
        phonebook.add("Петров", 888888);
        phonebook.add("Сидоров", 999999);

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Смирнов");
    }
}
