package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задача 1
        byte a = 5;
        short b = 31767;
        int c = 2_142_542_321;
        long d = 1_125_258_456_789_456_896L;
        float e = 3.14f;
        double f = 1.456;

        // Задача 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        var boxerWeight = boxerTwo + boxerOne;
        System.out.println("Общий вес " + boxerWeight + " кг");
        var boxerDifferent = boxerTwo - boxerOne;
        System.out.println("Разница в весе "+ boxerDifferent + " кг");


        // Задача 3
        short bananas = 80;
        bananas = 5 * 80;
        short milk = 105;
        milk = 2 * 105;
        short plombire = 100;
        plombire = 2 * 100;
        short eggs = 70;
        eggs = 4 * 70;
        float breakfast = bananas + milk + plombire + eggs;
        System.out.println("Вес завтрака " + breakfast + " грамм!");
        breakfast = breakfast / 1000;
        System.out.println("Вес " + breakfast + " кг!!");


        // Задача 4
        short needToLoseWeight = 7;
        needToLoseWeight = 7 * 1000;
        short canLoseForDay1 = 250;
        System.out.println("Нужно дней " + needToLoseWeight / canLoseForDay1);
        byte needsDays1 = 28;
        short canLoseForDay2 = 500;
        System.out.println("Нужно дней " + needToLoseWeight / canLoseForDay2);
        byte needsDays2 = 14;
        System.out.println("Среднее количество дней "+ (needsDays1 + needsDays2 ) / 2 );


        // Задача 5
        int mashaWasMonths = 67_760;
        float mashaDifferentMonths = mashaWasMonths * 0.1f;
        float mashaNewMonths = mashaWasMonths + mashaDifferentMonths;
        System.out.println("Маша теперь получает в месяц " + mashaNewMonths + " Годовой доход вырос на " + mashaDifferentMonths * 12 + " рублей");

        int denisWasMonths = 83_690;
        float denisDifferentMonths = denisWasMonths * 0.1f;
        float denisNewMonths = denisWasMonths + denisDifferentMonths;
        System.out.println("Денис теперь получает в месяц " + denisNewMonths + " Годовой доход вырос на " + denisDifferentMonths * 12 + " рублей");

        int krisWasMonths = 76_230;
        float krisDifferentMonths = krisWasMonths * 0.1f;
        float krisNewMonths = krisWasMonths + krisDifferentMonths;
        System.out.println("Кристина теперь получает в месяц " + krisNewMonths + " Годовой доход вырос на " + krisDifferentMonths * 12 + " рублей");











    }
}


