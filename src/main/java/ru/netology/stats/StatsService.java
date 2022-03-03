package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int Sum = 0;

        for (int sale : sales) {
            Sum = Sum + sale;
        }
        return Sum;
    }

    public int avgSales(int[] sales) {
        int Sum = 0;

        for (int sale : sales) {
            Sum = Sum + sale;
        }
        return Sum / sales.length;
    }

    public int minAvg(int[] sales) {
        StatsService service = new StatsService();
        int countMounth = 0;
        int avg = service.avgSales(sales);

        for (int sale : sales) {
            if (sale <= avg) {
                countMounth = countMounth + 1;
            }
        }
        return countMounth;
    }

    public int maxAvg(int[] sales) {
        StatsService service = new StatsService();
        int countMounth = 0;
        int avg = service.avgSales(sales);

        for (int sale : sales) {
            if (sale >= avg) {
                countMounth = countMounth + 1;
            }
        }
        return countMounth;
    }
}
