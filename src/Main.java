public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();

    }


    public static void task1() {
        System.out.println("Задание 1");

        String lastName = "Ivanov ";
        String firstName = "Ivan ";
        String middleName = "Ivanovich.";


        String fullName = lastName + firstName + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

    }

    public static void task2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich.";

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задание 3");

        String fullName = " Иванов Семён Семёнович. ";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

}