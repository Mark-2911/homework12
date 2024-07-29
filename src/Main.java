import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }


    public static void installationSystem(int os, int yearSystem) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && yearSystem == currentYear) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (os == 0 && yearSystem < currentYear) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (os == 1 && yearSystem == currentYear) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (os == 1 && yearSystem < currentYear) {
            System.out.println("Установите облеченную версию для Android по ссылке");
        }
    }

    public static void countDays(int deliveryDistance) {
        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                System.out.println("Доставка в радиусе " + deliveryDistance + " км " + " занимает один день.");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Доствка в радиусе " + deliveryDistance + " км " + " занимает два дня.");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Доставка в радиусе " + deliveryDistance + " км " + " занимает три дня.");
            } else if (deliveryDistance < 100) {
                System.out.println("На такое растояние доставка не осуществляется.");
            }
        }


    }

    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] years = new int[125];
        for (int i = 0; i <= years.length - 1; i++) {
            years[i] = (i + 1900);
        }
        for (final int i : years) {
            isLeap(i);
        }

        System.out.println("Задача 2");
        installationSystem(1, 2024);

        System.out.println("Задача 3");
        countDays(95);

    }
}














