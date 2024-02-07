public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int save = 15000;
        int month = 1;
        float depositPercent = 1.01F;
        float full = 0F;
        while (full < 2459000) {
            full = full * depositPercent;
            full = full + save;
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + full + " руб");
        }

        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        int t = 10;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (; t >= 1; ) {
            System.out.print(t-- + " ");
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int natality = 17;
        int mortality = 8;
        int difference = natality - mortality;
        int statisticalCriterion = 1000;
        int year = 10;
        for (int r = 1; r <= year; r++) {
            population = population + (population / statisticalCriterion * difference);
            System.out.println("Год " + r + " численность населения составляет " + population);
        }

        // Задача 4-5
        System.out.println("Задача 4-5");
        int deposit = 15000;
        int percent = 7;
        int sum = 12_000_000;
        int months = 1;
        for (;deposit <= sum; months++) {
                deposit = deposit / 100 * percent + deposit;
                if (months % 6 == 0) {
                    System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit + " рублей");
                }
        }
        System.out.println("Итого сумма накоплений равна " + deposit + " рублей");

        // Задача 6
        System.out.println("Задача 6");
        int depos = 15000;
        int percentage = 7;
        int term = 9;
        int mo = term * 12; // 108

        for (int d = 1; d <= mo; d++) {
            depos = depos / 100 * percentage + depos;
            if (d % 6 == 0) {
                System.out.println("Месяц " + d + ", сумма накоплений равна " + depos + " рублей");
            }
        }
        System.out.println("Итого сумма накоплений за 9 лет равна " + depos + " рублей");

        // Задача 7
        System.out.println("Задача 7");
        int friday = 5;
        int dayOfMonth = 31;
        int week = 7;
        for (;friday <= dayOfMonth;) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + week;
        }

        // Задача 8
        System.out.println("Задача 8");
        int nowYear = 2024;
        int yearOne = nowYear - 200;
        int yearTwo = nowYear + 100;
        for (int cometYear = yearOne; cometYear <= yearTwo; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
        }
    }

