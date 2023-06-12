public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i != 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача 8
        System.out.println("Задача 8");
        int storage = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + storage;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        System.out.println("Задача 9");
        int storage9 = 29000;
        int total9 = 0;
        for (int i = 1; i <= 12; i++) {
            total9 = total9 + total9 / 100;
            total9 = total9 + storage9;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total9 + " рублей");
        }
        //Задача 10
        System.out.println("Задача 10");
        int multiplier = 2;
        int product;
        for (int i = 1; i <= 10; i++) {
            product = multiplier * i;
            System.out.println("2*" + i +"=" + product);
        }
    }
}