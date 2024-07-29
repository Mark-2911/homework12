public class Main {
    public static void isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    public static void installationSystem(int os, int yearSystem) {
        if ((os == 1) && (yearSystem < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((os == 1) && (yearSystem >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
        if ((os == 0) && (yearSystem < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if ((os == 0) && (yearSystem >= 2015)) {
            System.out.println("Установите версию приложения для iOS");
        }

    }

    public static void countDays(int deliveryDistance) {
        int days = -1;
        if (deliveryDistance <= 20) {
            days++;
            System.out.println("Доставка в радиусе " + deliveryDistance + " занимает один день");
        } else if (deliveryDistance <= 60) {
            days += 2;
            System.out.println("Доставка в радиусе " + deliveryDistance + " занимает два дня");
        } else if (deliveryDistance <= 100) {
            days += 3;
            System.out.println("Доставка в радиусе " + deliveryDistance + " занимает три дня");


        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет ");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] year = new int[125];
        for (int i = 0; i <= year.length - 1; i++) {
            year[i] = (i + 1900);
        }
        for (final int i : year) {
            isLeap(i);
        }
        System.out.println("Задача 2");

        installationSystem(1, 2015);

        System.out.println("Задача 3");

        countDays(101);


    }


}






























